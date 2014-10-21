public class DivideByZeroExceptionDemo
{
    private int numerator;
    private int denominator;
    private double quotient;


    public static void main(String[] args)
    {
        DivideByZeroExceptionDemo oneTime = 
                              new DivideByZeroExceptionDemo();
        oneTime.doIt();
    }

    public void doIt()
    {
        try
        {
            System.out.println("Enter numerator:"); 
            numerator = SavitchIn.readLineInt(); 
            System.out.println("Enter denominator:");
            denominator = SavitchIn.readLineInt();
            if (denominator == 0)
                throw new DivideByZeroException();
            quotient = numerator/(double)denominator;
            System.out.println(numerator + "/" 
                                 + denominator 
                                 + " = " + quotient);
        }
        catch(DivideByZeroException e)
        {
            System.out.println(e.getMessage());
            secondChance();
        }
        System.out.println("End of Program.");
    }

    public void secondChance()
    {
        System.out.println("Try Again:");   
        System.out.println("Enter numerator:"); 
        numerator = SavitchIn.readLineInt();
        System.out.println("Enter denominator:"); 
        System.out.println("Be sure the denominator is not zero.");
        denominator = SavitchIn.readLineInt();

        if (denominator == 0)
        {
            System.out.println("I cannot do division by zero.");
            System.out.println("Since I cannot do what you want,");
            System.out.println("the program will now end.");
            System.exit(0);
        }

        quotient = ((double)numerator)/denominator;
        System.out.println(numerator + "/" 
                                     + denominator 
                                     + " = " + quotient);
    }
}