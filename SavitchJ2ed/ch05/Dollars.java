public class Dollars
{
    /***************************************************************
     *Outputs amount in dollars and cents notation. Rounds after two
     *decimal points. Does not advance to the next line after output.
     ***************************************************************/
    public static void write(double amount)
    {
        if (amount >= 0)
        {
            System.out.print('$');
            writePositive(amount);
        }
        else
        {
            double positiveAmount = -amount;
            System.out.print('$');
            System.out.print('-');
            writePositive(positiveAmount);
        }
    }

    //Precondition: amount >= 0;
    //Outputs amount in dollars and cents notation. Rounds
    //after two decimal points. Omits the dollar sign.
    private static void writePositive(double amount)
    {
        int allCents = (int)(Math.round(amount*100));
        int dollars = allCents/100;
        int cents = allCents%100; 
        
        System.out.print(dollars);
        System.out.print('.');
        if (cents < 10)
        {
            System.out.print('0');
            System.out.print(cents);
        }
        else
            System.out.print(cents);
    }


    /***********************************************************
     *Outputs amount in dollars and cents notation. Rounds after
     *two decimal points. Advances to the next line after output.
     ***********************************************************/
    public static void writeln(double amount)
    {
        write(amount);
        System.out.println();
    } 
}
