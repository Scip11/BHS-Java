/***********************************
 *Class for sales associate records.
 ***********************************/
public class SalesAssociate
{
    private String name;
    private double sales;

    public SalesAssociate()
    {
        name = "No record";
        sales = 0;
    }

    public SalesAssociate(String initialName,
                          double initialSales)
    {
        set(initialName, initialSales);
    }

    public void set(String newName, double newSales)
    {
        name = newName;
        sales = newSales;
    }

    public void readInput()
    {
        System.out.print("Enter name of sales associates: ");
        name = SavitchIn.readLine();
        System.out.print("Enter associate's sales: $");
        sales = SavitchIn.readLineDouble();
    }

    public void writeOutput()
    {
        System.out.println("Sales associates: " + name);
        System.out.println("Sales: $" + sales);
    }

    public String getName()
    {
        return name;
    }

    public double getSales()
    {
        return sales;
    }
}