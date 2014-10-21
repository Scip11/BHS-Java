import javax.swing.*;
import java.awt.*; 

/*********************************************
 *Used only to show samples of looks and feels.
 *********************************************/
public class LookNFeelSample extends JFrame
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    /*********************************************************
     *Object will have the look and feel of the first argument.
     *********************************************************/
    public LookNFeelSample(String lookNFeelClassName, String title)
    {
        setSize(WIDTH, HEIGHT);
        addWindowListener(new WindowDestroyer()); 
        setTitle(title); 
        Container content = getContentPane();
        content.setLayout(new FlowLayout());

        JButton aButton = new JButton("A Button"); 
        content.add(aButton); 

        JLabel aLabel = new JLabel("This is a label.");
        content.add(aLabel); 

        try
        {
            UIManager.setLookAndFeel(lookNFeelClassName);
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch (Exception e)
        {
            System.out.println("Look and feel problem.");
        }
    }

    public static void main(String[] args)
    {
        LookNFeelSample metalGUI = new LookNFeelSample(
            "javax.swing.plaf.metal.MetalLookAndFeel",
            "Metal Look and Feel");
        metalGUI.setVisible(true);

        LookNFeelSample motifGUI = new LookNFeelSample(
            "com.sun.java.swing.plaf.motif.MotifLookAndFeel",
            "Motif Look and Feel");
        motifGUI.setVisible(true);

        LookNFeelSample windowsGUI = new LookNFeelSample(
            "com.sun.java.swing.plaf.windows.WindowsLookAndFeel",
            "Windows Look and Feel");
        windowsGUI.setVisible(true);
    }
}




