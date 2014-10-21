public class OutputFormat
{
    /*************************************************
     *Writes out number with digitsAfterPoint digits after
     *the decimal point. Round any extra digits.
     *Does not advance to the next line after output.
     ************************************************/
    private static void write(double number,
                                 int digitsAfterPoint)
    {
        if (number >= 0)
            writePositive(number, digitsAfterPoint);
        else
        {
            double positiveNumber = -number;
            System.out.print('-');
            writePositive(positiveNumber, digitsAfterPoint);
        }
    }

    //Precondition: number >= 0
    //Writes out number with digitsAfterPoint digits after the
    //decimal point. Rounds any extra digits.
    private static void writePositive(double number,
                                          int digitsAfterPoint)
    {
        int mover = (int)(Math.pow(10, digitsAfterPoint));
                  //1 followed by digitsAfterPoint zeros
        int allWhole;//number with the decimal point
                     //moved digitsAfterPoint places
        allWhole = (int)(Math.round(number*mover));
        int beforePoint = allWhole/mover;
        int afterPoint = allWhole%mover;

        System.out.print(beforePoint);
        System.out.print('.');
        writeFraction(afterPoint, digitsAfterPoint);
    }

    //Outputs the integer afterPoint with enough 0s
    //in front to make it digitsAfterPoint digits long.
    private static void writeFraction(int afterPoint,
                                       int digitsAfterPoint)
    {
        int n = 1;
        while (n < digitsAfterPoint)
        {
            if (afterPoint < Math.pow(10, n))
                System.out.print('0');
            n = n + 1;
        }
        System.out.print(afterPoint);
    }

    /************************************************
     *Writes out number with digitsAfterPoint digits after
     *the decimal point. Rounds any extra digits.
     *Advances to the next line after output.
     ************************************************/
    public static void writeln(double number,
                                       int digitsAfterPoint)
    {
       write(number, digitsAfterPoint);
       System.out.println();
    }
}