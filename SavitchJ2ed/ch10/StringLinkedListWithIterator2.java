import java.util.*;

public class StringLinkedListWithIterator2 implements Iterator
{
    private ListNode head;
    private ListNode current;
    private ListNode previous; //follows current
    private ListNode twoBack; //follows previous
    private boolean removeSinceNext;//true if removed has been
                    //called since the last invocation of next.
                    //Also true if next has not been called at all.

    public StringLinkedListWithIterator2()
    {
        head = null;
        current = null;
        previous = null;
        twoBack = null;
        removeSinceNext = true;
    }

    /*****************************************************
     *Returns the next element (String) in the list.
     *Throws a NoSuchElementException if there is
     *no next element to return. You should invoke
     *resetIteration before the first invocation of next().
     *****************************************************/
    public Object next()
    {
        if (current != null)
        {
            twoBack = previous;
            previous = current;
            current = current.link;
            removeSinceNext = false;
            return (previous.data);
        }
        else
        {
            throw new NoSuchElementException();
        }
    }

   /********************************************************
    *Removes the last element that was returned by next.
    *Throws an IllegalStateException, if the next method has
    *not yet been called or if the remove method has already
    *been called after the last call to the next method.
    ********************************************************/
    public void remove()
    {
        if ((previous != null) && (twoBack != null)
             && (!removeSinceNext))
        {//remove node at previous
            twoBack.link = previous.link;
            previous = twoBack;
            removeSinceNext = true;
            //twoBack not updated until next invocation of next()
        }
        else if( (previous != null) && (twoBack == null)
             && (!removeSinceNext))
        {//previous at head node and current
         //at head node after deletion
            head = current;
            previous = null;
            twoBack = null;
            removeSinceNext = true;
        }
        else
        {
            throw new IllegalStateException();
        }
    }

    /**********************************************
     *Returns true if there is at least one more element
     *for next to return. Otherwise, returns false.
     **********************************************/
    public boolean hasNext()
    {
        return (current != null);
    }

    public void resetIteration()
    {
        current = head;
        previous = null;
        twoBack = null;
        removeSinceNext = true;
    }

    public String getDataAtCurrent()
                               throws LinkedListException
    {
        if (current != null)
            return (current.data);
        else
            throw new LinkedListException(
               "Getting data when current is not at any node.");
    }

    public void resetDataAtCurrent(String newData)
                              throws LinkedListException
    {
        if (current != null)
            current.data = newData;
        else
            throw new LinkedListException(
               "Setting data when current is not at any node.");
    }

    /*****************************************
     *Returns the number of nodes in the list.
     *****************************************/
    public int length()

    {
        int count = 0;
        ListNode position = head;
        while (position != null)
        {
            count++;
            position = position.link;
        }
        return count;
    }

    /*************************************************************
     *Inserts node with newData after the current node. The current
     *node is the same after invocation as it is before invocation.
     *the current node is the one that will NEXT be returned by next();
     *Should not be used with an empty list. Should not be
     *used when the current node has iterated past entire list.
     **************************************************************/
    public void insertNodeAfterCurrent(String newData)
                                 throws LinkedListException
    {
        ListNode newNode = new ListNode();
        newNode.data = newData;
        if (current != null)
        {
            newNode.link = current.link;
            current.link = newNode;
        }
        else if (head != null)
        {
            throw new LinkedListException(
                         "Inserting when iterator is past all"
                       + " nodes or uninitialized iterator.");
        }
        else
        {
            throw new LinkedListException(
                "Using insertNodeAfterCurrent with empty list");
        }
    }

    public void addANodeToStart(String addData)
    {
        head = new ListNode(addData, head);
        if (current == head.link && current != null)
        //if current is at old start node
            previous = head;
    }

    public boolean onList(String target)
    {
         return (Find(target) != null);
    }

    /********************************************************************
     *Finds the first node containing the target data, and returns a
     *reference to that node. If key is not in the list, null is returned.
     ********************************************************************/
    private ListNode Find(String target)
    {
        ListNode position;
        position = head;
        String dataAtPosition;
        while (position != null)
        {
            dataAtPosition = position.data;
            if (dataAtPosition.equals(target))
                return position;
            position = position.link;
        }
        return null;
    }

     public void showList()
    {
        ListNode position;
        position = head;
        ListNode dataAtPosition;
        while (position != null)
        {
            System.out.println(position.data);
            position = position.link;
        }
    }

    public String[] arrayCopy()
    {
        String[] a = new String[length()];

        ListNode position;
        position = head;
        int i = 0;
        while (position != null)
        {
            a[i] = position.data;
            i++;
            position = position.link;
        }

        return a;
    }


    private class ListNode
    {
        private String data;
        private ListNode link;

        public ListNode()
        {
            link = null;
            data = null;
        }

        public ListNode(String newData, ListNode linkValue)
        {
            data = newData;
            link = linkValue;
        }
    }
}