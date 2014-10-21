import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/********************************************************
 *Simple demonstration of putting buttons in a PinkJPanel.
 ********************************************************/
public class PinkJPanelDemo extends JFrame implements ActionListener
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    public static void main(String[] args)
    {
        PinkJPanelDemo guiWithPanel = new PinkJPanelDemo();
        guiWithPanel.setVisible(true);
    }

    public PinkJPanelDemo()
    {
        setSize(WIDTH, HEIGHT);
        addWindowListener(new WindowDestroyer());
        setTitle("Panel Demonstration");
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.blue);
        contentPane.setLayout(new BorderLayout());

        PinkJPanel buttonPanel = new PinkJPanel();

        buttonPanel.setLayout(new FlowLayout());

        JButton stopButton = new JButton("Red");
        stopButton.setBackground(Color.red);
        stopButton.addActionListener(this);
        buttonPanel.add(stopButton);

        JButton goButton = new JButton("Green");
        goButton.setBackground(Color.green);
        goButton.addActionListener(this);
        buttonPanel.add(goButton);

        contentPane.add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e)
    {
       Container contentPane = getContentPane();

       if (e.getActionCommand().equals("Red"))
            contentPane.setBackground(Color.red);
        else if (e.getActionCommand().equals("Green"))
           contentPane.setBackground(Color.green);
        else
            System.out.println("Error in button interface.");
    }
}