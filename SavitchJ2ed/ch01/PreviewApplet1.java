import javax.swing.*;

public class PreviewApplet1 extends JApplet
{
    public void init()
    {
        JLabel myFirstLabel = new JLabel("Hello out there!");
        getContentPane().add(myFirstLabel);
    }
} 