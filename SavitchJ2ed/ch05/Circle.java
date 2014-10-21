/*************************************************************
 *Class with static methods to perform calculations on circles.
 *************************************************************/
public class Circle
{
    public static double area(double radius)
    {
        return (Math.PI*radius*radius);
    }
    
    public static double circumference(double radius)
    {
        return (Math.PI*(radius + radius));
    }
}

