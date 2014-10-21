public class BreakDemo
{
    public static void main(String[] args) 
    {
        int itemNumber;
        double amount, total;
        
        System.out.println("You may buy ten items, but");
        System.out.println("the total price must not exceed $100.");
        
        total = 0;
        for (itemNumber = 1; itemNumber <= 10; itemNumber++) 
        {
            System.out.print("Enter cost of item #" 
                                           + itemNumber + ": $");
            amount = SavitchIn.readLineDouble();
            total = total + amount;
            if (total >= 100)
            {
                System.out.println("You spent all your money.");
                break;
            }
            System.out.println("Your total so far is $" + total);
            System.out.println("You may purchase up to " 
                          + (10 - itemNumber) + " more items.");
        }

        System.out.println("You spent $" + total);
    }
}