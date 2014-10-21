import java.io.*;

public class DataInputDemoImproved
{
    public static void main(String[] args)
    {
        try
        {
            DataInputStream inputStream = new DataInputStream(
                                  new FileInputStream("numbers.dat"));
            int n;
      
            System.out.println("Reading the nonnegative integers");
            System.out.println("in the file numbers.dat.");
            n = inputStream.readInt();
            while (n >= 0)
            {
                System.out.println(n);
                n = inputStream.readInt();
            }

            System.out.println("End of reading from file.");
            inputStream.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Cannot find file numbers.dat.");
        }
        catch(IOException e)
        {
            System.out.println("Problem with input from file numbers.dat.");
        }
    }
}