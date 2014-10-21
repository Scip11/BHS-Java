import java.util.*;
 
public class StringSelectionSortDemo
{
    public static void main(String[] args)
    {
        Vector b = new Vector();
        b.addElement("time");
        b.addElement("tide");
        b.addElement("clouds");
        b.addElement("rain"); 
 
        System.out.println("Vector values before sorting:");
        int i;
        for (i = 0; i < b.size(); i++)
            System.out.print(b.elementAt(i) + " ");
        System.out.println();
 
        StringSelectionSort.sort(b);
        System.out.println("Vector values after sorting:");
        for (i = 0; i < b.size(); i++)
            System.out.print(b.elementAt(i) + " ");
        System.out.println();
    }
}