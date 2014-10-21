/******************************************************
 *Class for a rectangular box to be drawn on the screen. 
 *Because each character is higher than it is wide, these
 *boxes will look higher than you might expect. Inherits
 *getOffset, setOffset, and drawAt from the class Figure.
 *******************************************************/
public class Box extends Figure
{
    private int height;
    private int width;
 
    public Box()
    {
        super();
        height = 0;
        width = 0;
    }
    
    public Box(int theOffset, int theHeight, int theWidth)
    {
        super(theOffset);
        height = theHeight;
        width = theWidth;
    }
      
    public void reset(int newOffset, int newHeight, int newWidth)
    {
        setOffset(newOffset);
        height = newHeight;
        width = newWidth;
    }
   
    /*************************************
     *Draws the figure at the current line.
     *************************************/
    public void drawHere()
    {
        drawHorizontalLine();
        drawSides();
        drawHorizontalLine();
    }

    private void drawHorizontalLine()
    {
        spaces(getOffset()); 
        int count; 
        for (count = 0; count < width; count++)
            System.out.print('-');
        System.out.println();        
    }

    private void drawSides()
    {
        int count;
        for (count = 0; count < (height - 2); count++)
            drawOneLineOfSides();
    }
    
    private void drawOneLineOfSides()
    {
        spaces(getOffset()); 
        System.out.print('|');
        spaces(width - 2);        
        System.out.println('|');
   }

    //Writes the indicated number of spaces.
    private static void spaces(int number)
    {
        int count; 
        for (count = 0; count < number; count++)
            System.out.print(' ');
    }
}

