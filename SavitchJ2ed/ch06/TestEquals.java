/*******************************************************************
 *This is just a demonstration program to see how equals and == work.
 *******************************************************************/
public class TestEquals
{
    public static void main(String[] args)
    {
        int[] a = new int[3]; int[] b = new int[3]; int i;
        for (i = 0; i < a.length; i++)
            a[i] = i;
        for (i = 0; i < b.length; i++)
            b[i] = i;
        if (b == a)
            System.out.println("Equal by ==.");
        else
            System.out.println("Not equal by ==.");
        if (equals(b,a))
            System.out.println("Equal by the equals method.");
        else
            System.out.println("Not equal by the equals method.");
    }
    
   public static boolean equals(int[] a, int[] b)
   {
       boolean match;
       if (a.length != b.length)
           match = false;
       else
       {
           match = true; //tentatively
           int i = 0;
           while (match && (i < a.length))
           {
               if (a[i] != b[i])
                   match = false;
               i++;
           }
       }
       return match;
    }
}
