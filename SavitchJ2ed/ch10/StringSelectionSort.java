import java.util.*;

/********************************************************
 *Class for sorting a vector of Strings lexicographically
 *(approximately alphabetically).
 ********************************************************/
 public class StringSelectionSort
 {
    /******************************************************************
     *Sorts the vector a so that a.elementAt(0), a.elementAt(1), . . . ,
     *a.elementAt(a.size() - 1) are in lexicographic order.
     ******************************************************************/
     public static void sort(Vector a)
     {
        int index, indexOfNextSmallest;
        for (index = 0; index < a.size() - 1; index++)
        {//Place the correct value in position index:
            indexOfNextSmallest = 
                            indexOfSmallest(index, a);
            interchange(index,indexOfNextSmallest, a);
            //a.elementAt(0), a.elementAt(1),...,
            //a.elementAt(index) are sorted. The rest of
            //the elements are in the remaining positions.
        }
     }
   
    /*********************************************************
     *Precondition: i and j are legal indexes for the vector a.
     *Postcondition: The values of a.elementAt(i) and
     *a.elementAt(j) have been interchanged.
     *********************************************************/
     private static void interchange(int i, int j, Vector a)
     {
        Object temp;
        temp = a.elementAt(i);
        a.setElementAt(a.elementAt(j), i);
        a.setElementAt(temp, j);
     }
    
    /*************************************************************
     *Returns the index of the lexicographically first value among
     *a.elementAt(startIndex), a.elementAt(startIndex+1),...,
     *a.elementAt(a.size() - 1)
     *************************************************************/
    private static int indexOfSmallest(int startIndex, Vector a)
    {
        String min = (String)a.elementAt(startIndex);
        int indexOfMin = startIndex;
        int index;
        for (index = startIndex + 1; index < a.size(); index++)
        if (((String)(a.elementAt(index))).compareTo(min) < 0)
        {
            min = (String)a.elementAt(index);
            indexOfMin = index;
        }
        return indexOfMin;
    }
}