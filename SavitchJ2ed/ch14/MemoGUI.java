import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class MemoGUI extends JFrame implements ActionListener
{
    public static final int WIDTH = 600;
    public static final int HEIGHT = 300;
    public static final int LINES = 10;
    public static final int CHAR_PER_LINE = 40;

    private JTextArea theText;
    private String memo1 = "No Memo 1.";
    private String memo2 = "No Memo 2.";

    public MemoGUI()
    {
        setSize(WIDTH, HEIGHT);
        addWindowListener(new WindowDestroyer()); 
        setTitle("Memo Saver"); 
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JMenu memoMenu = new JMenu("Memos");
        JMenuItem m; 

        m = new JMenuItem("Save Memo 1"); 
        m.addActionListener(this);
        memoMenu.add(m); 

        m = new JMenuItem("Save Memo 2"); 
        m.addActionListener(this);
        memoMenu.add(m);

        m = new JMenuItem("Get Memo 1"); 
        m.addActionListener(this);
        memoMenu.add(m); 

        m = new JMenuItem("Get Memo 2"); 
        m.addActionListener(this);
        memoMenu.add(m); 

        m = new JMenuItem("Clear"); 
        m.addActionListener(this);
        memoMenu.add(m); 

        m = new JMenuItem("Exit");
        m.addActionListener(this);
        memoMenu.add(m);

        JMenuBar mBar = new JMenuBar();
        mBar.add(memoMenu);
        setJMenuBar(mBar);

        JPanel textPanel = new JPanel(); 
        textPanel.setBackground(Color.blue);
        theText = new JTextArea(LINES, CHAR_PER_LINE);
        theText.setBackground(Color.white);
        textPanel.add(theText);
        contentPane.add(textPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) 
    {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Save Memo 1"))
            memo1 = theText.getText();
        else if (actionCommand.equals("Save Memo 2"))
            memo2 = theText.getText();
        else if (actionCommand.equals("Clear"))
            theText.setText("");
        else if (actionCommand.equals("Get Memo 1"))
            theText.setText(memo1);
        else if (actionCommand.equals("Get Memo 2"))
            theText.setText(memo2);
        else if (actionCommand.equals("Exit"))
            System.exit(0);
        else
            theText.setText("Error in memo interface");
    } 
 
    public static void main(String[] args)
    {
        MemoGUI gui = new MemoGUI();
        gui.setVisible(true);
    }
}
