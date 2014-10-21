import java.io.*;

public class FileNameExercise
{
   public static void main(String[] args)
   {
      String fileName = null;//to use fileName in catch-block,
                         //must declare it outside of try-block.
      try
      {
         System.out.println("Enter file name:");
         fileName = SavitchIn.readLineWord();
         DataInputStream inputStream =
            new DataInputStream(new FileInputStream(fileName));
 
         System.out.println("The first thing in the file");
         System.out.println(fileName + " is");
         String first = inputStream.readUTF();
         System.out.println(first); 
         inputStream.close();
      }
      catch(IOException e)
      {
         System.out.println("Problem with input from file "
                                + fileName);
      }
    }
}