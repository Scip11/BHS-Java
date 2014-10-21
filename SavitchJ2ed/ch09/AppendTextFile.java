import java.io.*;

public class AppendTextFile
{
    public static void main(String[] args)
    {
        PrintWriter outputStream = null;
        try
        {
			System.out.println("Opening the file out.txt.");
			System.out.println("Enter A for append or N for a new file:");
			char ans = SavitchIn.readLineNonwhiteChar();
			boolean append = (ans == 'A' || ans == 'a');
			outputStream =
			        new PrintWriter(new FileOutputStream("out.txt", append));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error opening the file  out.txt.");
            System.exit(0);
        }

        System.out.println("Enter three lines of text:");
        String line = null;
        //Note that if you are appending the numbering starts over at 1.
        //So numbering in the file may start at 1 more than once.
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