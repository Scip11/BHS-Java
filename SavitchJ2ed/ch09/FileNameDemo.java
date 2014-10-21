import java.io.*;

public class FileNameDemo
{
   public static void main(String[] args)
   {
      String fileName = null;
      try
      {
         System.out.println("Enter file name:");
         fileName = SavitchIn.readLineWord();
         DataInputStream inputStream =
            new DataInputStream(new FileInputStream(fileName));
         int n;
         System.out.println("Reading the nonnegative integers");
         System.out.println("in the file " + fileName);
         n = inputStream.readInt();
         while (n >= 0)
         {
            System.out.println(n);
            n = inputStream.readInt();
         }
         System.out.println("End of reading from file.");
         inputStream.close();         
      }
      catch(IOException e)
      {
         System.out.println("Problem with output to file " + fileName);
      }
   }
}