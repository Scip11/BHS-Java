public class CircleDemo
{
    public static void main(String[] args)
    {
        double radius;
                   
        System.out.println("Enter the radius of a circle in inches:");
        radius = SavitchIn.readLineDouble();
   
        System.out.println("A circle of radius " 
                                      + radius + " inches");
        System.out.println("has an area of " +
             CircleFirstTry.area(radius) + " square inches,");
        System.out.println("and a circumference of " +
             CircleFirstTry.circumference(radius) + " inches.");
    }
}