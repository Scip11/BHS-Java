/************************************************************
 *Class for sorting an array of ints from smallest to largest.
 ************************************************************/
public class SelectionSort
{
    /**************************************************
     *Precondition:
     *Every indexed variable of the array a has a value.
     *Action: Sorts the array a so that
     *a[0] <= a[1] <= ... <= a[a.length - 1].
     **************************************************/
    public static void sort(int[] a)
    {
        int index, indexOfNextSmallest;
        for (index = 0; index < a.length - 1; index++)
        {//Place the correct value in a[index]:
            indexOfNextSmallest = indexOfSmallest(index, a);
            interchange(index,indexOfNextSmallest, a);
            //a[0] <= a[1] <=...<= a[index] and these are the
            //smallest of the original array elements.
            //The remaining positions contain the rest of
            //the original array elements.
        }
    }
    

    /********************************************************
     *Precondition: i and j are legal indexes for the array a.
     *Postcondition:
     *The values of a[i] and a[j] have been interchanged.
     ********************************************************/
    private static void interchange(int i, int j, int[] a)
    {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;//original value of a[i]
    }


    /**************************************************
     *Returns the index of the smallest value among
     *a[startIndex], a[startIndex+1], ... a[a.length-1]
     **************************************************/
    private static int indexOfSmallest(int startIndex, int[] a)
    {
        int min = a[startIndex];
        int indexOfMin = startIndex;
        int index;
        for (index = startIndex + 1; index < a.length; index++)
            if (a[index] < min)
            {
                min = a[index];
                indexOfMin = index;
                //min is the smallest of a[startIndex] through a[index]
            }

        return indexOfMin;
    }
}

