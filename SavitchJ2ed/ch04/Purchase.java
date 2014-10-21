/**************************************************************
 *Class for the purchase of one kind of item, such as 3 oranges.
 *Prices are set supermarket style, such as 5 for $1.25.
 **************************************************************/
public class Purchase
{
    private String name;
    private int groupCount;//Part of price, like the 2 in 2 for $1.99.
    private double groupPrice;
                      //Part of price, like the $1.99 in 2 for $1.99.
    private int numberBought;//Total number being purchased.

    public void setName(String newName)
    {
        name = newName;
    }

    /*********************************************************************
     *Sets price to groupCount pieces for $costForCount. E.g., 2 for $1.99.
     *********************************************************************/
    public void setPrice(int groupCount, double costForCount)
    {
        if ((groupCount <= 0) || (costForCount <= 0))
        {
            System.out.println("Error: Bad parameter in setPrice.");
            System.exit(0);
        }
        else
        {
            groupCount = groupCount;
            groupPrice = costForCount;
        }
    }

    public void setNumberBought(int number)
    {
        if (number <= 0)
        {
            System.out.println("Error: Bad parameter in setNumberBought.");
            System.exit(0);
        }
        else
            numberBought = number;
    }
    
    /****************************************************
     *Gets price and number being purchased from keyboard.
     ****************************************************/
    public void readInput()
    {
        System.out.println("Enter name of item you are purchasing:");
        name = SavitchIn.readLine();
        System.out.println("Enter price of item on two lines.");
        System.out.println("For example, 3 for $2.99 is entered as");
        System.out.println("3");
        System.out.println("2.99");
        System.out.println("Enter price of item on two lines, now:");
        groupCount = SavitchIn.readLineInt();
        groupPrice = SavitchIn.readLineDouble();

        while ((groupCount <= 0) || (groupPrice <= 0))
        {//Try again:
            System.out.println(
                   "Both numbers must be positive. Try again.");
            System.out.println("Enter price of item on two lines.");
            System.out.println(
                            "For example, 3 for $2.99 is entered as");
            System.out.println("3");
            System.out.println("2.99");
            System.out.println(
                          "Enter price of item on two lines, now:");
            groupCount = SavitchIn.readLineInt();
            groupPrice = SavitchIn.readLineDouble();
        }

        System.out.println("Enter number of items purchased:");
        numberBought = SavitchIn.readLineInt();

        while (numberBought <= 0)
        {//Try again:
            System.out.println(
                       "Number must be positive. Try again.");
            System.out.println("Enter number of items purchased:");
            numberBought = SavitchIn.readLineInt();
        }
    }
    
    /***************************************************
     *Outputs price and number being purchased to screen.
     ***************************************************/
    public void writeOutput()
    {
        System.out.println(numberBought + " " + name);
        System.out.println("at " + groupCount 
                                 + " for $" + groupPrice);
    }

    public String getName()
    {
        return name;
    }

    public double getTotalCost()
    {
        return ((groupPrice/groupCount)*numberBought);
    }

    public double getUnitCost()
    {
        return (groupPrice/groupCount);
    }

    public int getNumberBought()
    {
        return numberBought;
    }
}