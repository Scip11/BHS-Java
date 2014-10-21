import java.io.*;

public class TemperatureShow
{
   public static void main(String[] args)
   {
      try
      {
         DataInputStream inputStream =
               new DataInputStream(new FileInputStream(
                                           "temperatures"));
         double t;
       
         System.out.println(
                       "Numbers from the file temperatures:");
           
         try
         {
            while (true)
            {
               t = inputStream.readDouble();
               System.out.println(t); 
            }
         }
         catch(EOFException e)
         {
            //Do nothing
         }
 
         System.out.println("End of reading from file.");
         inputStream.close();
      }
      catch(IOException e)
      {
          System.out.println("Problem reading from file.");
      }
   }
}