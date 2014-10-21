import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*********************************************************
 *Simple demonstration of using drawString to display text.
 *********************************************************/
public class DrawStringDemo extends JFrame
                            implements ActionListener
{
    public static final int WIDTH = 350;
    public static final int HEIGHT = 200;
    public static final int X_START = 20;
    public static final int Y_START = 100;
    public static final int POINT_SIZE = 24;
 
    private String theText = "Push a button!";

    public static void main(String[] args)
    {
        DrawStringDemo w = new DrawStringDemo();
        w.setVisible(true);
    }

    public DrawStringDemo()
    {
        setSize(WIDTH, HEIGHT);
        Container contentPane = getContentPane();

        addWindowListener(new WindowDestroyer()); 
        setTitle("drawString Demonstration");
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        Button helloButton = new Button("Hello"); 
        helloButton.addActionListener(this);
        buttonPanel.add(helloButton);
        Button byeButton = new Button("Goodbye");
        byeButton.addActionListener(this); 
        buttonPanel.add(byeButton); 
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        Font f = 
            new Font("Serif", Font.BOLD|Font.ITALIC, POINT_SIZE);
        g.setFont(f);
        g.drawString(theText, X_START, Y_START);
    }

    public void actionPerformed(ActionEvent e) 
    {
       if (e.getActionCommand().equals("Hello"))
            theText = "How are you."; 
        else if (e.getActionCommand().equals("Goodbye"))
            theText = "It was good talking with you.";
        else
            theText = "Error in button interface.";

       repaint();
    }
}
