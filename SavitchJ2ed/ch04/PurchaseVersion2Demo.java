public class PurchaseVersion2Demo
{
    public static void main(String[] args)
    {
        PurchaseVersion2 oneSale = new PurchaseVersion2();

        oneSale.readInput();
        oneSale.writeOutput();
        System.out.println("Cost each $" + oneSale.getUnitCost());
        System.out.println("Total cost $" + oneSale.getTotalCost());
    }
}