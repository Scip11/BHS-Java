import java.io.*;

public class TextFileOutputDemo
{
    public static void main(String[] args)
    {
        PrintWriter outputStream = null;
        try
        {
            outputStream =
                 new PrintWriter(new FileOutputStream("out.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error opening the file  out.txt.");
            System.exit(0);
        }

        System.out.println("Enter three lines of text:");
        String line = null;
        int count;
        for (count = 1; count <= 3; count++)
        {
            line = SavitchIn.readLine();
            outputStream.println(count + " " + line);
        }
        outputStream.close();
        System.out.println("Those lines were written to out.txt.");
    }
}