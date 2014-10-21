/***************************************************
 *This is just a toy class to illustrate overloading.
 ***************************************************/
public class Statistician
{
    public static void main(String[] args)
    {
        double average1 = Statistician.average(40.0, 50.0);
        double average2 = Statistician.average(1.0, 2.0, 3.0);
        char average3 = Statistician.average('a', 'c');

        System.out.println("average1 = " + average1);
        System.out.println("average2 = " + average2);
        System.out.println("average3 = " + average3);
    }

    public static double average(double first, double second)
    {
        return ((first + second)/2.0);
    }

    public static double average(double first,
                                    double second, double third)
    {
        return ((first + second + third)/3.0);
    }

    public static char average(char first, char second)
    {
        return (char)(((int)first + (int)second)/2);
    }
}