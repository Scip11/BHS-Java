public class PlayCircleV2
{
    public static final double PI = 3.14159;

    private double diameter;

    public static void main(String[] args)
    {
        PlayCircleV2 circle = new PlayCircleV2();
        circle.setDiameter(2);
        System.out.println("If circle has diameter 2,");
        circle.showArea();

        System.out.println("Now, you choose the diameter:");
        PlayCircleV2.areaDialog();
    }


    public void setDiameter(double newDiameter)
    {
        diameter = newDiameter;
    }

    public static double area(double radius)
    {
        return (PI*radius*radius);
    }
    
    public void showArea()
    {
        System.out.println("Area is " + area(diameter/2));
    }

    public static void areaDialog()
    {
        System.out.println("Enter diameter of circle:");
        double newDiameter = SavitchIn.readLineDouble();
        PlayCircle c = new PlayCircle();
        c.setDiameter(newDiameter);
        c.showArea();
    }
}