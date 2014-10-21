import java.io.*;

/**************************************************************
 *Program to store species records in a file and/or display all
 *the records in a file on a terminal screen.
 *************************************************************/
public class FileServer
{
    public static void main(String[] args)
    {
        SpeciesFiler filer = new SpeciesFiler();
        System.out.print("This program can build and");
        System.out.println(" display files of species records.");
 
        char ans;
        boolean done = false;
        do
        {
            System.out.print("Enter choice: ");
            System.out.println(
                   "B to build a file. V to view a file. Q to quit.");
            ans = SavitchIn.readLineNonwhiteChar();
            switch (ans)
            {
                case 'B':
                case 'b':
                    filer.buildAFile();
                    break;
                case 'V':
                case 'v':
                    filer.viewAFile();
                    break;
                case 'Q':
                case 'q':
                    done = true;
                    break;
                default:
                    System.out.println("That is not a valid choice.");
                    break;
            }
       }while ( ! done);
       System.out.println("File service closing down.");
    }
}
