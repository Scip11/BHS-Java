import javax.swing.*;
import java.awt.*;   
import java.awt.event.*; 

/*********************************************************
 *Simple demonstration of a face with action (in a JFrame).
 *********************************************************/
public class SadMadeleine extends JFrame implements ActionListener
{
    public static final int FRAME_WIDTH = 400;
    public static final int FRAME_HEIGHT = 400;
    public static final int FACE_DIAMETER = 200; 
    public static final int EYE_WIDTH = 20; 
    public static final int EYE_HEIGHT = 10;     
    public static final int NOSE_DIAMETER = 10; 
    public static final int MOUTH_WIDTH = 100; 
    public static final int MOUTH_HEIGHT = 50;     
    public static final int X_SAD_FACE = 190; 
    public static final int Y_SAD_FACE = 150;   
    public static final int X_HAPPY_FACE = 100; 
    public static final int Y_HAPPY_FACE = 50; 
    public static final int MOUTH_START_ANGLE = 180; 
    public static final int MOUTH_ARC_SWEEP = 180; 
 
    private boolean smile = false; 
    private int xFace = X_SAD_FACE;
    private int yFace = Y_SAD_FACE; 
    private int xNose = xFace + 95;
    private int yNose = yFace + 95;
    private int xLeftEye = xFace + 55;
    private int yLeftEye = yFace + 45; 
    private int xRightEye = xFace + 130;
    private int yRightEye = yFace + 45; 
    private int x1LeftBrow = xFace + 55; 
    private int y1LeftBrow = yFace + 38;
    private int x2LeftBrow = x1LeftBrow + 20;
    private int y2LeftBrow = y1LeftBrow + 2;
    private int x1RightBrow = xFace + 130; 
    private int y1RightBrow = y2LeftBrow; 
    private int x2RightBrow = x1RightBrow + 20;
    private int y2RightBrow = y1LeftBrow;
    private int xMouth = xFace + 50;
    private int yMouth = yFace + 125;

    public static void main(String[] args)
    {
        SadMadeleine picture = new SadMadeleine();
        picture.setVisible(true);
    }

    public SadMadeleine()
    {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        addWindowListener(new WindowDestroyer()); 
        setTitle("Sad Madeleine"); 
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.setBackground(Color.white);

        JButton smileButton = new JButton("Click for a Smile."); 
        smileButton.addActionListener(this);
        contentPane.add(smileButton, BorderLayout.SOUTH);
    }
     
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getActionCommand().equals("Click for a Smile."))
            smile = true; 
        else
            System.out.println("Error in button interface.");
       repaint();
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        if (smile)
        {
            xFace = X_HAPPY_FACE;
            yFace = Y_HAPPY_FACE;
        }
        else
        {
            xFace = X_SAD_FACE;
            yFace = Y_SAD_FACE;
        }
 
        xNose = xFace + 95;
        yNose = yFace + 95;
        xLeftEye = xFace + 55;
        yLeftEye = yFace + 45; 
        xRightEye = xFace + 130;
        yRightEye = yFace + 45; 
        x1LeftBrow = xFace + 55; 
        y1LeftBrow = yFace + 38;
        x2LeftBrow = x1LeftBrow + 20;
        y2LeftBrow = y1LeftBrow + 2;
        x1RightBrow = xFace + 130; 
        y1RightBrow = y2LeftBrow; 
        x2RightBrow = x1RightBrow + 20;
        y2RightBrow = y1LeftBrow;
        xMouth = xFace + 50;
        yMouth = yFace + 125;

        g.drawOval(xFace, yFace, FACE_DIAMETER, FACE_DIAMETER);
        //Draw Nose:
        g.fillOval(xNose, yNose, NOSE_DIAMETER, NOSE_DIAMETER);
        //Draw Eyes:
        g.fillOval(xLeftEye, yLeftEye, EYE_WIDTH, EYE_HEIGHT);
        g.fillOval(xRightEye, yRightEye, EYE_WIDTH, EYE_HEIGHT);
        //Draw eyebrows:
        g.drawLine(x1LeftBrow, y1LeftBrow,
                   x2LeftBrow, y2LeftBrow);
        g.drawLine(x1RightBrow, y1RightBrow,
                   x2RightBrow, y2RightBrow);
        //Draw Mouth:       
        if (smile)
            g.drawArc(xMouth, yMouth, MOUTH_WIDTH, MOUTH_HEIGHT,
                      MOUTH_START_ANGLE, MOUTH_ARC_SWEEP);
        else //Note minus sign:
            g.drawArc(xMouth, yMouth, MOUTH_WIDTH, MOUTH_HEIGHT,
                      MOUTH_START_ANGLE, -MOUTH_ARC_SWEEP);
    }
}
