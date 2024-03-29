import java.io.*;

public class FileProcessor
{
    private DataInputStream inputStream = null;
    private DataOutputStream outputStream = null;

   /*********************************************************
     *Doubles the integers in one file and puts them in another file.
     *********************************************************/
    public static void main(String[] args)
    {
        FileProcessor twoTimer = new FileProcessor();
        twoTimer.connectToInputFile();
        twoTimer.connectToOutputFile();
        twoTimer.timesTwo();
        twoTimer.closeFiles();
        System.out.println("Numbers from input file");
        System.out.println("doubled and copied to output file.");
    }

    public void connectToInputFile()
    {
        String inputFileName = getFileName("Enter input file name:");
        try
        {
            inputStream =
              new DataInputStream(
                             new FileInputStream(inputFileName));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File " + inputFileName
                                       + " not found.");
            System.exit(0);
        }
    }

    public void connectToOutputFile()
    {
        String outputFileName = getFileName("Enter output file name:");
        try
        {
            outputStream = new DataOutputStream(
        new FileOutputStream(outputFileName));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error opening output file "
                                               + outputFileName);
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    private String getFileName(String prompt)
    {
        String fileName = null;
        System.out.println(prompt);
        fileName = SavitchIn.readLineWord();
        return fileName;
    }

    public void timesTwo()
    {
        int next;
        try
        {
            while (true)
            {
                next = inputStream.readInt();
                outputStream.writeInt(2*next);
            }
        }
        catch(EOFException e)
        {
            //Do nothing. This just ends the loop.
        }
        catch(IOException e)
        {
            System.out.println(
                   "Error: reading or writing files.");
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public void closeFiles()
    {
        try
        {
            inputStream.close();
            outputStream.close();
        }
        catch(IOException e)
        {
            System.out.println("Error closing files "
                                        + e.getMessage());
            System.exit(0);
        }
    }
}
