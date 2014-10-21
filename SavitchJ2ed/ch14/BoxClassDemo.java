import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

/******************************************************************
 *Simple demonstration of Box container class and the use of struts
 *to separate components (in this case buttons). For an alternative
 *implementation see BoxLayoutDemo in Display 14.13/page 151.
 ******************************************************************/
public class BoxClassDemo extends JFrame implements ActionListener
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    public static final int HORIZONTAL_STRUT_SIZE = 15;
    public static final int VERTICAL_STRUT_SIZE = 10;

    private JPanel colorPanel;

    public BoxClassDemo()
    {
        setSize(WIDTH, HEIGHT);
        addWindowListener(new WindowDestroyer()); 
        setTitle("Box Demonstration"); 
        Container content = getContentPane(); 
        content.setLayout(new BorderLayout());

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.blue);
        content.add(colorPanel, BorderLayout.CENTER);

        //Horizontal buttons at bottom of frame:
        Box horizontalBox = Box.createHorizontalBox();

        Component horizontalStrut =
             Box.createHorizontalStrut(HORIZONTAL_STRUT_SIZE);
        horizontalBox.add(horizontalStrut);

        JButton hStopButton = new JButton("Red");
        hStopButton.addActionListener(this);
        horizontalBox.add(hStopButton);
        Component horizontalStrut2 =
             Box.createHorizontalStrut(HORIZONTAL_STRUT_SIZE);
        horizontalBox.add(horizontalStrut2);

        JButton hGoButton = new JButton("Green");
        hGoButton.addActionListener(this); 
        horizontalBox.add(hGoButton); 

        content.add(horizontalBox, BorderLayout.SOUTH);

        //Vertical buttons on right side of frame:
        Box verticalBox = Box.createVerticalBox();

        Component verticalStrut = Box.createVerticalStrut(VERTICAL_STRUT_SIZE); 
        verticalBox.add(verticalStrut);

        JButton vStopButton = new JButton("Red");
        vStopButton.addActionListener(this);
        verticalBox.add(vStopButton);

        Component verticalStrut2 = Box.createVerticalStrut(VERTICAL_STRUT_SIZE); 
        verticalBox.add(verticalStrut2);

        JButton vGoButton = new JButton("Green");
        vGoButton.addActionListener(this); 
        verticalBox.add(vGoButton);        

        content.add(verticalBox, BorderLayout.EAST);
    }

    public void actionPerformed(ActionEvent e) 
    {
       if (e.getActionCommand().equals("Red"))
            colorPanel.setBackground(Color.red);
        else if (e.getActionCommand().equals("Green"))
           colorPanel.setBackground(Color.green);
        else
            System.out.println("Error in button interface.");
    }

    public static void main(String[] args)
    {
        BoxClassDemo gui = new BoxClassDemo();
        gui.setVisible(true);
    }
}
