import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class ColorChangeDemo extends JFrame implements ActionListener
{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;

    private JPanel colorPanel; 
    private Color panelColor;
    private int redValue = 0; 
    private int greenValue = 0; 
    private int blueValue = 0;

    public static void main(String[] args)
    {
        ColorChangeDemo gui = new ColorChangeDemo();
        gui.setVisible(true);
    }

    public ColorChangeDemo()
    {
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        setTitle("Color Change Demo");
        setSize(WIDTH, HEIGHT);
        addWindowListener(new WindowDestroyer());

        colorPanel = new JPanel();
        panelColor = new Color(0, 0, 0);
        colorPanel.setBackground(panelColor);
        contentPane.add(colorPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.white);
        buttonPanel.setLayout(new FlowLayout());

        JButton redButton = new JButton("More Red"); 
        redButton.setBackground(Color.red); 
        redButton.addActionListener(this);
        buttonPanel.add(redButton); 
        JButton greenButton = new JButton("More Green");
        greenButton.setBackground(Color.green); 
        greenButton.addActionListener(this);
        buttonPanel.add(greenButton);

        JButton blueButton = new JButton("More Blue");
        blueButton.setBackground(Color.blue); 
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) 
    {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("More Red"))
        {
            if (redValue <= 250)
                redValue = redValue + 5;
        }
        else if (actionCommand.equals("More Green"))
        {
            if (greenValue <= 250)
                greenValue = greenValue + 5;
        }
        else if (actionCommand.equals("More Blue"))
        {
            if (blueValue <= 250)
                blueValue = blueValue + 5;
        }
        else
            System.out.println("Unexplained Error");
 
        panelColor = new Color(redValue, greenValue, blueValue);
        colorPanel.setBackground(panelColor);
    }
} 