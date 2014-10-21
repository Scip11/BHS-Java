
import javax.swing.*;
import java.awt.*;

/*****************************************************************
 *Simple demonstration of using a layout manager to arrange labels.
 *****************************************************************/
public class GridLayoutDemo extends JFrame
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    /************************************************************
     *Creates and displays a window of the class BorderLayoutDemo.
     ************************************************************/
    public static void main(String[] args)
    {
        GridLayoutDemo gui = new GridLayoutDemo();
        gui.setVisible(true);
    }

    public GridLayoutDemo()
    {
        setSize(WIDTH, HEIGHT);
        addWindowListener(new WindowDestroyer());
        setTitle("Layout Demonstration");
        Container content = getContentPane();

        content.setLayout(new GridLayout(2, 3));
        JLabel label1 = new JLabel("First");
        content.add(label1);
        JLabel label2 = new JLabel("Second");
        content.add(label2);
        JLabel label3 = new JLabel("Third");
        content.add(label3);
        JLabel label4 = new JLabel("");//Empty string label
        content.add(label4);
        JLabel label5 = new JLabel("Fifth");
        content.add(label5);
    }
}




