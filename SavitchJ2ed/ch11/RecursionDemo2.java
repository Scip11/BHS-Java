public class RecursionDemo2
{
    public static void main(String[] args)
    {
         System.out.println("Enter a nonnegative number:");
         int number = SavitchIn.readLineInt();
         System.out.println(number + " contains "
                             + numberOfZeros(number) + " zeros.");
    }

    /****************************************
     *Precondition: n >= 0
     *Returns the number of zero digits in n.
     ****************************************/
    public static int numberOfZeros(int n)
    {
        if (n == 0)
            return 1;
        else if (n < 10)//and not 0
            return 0;//0 for no zeros
        else if (n%10 == 0)
            return(numberOfZeros(n/10) + 1);
        else //n%10 != 0
            return(numberOfZeros(n/10));
    }
}