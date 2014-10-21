import javax.swing.*;
import java.awt.*; 

/*******************************************************
 *A toy program to demonstrate the paintComponent method.
 *******************************************************/
public class PaintComponentDemo extends JFrame
{
    public static final int FRAME_WIDTH = 400;
    public static final int FRAME_HEIGHT = 400;

    public static void main(String[] args)
    {
        PaintComponentDemo w = new PaintComponentDemo();
        w.setVisible(true);
    }

    public PaintComponentDemo()
    {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        addWindowListener(new WindowDestroyer()); 
        setTitle("The Oval Is in a Panel");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        SamplePanel p = new SamplePanel();
        contentPane.add(p, BorderLayout.CENTER);
    }


    private class SamplePanel extends JPanel
    {
        public SamplePanel()
        {
            //Does nothing except create a JPanel.
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawOval(FRAME_WIDTH/4, FRAME_HEIGHT/4, 
                       FRAME_WIDTH/2, FRAME_HEIGHT/3);
        }
    }
}