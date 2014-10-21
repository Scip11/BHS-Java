import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

/**********************************************
 *Class to demonstrate adding icons to a border.
 **********************************************/
public class BorderDemoWithIcon extends JFrame implements ActionListener
{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;

    private JTextField name;

    public BorderDemoWithIcon()
    {
        setTitle("Name Tester with Borders");
        setSize(WIDTH, HEIGHT);
        addWindowListener(new WindowDestroyer());
        Container content = getContentPane();
        content.setLayout(new GridLayout(2, 1));

        JPanel namePanel = new JPanel();
        namePanel.setLayout(new BorderLayout());
        namePanel.setBackground(Color.white);

        name = new JTextField(20);
        //The following border is not as dramatic as others,
        //but look closely and you will see it.
        name.setBorder(new EtchedBorder(Color.green, Color.blue));
        namePanel.add(name, BorderLayout.SOUTH);
        JLabel nameLabel = new JLabel("Enter your name here:");
        //The following does insert space around the label.
        //To see the difference, comment out the following line:
        nameLabel.setBorder(new EmptyBorder(20, 10, 0, 0));
        namePanel.add(nameLabel, BorderLayout.CENTER);

        namePanel.setBorder(new LineBorder(Color.black, 10));
        content.add(namePanel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        JButton testButton = new JButton("Test");
        testButton.addActionListener(this);
        testButton.setBorder(new BevelBorder(BevelBorder.LOWERED));
        buttonPanel.add(testButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        clearButton.setBorder(new BevelBorder(BevelBorder.RAISED));
        buttonPanel.add(clearButton);


        ImageIcon smileyIcon = new ImageIcon("smiley.gif");
        buttonPanel.setBorder(
                 new MatteBorder(60, 40, 30, 20, smileyIcon));
        content.add(buttonPanel);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("Test"))
            name.setText("A very good name!");
        else if (e.getActionCommand().equals("Clear"))
            name.setText("");
        else
            name.setText("Error in window interface.");
    }

    public static void main(String[] args)
    {
        BorderDemoWithIcon w = new BorderDemoWithIcon();
        w.setVisible(true);
    }
}