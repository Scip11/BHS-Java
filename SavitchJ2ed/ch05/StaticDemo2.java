
/*************************************************************************
 *Demo of static variable. In a real class, the objects would do something.
 *************************************************************************/
public class StaticDemo2
{
    private static int numberOfObjects = 0;

    public static void main(String[] args)
    {
        StaticDemo2 object1 = new StaticDemo2();
        StaticDemo2 object2 = new StaticDemo2();
        StaticDemo2 object3 = new StaticDemo2();
        System.out.println("Total number of objects = "
                           + StaticDemo2.numberSoFar());
    }

    public StaticDemo2()
    {
        numberOfObjects++;
    }

    public static int numberSoFar()
    {
		return numberOfObjects;
    }
}