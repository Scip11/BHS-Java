
import javax.swing.*;
import java.awt.*;

public class DukeApplet extends JApplet
{
    public void init()
    {
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JLabel spacer = new JLabel("             ");
        contentPane.add(spacer, "West");
        JLabel niceLabel = new JLabel("Java is fun!");
        ImageIcon dukeIcon = new ImageIcon("duke_waving.gif");
        niceLabel.setIcon(dukeIcon);
        getContentPane().add(niceLabel, BorderLayout.CENTER);
    }
}