import javax.swing.*;
import java.awt.*; 

/***************************************************
 *Simple demonstration of drawing a face in a JFrame.
 ***************************************************/
public class Madeleine extends JFrame
{
    public static final int FRAME_WIDTH = 400;
    public static final int FRAME_HEIGHT = 400;
    public static final int FACE_DIAMETER = 200;    
    public static final int X_FACE = 100; 
    public static final int Y_FACE = 50; 
    public static final int NOSE_DIAMETER = 10;   
    public static final int X_NOSE = X_FACE + 95;
    public static final int Y_NOSE = Y_FACE + 95;
    public static final int EYE_WIDTH = 20; 
    public static final int EYE_HEIGHT = 10;   
    public static final int X_LEFT_EYE = X_FACE + 55;
    public static final int Y_LEFT_EYE = Y_FACE + 45; 
    public static final int X_RIGHT_EYE = X_FACE + 130;
    public static final int Y_RIGHT_EYE = Y_FACE + 45; 
    public static final int X1_LEFT_BROW = X_FACE + 55; 
    public static final int Y1_LEFT_BROW = Y_FACE + 38;
    public static final int X2_LEFT_BROW = X1_LEFT_BROW + 20; 
    public static final int Y2_LEFT_BROW = Y1_LEFT_BROW + 2; 
    public static final int X1_RIGHT_BROW = X_FACE + 130; 
    public static final int Y1_RIGHT_BROW = Y2_LEFT_BROW; 
    public static final int X2_RIGHT_BROW = X1_RIGHT_BROW + 20; 
    public static final int Y2_RIGHT_BROW = Y1_LEFT_BROW;      
    public static final int MOUTH_WIDTH = 100; 
    public static final int MOUTH_HEIGHT = 50; 
    public static final int X_MOUTH = X_FACE + 50;
    public static final int Y_MOUTH = Y_FACE + 125;
    public static final int MOUTH_START_ANGLE = 180; 
    public static final int MOUTH_ARC_SWEEP = 180; 
    public static final int X_TEXT = X_FACE;
    public static final int Y_TEXT = Y_FACE + 250;

    public static void main(String[] args)
    {
        Madeleine picture = new Madeleine();
        picture.setVisible(true);
    }

    public Madeleine()
    {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        addWindowListener(new WindowDestroyer()); 
        setTitle("Madeleine by Java"); 
        getContentPane().setBackground(Color.white);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
        //Draw Nose:
        g.fillOval(X_NOSE, Y_NOSE, NOSE_DIAMETER, NOSE_DIAMETER);
        //Draw Eyes:
        g.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);
        g.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT); 
        //Draw eyebrows:
        g.drawLine(X1_LEFT_BROW, Y1_LEFT_BROW,
                   X2_LEFT_BROW, Y2_LEFT_BROW);
        g.drawLine(X1_RIGHT_BROW, Y1_RIGHT_BROW,
                   X2_RIGHT_BROW, Y2_RIGHT_BROW);
        //Draw Mouth:
        g.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT,
                  MOUTH_START_ANGLE, MOUTH_ARC_SWEEP);
    }
}