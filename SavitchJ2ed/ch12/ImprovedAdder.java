import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/****************************************************
 *GUI for totaling a series of numbers. If the user
 *tries to add in a number in an incorrect format,
 *such as 2,000 with a comma, then an error message is
 *generated and the user can restart the computation.
 ***************************************************/
public class ImprovedAdder extends JFrame
                            implements ActionListener
{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;

    private JTextField inputOutputField;
    private double sum = 0;

    public static void main(String[] args)
    {
        ImprovedAdder guiAdder = new ImprovedAdder();
        guiAdder.setVisible(true);
    }

    public ImprovedAdder()
    {
        setTitle("Adding Machine");
        addWindowListener(new WindowDestroyer());
        setSize(WIDTH, HEIGHT);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.gray);
        buttonPanel.setLayout(new FlowLayout()); 
        JButton addButton = new JButton("Add"); 
        addButton.addActionListener(this);
        buttonPanel.add(addButton); 
        JButton resetButton = new JButton("Reset"); 
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        JPanel textPanel = new JPanel(); 
        textPanel.setBackground(Color.blue); 
        textPanel.setLayout(new FlowLayout()); 

        inputOutputField = new JTextField("Numbers go here.", 30);
        inputOutputField.setBackground(Color.white);
        textPanel.add(inputOutputField);
        contentPane.add(textPanel, BorderLayout.CENTER);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            tryingCorrectNumberFormats(e);
        }
        catch (NumberFormatException e2)
        {
            inputOutputField.setText("Error: Reenter Number.");
        }
    }

    //This method can throw NumberFormatExceptions.
    public void tryingCorrectNumberFormats(ActionEvent e)
    {
        if (e.getActionCommand().equals("Add"))
        {
            sum = sum +
                  stringToDouble(inputOutputField.getText());
            inputOutputField.setText(Double.toString(sum));
        }
        else if (e.getActionCommand().equals("Reset"))
        {
            sum = 0;
            inputOutputField.setText("0.0");
        }
        else
            inputOutputField.setText("Error in adder code.");
     }

    //This method can throw NumberFormatExceptions.
    private static double stringToDouble(String stringObject)
    {
        return Double.parseDouble(stringObject.trim());
    }
}