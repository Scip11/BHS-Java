public class ExceptionDemo
{
    public static void main(String[] args)
    {
        int donutCount, milkCount;
        double donutsPerGlass; 
        

        try
        {
            System.out.println("Enter number of donuts:");
            donutCount = SavitchIn.readLineInt();

            System.out.println("Enter number of glasses of milk:");
            milkCount = SavitchIn.readLineInt();
                
            if (milkCount < 1)
               throw new Exception("Exception: No Milk!");
            
            donutsPerGlass = donutCount/(double)milkCount;
            System.out.println(donutCount + " donuts.");
            System.out.println(milkCount + " glasses of milk.");
            System.out.println("You have " + donutsPerGlass
                           + " donuts for each glass of milk.");
        }
 

        catch(Exception e) 
        {
            System.out.println(e.getMessage());
            System.out.println("Go buy some milk.");
        }
      
        System.out.println("End of program.");
    }
}

