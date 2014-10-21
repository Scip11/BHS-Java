public class IterativeDemo
{
    public static void main(String[] args)
    {
         System.out.println("Enter an integer:");
         int numeral = SavitchIn.readLineInt();
         System.out.println("The digits in that number are:");
         inWords(numeral);
         System.out.println();

         System.out.println("If you add ten to that number,");
         System.out.println("the digits in the new number are:");
         numeral = numeral + 10;
         inWords(numeral);
         System.out.println();
    }

    /*********************************************************
     *Precondition: numeral >= 0
     *Action: The digits in numeral are written out in words.
     ********************************************************/
    public static void inWords(int numeral)
    {
        int divisor = powerOfTen(numeral);
        int next = numeral;
        while (divisor >= 10)
        {
            System.out.print(digitWord(next/divisor) + " ");
            next = next%divisor;
            divisor = divisor/10;
        }

        System.out.print(digitWord(next/divisor) + " ");
    }

    /*********************************************************
     *Precondition: n >= 0. Returns the number of the form one
     *followed by all zeros that is the same length as n.
     ********************************************************/
    private static int powerOfTen(int n)
    {
        int result = 1;
        while(n >= 10)
        {
           result = result*10;
           n = n/10;
        }

        return result;
    }

    /*****************************************
     *Precondition: 0 <= digit <= 9
     *Returns the word for the argument digit.
     *****************************************/
    private static String digitWord(int digit)
    {
        String result = null;

        switch (digit)
        {
            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            default:
                System.out.println("Fatal Error.");
                System.exit(0);
                break;
        }
        return result;
    }
}
