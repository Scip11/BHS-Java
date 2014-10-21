/************************************************************************
 *An object of this class is a special kind of list. The list can only be
 *written from beginning to end. You can add to the end of the list, but
 *you cannot change individual entries. You can erase the entire list and
 *start over. No entry may appear more than once on the list. You can use
 *int variables as position markers into the list. Position markers are
 *similar to array indexes, but are numbered starting with 1.
 ************************************************************************/
public class OneWayNoRepeatsList
{
    public static int START_POSITION = 1;
    public static int DEFAULT_SIZE = 50;

    //entry.length is the total number of items you have room
    //for on the list. countOfEntries is the number of items 
    //currently on the list.
    private int countOfEntries;//can be less than entry.length.
    private String[] entry; 
    

    public OneWayNoRepeatsList(int maximumNumberOfEntries)
    {
        entry = new String[maximumNumberOfEntries];
        countOfEntries = 0; 
    }   

   
    /******************************************************
     *Creates an empty list with a capacity of DEFAULT_SIZE.
     ******************************************************/
    public OneWayNoRepeatsList()
    {
        entry = new String[DEFAULT_SIZE];
        countOfEntries = 0; 
    }

    /***********************************************************
     *Precondition: List is not full.
     *Postcondition:
     *If item was not on the list, it has been added to the list.
     ***********************************************************/
    public void addItem(String item)
    {
        if (! onList(item))
        {
            if (countOfEntries == entry.length)
            {
                System.out.println("Adding to a full list!");
                System.exit(0);
            }
            else
   
            {
                entry[countOfEntries] = item;
                countOfEntries++;
            }
        }//else do nothing. Item is already on the list.
    }
   
    public boolean full()
    {
        return (countOfEntries == entry.length);
    }
 
       public boolean empty()
    {
        return (countOfEntries == 0);
    }
 
    /**************************************************
     *If the argument indicates a position on the list,
     *then the entry at that specified position is returned;
     *otherwise, null is returned.
     ***************************************************/
    public String getEntryAt(int position)
    {
        if ((1 <= position) && (position <= countOfEntries))
            return entry[position - 1];
        else
            return null;
    }
    /*********************************************
     *Returns true if position is the index of the
     *last item on the list; otherwise, returns false.
     *********************************************/
    public boolean atLastEntry(int position)
    {
        return (position == countOfEntries);
    } 

    /**********************************************
     *Returns true if item is on the list;
     *otherwise, returns false. Does not differentiate 
     *between upper- and lowercase letters.
     *********************************************/
    public boolean onList(String item) 
    {
         boolean found = false;
         int i = 0;
         while ((! found) && (i < countOfEntries)) 
         {
             if (item.equalsIgnoreCase(entry[i]))
                 found = true;
             else
                 i++;
         }

        return found;
    }
           
    public int maximumNumberOfEntries()
    {
        return entry.length;
    }
       
    public int getNumberOfEntries()
    {
        return countOfEntries;
    } 
   
    public void eraseList()
    {
        countOfEntries = 0;
    }
}