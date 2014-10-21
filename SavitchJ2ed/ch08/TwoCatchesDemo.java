public class TwoCatchesDemo
{
   public static void main(String[] args)
   {
      try
      {
         int jemHadar, klingons;
         double portion;
         
         System.out.println("Enter number of Jem Hadar warriors:");
         jemHadar = SavitchIn.readLineInt();
         if (jemHadar < 0)
             throw new NegativeNumberException("Jem Hadar");
         System.out.println("How many Klingon warriors do you have?");
         klingons = SavitchIn.readLineInt();
         if (klingons < 0)
             throw new NegativeNumberException("Klingons");
 
         portion = exceptionalDivision(jemHadar, klingons);
         System.out.println("Each Klingon must fight " 
                                      + portion + " Jem Hadar.");
      }
      catch(DivideByZeroException e)
      {
         System.out.println("Today is a good day to die.");
      }
      catch(NegativeNumberException e)
      {
         System.out.println("Cannot have a negative number of "
                             + e.getMessage());
      }

      System.out.println("End of program.");
   }
   
   public static double exceptionalDivision(double numerator, 
                   double denominator) throws DivideByZeroException
   {
       if (denominator == 0)
             throw new DivideByZeroException();
       return (numerator/denominator);
   }
}