import java.io.*;

public class OpenFileDemo
{
   public static void main(String[] args)
   {
      try
      {
         DataOutputStream outputStream = openFile();
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
         System.out.println("Problem with output to file.");
      }
   }


   public static DataOutputStream openFile() throws IOException
   {
       DataOutputStream tempStreamName;
       System.out.println("Enter file name:");
       String fileName = SavitchIn.readLineWord();
       tempStreamName =
            new DataOutputStream(new FileOutputStream(fileName));
       return tempStreamName;
}

}