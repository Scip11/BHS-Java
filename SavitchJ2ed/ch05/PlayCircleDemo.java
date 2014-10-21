public class PlayCircleDemo
{
    public static void main(String[] args)
    {
        PlayCircle circle = new PlayCircle();
        circle.setDiameter(2);
        System.out.println("If circle has diameter 2,");
        circle.showArea();

        System.out.println("Now, you choose the diameter:");
        PlayCircle.areaDialog();
    }
}