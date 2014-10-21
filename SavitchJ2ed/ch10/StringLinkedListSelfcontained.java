
public class StringLinkedListSelfcontained
{
    private ListNode head;

    public StringLinkedListSelfcontained()
    {
        head = null;
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

    /*****************************************************************
     *Adds a node at the start of the list. The added node has addData
     *as its data. The added node will be the first node in the list.
     *****************************************************************/
    public void addANodeToStart(String addData)
    {
        head = new ListNode(addData, head);
    }

     public void deleteHeadNode()
    {
        if (head != null)
        {
            head = head.link;
        }
        else
        {
            System.out.println("Deleting from an empty list.");
            System.exit(0);
        }
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