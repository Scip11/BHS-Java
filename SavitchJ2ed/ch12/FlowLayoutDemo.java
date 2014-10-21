
import javax.swing.*;
import java.awt.*;

/*****************************************************************
 *Simple demonstration of using a layout manager to arrange labels.
 *****************************************************************/
public class FlowLayoutDemo extends JFrame
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    /************************************************************
     *Creates and displays a window of the class BorderLayoutDemo.
     ************************************************************/
    public static void main(String[] args)
    {
        FlowLayoutDemo gui = new FlowLayoutDemo();
        gui.setVisible(true);
    }

    public FlowLayoutDemo()
    {
        setSize(WIDTH, HEIGHT);
        addWindowListener(new WindowDestroyer());
        setTitle("Layout Demonstration");
        Container content = getContentPane();

        content.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("First label here.");
        content.add(label1);
        JLabel label2 = new JLabel("Second label there.");
        content.add(label2);
        JLabel label3 = new JLabel("Third label anywhere.");
        content.add(label3);
    }
}




