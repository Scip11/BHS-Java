import java.awt.*;//for the class Color used in an argument.

public class SecondWindowDemo
{
    /***********************************************************
     *Creates and displays two windows of the class SecondWindow.
     ***********************************************************/
    public static void main(String[] args)
    {
        SecondWindow window1 = new SecondWindow();
        window1.setVisible(true);

        SecondWindow window2 = new SecondWindow(Color.pink);
        window2.setVisible(true);
    }
}