/*************************************************************
 *Class with static methods to perform calculations on circles.
 *************************************************************/
public class CircleFirstTry
{
    public static final double PI = 3.14159;

    public static double area(double radius)
    {
        return (PI*radius*radius);
    }
    
    public static double circumference(double radius)
    {
        return (PI*(radius + radius));
    }
}