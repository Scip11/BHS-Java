import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/***********************
 *Displays font samples.
 ***********************/
public class FontSampler extends JFrame
{
    public static final int WIDTH = 450;
    public static final int HEIGHT = 350;
    public static final int X_START = 20;
    public static final int Y_START = 50;

    public static void main(String[] args)
    {
        FontSampler w = new FontSampler();
        w.setVisible(true);
    }

    public FontSampler()
    {
        setSize(WIDTH, HEIGHT);
        Container contentPane = getContentPane();

        addWindowListener(new WindowDestroyer());
        setTitle("Font Samples");
        contentPane.setBackground(Color.white);
    }

    public void paint(Graphics g)
    {
        super.paint(g);

        g.setFont(new Font("Serif", Font.PLAIN, 10));
        g.drawString("Serif, Plain, 10 Points", X_START, Y_START);

        g.setFont(new Font("SansSerif", Font.PLAIN, 12));
        g.drawString("SansSerif, Plain, 12 Points",  X_START, 2*Y_START);

        g.setFont(new Font("Monospaced", Font.PLAIN, 14));
        g.drawString("Monospaced, Plain, 14 Points", X_START, 3*Y_START);

        g.setFont(new Font("Monospaced", Font.ITALIC, 18));
        g.drawString("Monospaced, Italic, 18 Pts.", X_START, 4*Y_START);

        g.setFont(new Font("SansSerif", Font.BOLD, 24));
        g.drawString("SansSerif, Bold, 24 Points",  X_START, 5*Y_START);

        g.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, 32));
        g.drawString("Serif, Bold & Italic, 32 Points", X_START, 6*Y_START);

    }
}