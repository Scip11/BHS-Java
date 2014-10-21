import java.io.*;

public class BinaryAppend
{
   public static void main(String[] args)
   {
      try
      {
         System.out.println("Opening the file numbers.dat.");
		 System.out.println("Enter A for append or N for a new file:");
		 char ans = SavitchIn.readLineNonwhiteChar();
		 boolean append = (ans == 'A' || ans == 'a');
		 DataOutputStream outputStream =
		    new DataOutputStream(
                new FileOutputStream("numbers.dat", append));

         int n;

         System.out.println("Enter nonnegative integers, one per line.");
         System.out.println("Place a negative number at the end.");

         do
         {
            n = SavitchIn.readLineInt();
            outputStream.writeInt(n);
         }while (n >= 0);

         System.out.println("Numbers and sentinel value");
         System.out.println("written to the file numbers.dat.");
         outputStream.close();
      }
      catch(IOException e)
      {
         System.out.println("Problem with output to file numbers.dat.");
      }
   }
}
