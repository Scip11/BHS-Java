/*******************************************************
 *This class is used in the program LocalVariablesDemoProgram.
 *******************************************************/
public class BankAccount
{
    public void showNewBalance()
    {
        double newAmount = amount + (rate/100.0)*amount;
        System.out.println("With interest added the new amount is $"
                                         + newAmount);
    }

    public double amount;
    public double rate;
}




