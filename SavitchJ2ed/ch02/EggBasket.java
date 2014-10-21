public class EggBasket
{
    public static void main(String[] args)
    {
        int numberOfBaskets, eggsPerBasket, totalEggs;
       
        System.out.println("Enter the number of eggs in each basket:");
        eggsPerBasket = SavitchIn.readLineInt(); 
        System.out.println("Enter the number of baskets:");
        numberOfBaskets = SavitchIn.readLineInt();

        totalEggs = numberOfBaskets * eggsPerBasket;

        System.out.println(eggsPerBasket + " eggs per basket.");
        System.out.println(numberOfBaskets + " baskets."); 
        System.out.println("Total number of eggs is " + totalEggs);
       
        eggsPerBasket = eggsPerBasket - 2;
        totalEggs = numberOfBaskets * eggsPerBasket;

        System.out.println("Now we take two eggs out of each basket.");
        System.out.println(eggsPerBasket + " eggs per basket.");
        System.out.println(numberOfBaskets + " baskets."); 
        System.out.println("Total number of eggs is " + totalEggs);

        System.out.println("Press enter key to end program.");
        String junk;
        junk = SavitchIn.readLine();
    } 
}