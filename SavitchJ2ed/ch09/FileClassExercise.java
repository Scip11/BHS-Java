import java.io.*;

public class FileClassExercise
{
    public static void main(String[] args)
    {
        String name = null;
        File fileObject = null;

        System.out.print("Enter a file name and I will ");
        System.out.println("tell you if it exists.");
        name = SavitchIn.readLineWord();
        fileObject = new File(name);

        if (fileObject.exists())
        {
            System.out.println("I found the file " + name);
            System.out.println("Delete the file? (y/n)");
            char ans = SavitchIn.readLineNonwhiteChar();
            if ((ans == 'y') || (ans == 'Y'))
            {
                System.out.println(
                             "If you delete the file " + name);
                System.out.println(
                              "all data in the file will");
                System.out.println("be lost. Delete? (y/n)");
                ans = SavitchIn.readLineNonwhiteChar();
                if ((ans == 'y') || (ans == 'Y'))
                {
                    if (fileObject.delete())
                          System.out.println("File deleted.");
                     else
                          System.out.println(
                                      "Cannot delete file.");
                }
                else
                    System.out.println("File not deleted.");
            }
            else
                System.out.println("File not deleted.");
        }
        else
            System.out.println("I cannot find " + name);
    }
}