public class RecursionDemo
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
        if (numeral < 10)
            System.out.print(digitWord(numeral) + " ");
        else //numeral has two or more digits
        {
            inWords(numeral/10);
            System.out.print(digitWord(numeral%10) + " ");
        }
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