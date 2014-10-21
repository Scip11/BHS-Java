import javax.swing.*;
import java.awt.*;//For Container class

public class HelloApplet extends JApplet
{
    public void init()
    {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        JLabel friendlyLabel = new JLabel("Hello out there!");
        contentPane.add(friendlyLabel);
    }
}