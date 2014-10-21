public class DollarsDriver
{
    public static void main(String[] args)
    {
        double amount;
        char ans;

        System.out.println("Testing Dollars.write:");
        do
        {
            System.out.println("Enter a value of type double:");
            amount = SavitchIn.readLineDouble();
            Dollars.write(amount);
            System.out.println();
            System.out.println("Test again?(y/n)");
            ans = SavitchIn.readLineNonwhiteChar();
        }while ((ans == 'y') || (ans == 'Y'));
        System.out.println("End of test.");
    }
}

