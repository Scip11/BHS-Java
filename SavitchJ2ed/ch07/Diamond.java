/************************************************************
 *Class for diamonds to be drawn on screen. For this class, a
 *diamond is completely determined by its diameter.
 *(Screen character spacing determines the rest of the figure.)
 *Inherits getOffset, setOffset, and drawAt from Figure.
 ************************************************************/
public class Diamond extends Figure
{
   private int diameter;

   public Diamond()
    {
        super();
        diameter = 0;
    }

    public Diamond(int theOffset, int theDiameter)
    {
        super(theOffset);
        diameter = theDiameter;
    }

    public void reset(int newOffset, int newDiameter)
    {
        setOffset(newOffset);
        diameter = newDiameter;
    }

    /*************************************
     *Draws the figure at the current line.
     *************************************/
    public void drawHere()
    {
        drawTop();
        drawBottom();
    }

    public void drawTop()
    {
        int startOfLine = getOffset() + (diameter/2);
        spaces(startOfLine);
        System.out.println('*');
        int count;
        int lineCount = (diameter/2) - 1;
        int insideWidth = 1;
        for (count = 0; count < lineCount; count++)
        {
            startOfLine--;
            spaces(startOfLine);
            System.out.print('*');
            spaces(insideWidth);
            System.out.println('*');
            insideWidth = insideWidth + 2;
        }
    }

    public void drawBottom()
    {
        int startOfLine = getOffset();
        int count;
        int lineCount = (diameter/2);
        int insideWidth = 2*lineCount - 1;
        for (count = 0; count < lineCount; count++)
        {

            spaces(startOfLine);
            System.out.print('*');
            spaces(insideWidth);
            System.out.println('*');
            insideWidth = insideWidth - 2;
            startOfLine++;
        }
        spaces(startOfLine);
        System.out.println('*');
    }

    //Writes the indicated number of spaces.
    private static void spaces(int number)
    {
        int count;
        for (count = 0; count < number; count++)
            System.out.print(' ');
    }
}