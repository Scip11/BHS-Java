import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class JColorChooserDemo extends JFrame
                               implements ActionListener
{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;

    private Container contentPane; 
    private Color changingColor = Color.lightGray;

    public static void main(String[] args)
    {
        JColorChooserDemo gui = new JColorChooserDemo();
        gui.setVisible(true);
    }

    public JColorChooserDemo()
    {
        contentPane = getContentPane();
        contentPane.setBackground(changingColor);
        contentPane.setLayout(new BorderLayout());
        setTitle("JColorChooser Demo");
        setSize(WIDTH, HEIGHT);
        addWindowListener(new WindowDestroyer());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.white);
        buttonPanel.setLayout(new FlowLayout());
        JButton changeButton = new JButton("Choose a Color");
        changeButton.addActionListener(this);
        buttonPanel.add(changeButton);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getActionCommand().equals("Choose a Color"))
        {
            changingColor = JColorChooser.showDialog(
                           this, "JColorChooser", changingColor);
            if (changingColor != null)//If a color was chosen
                contentPane.setBackground(changingColor);
        }
        else 
            System.out.println("Unexplained Error");
    }
}


