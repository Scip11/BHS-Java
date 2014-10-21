import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/***************************************************************
 *Simple demonstration of BoxLayout manager class and the use of
 *glue to separate components (in this case buttons).
 ***************************************************************/
public class GlueDemo extends JFrame
                           implements ActionListener
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    public static final int HORIZONTAL_STRUT_SIZE = 15;
    public static final int VERTICAL_STRUT_SIZE = 10;

    private JPanel colorPanel;

    public GlueDemo()
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
        JPanel horizontalPanel = new JPanel();
        horizontalPanel.setLayout(
              new BoxLayout(horizontalPanel, BoxLayout.X_AXIS));

        Component horizontalStrut = Box.createHorizontalStrut(HORIZONTAL_STRUT_SIZE);
        horizontalPanel.add(horizontalStrut);

        JButton hStopButton = new JButton("Red");
        hStopButton.addActionListener(this);
        horizontalPanel.add(hStopButton);

        Component horizontalGlue = Box.createHorizontalGlue();
        horizontalPanel.add(horizontalGlue);

        JButton hGoButton = new JButton("Green");
        hGoButton.addActionListener(this);
        horizontalPanel.add(hGoButton);

        Component horizontalStrut2 = Box.createHorizontalStrut(HORIZONTAL_STRUT_SIZE);
        horizontalPanel.add(horizontalStrut2);

        content.add(horizontalPanel, BorderLayout.SOUTH);

        //Vertical buttons on right side of frame:
        JPanel verticalPanel = new JPanel();
        verticalPanel.setLayout(
              new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));

        Component verticalStrut =
              Box.createVerticalStrut(VERTICAL_STRUT_SIZE);
        verticalPanel.add(verticalStrut);

        JButton vStopButton = new JButton("Red");
        vStopButton.addActionListener(this);
        verticalPanel.add(vStopButton);

        Component verticalStrut2 =
              Box.createVerticalStrut(VERTICAL_STRUT_SIZE);
        verticalPanel.add(verticalStrut2);

        JButton vGoButton = new JButton("Green");
        vGoButton.addActionListener(this);
        verticalPanel.add(vGoButton);

        content.add(verticalPanel, BorderLayout.EAST);
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
        GlueDemo gui = new GlueDemo();
        gui.setVisible(true);
    }
}