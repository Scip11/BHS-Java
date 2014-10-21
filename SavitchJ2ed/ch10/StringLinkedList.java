public class StringLinkedList
{
    private ListNode head;

    public StringLinkedList()
    {
        head = null;
    }

    /*************************************
     *Returns the number of nodes in the list.
     *************************************/
    public int length()
    {
        int count = 0;
        ListNode position = head;
        while (position != null)
        {
            count++;
            position = position.getLink();
        }
        return count;
    }

    /*************************************************************
     *Adds a node at the start of the list. The added node has addData
     *as its data. The added node will be the first node in the list.
     *************************************************************/
    public void addANodeToStart(String addData)
    {
        head = new ListNode(addData, head);
    }

    public void deleteHeadNode()
    {
        if (head != null)
        {
            head = head.getLink();
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

    /***********************************************************
     *Finds the first node containing the target data, and returns a
     *reference to that node. If target is not in the list, null is returned
     ***********************************************************/
    private ListNode Find(String target)
    {
        ListNode position;
        position = head;
        String dataAtPosition;
        while (position != null)
        {
            dataAtPosition = position.getData();
            if (dataAtPosition.equals(target))
                return position;
            position = position.getLink();
        }
        return null; 
    }

    public void showList()
    {
        ListNode position;
        position = head;
        while (position != null)
        {
            System.out.println(position.getData());
            position = position.getLink();
        }
    }
}

