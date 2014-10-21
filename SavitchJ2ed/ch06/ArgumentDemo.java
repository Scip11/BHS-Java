/************************************
 *A program to demonstrate the use of
 *indexed variables as arguments.
 ************************************/
public class ArgumentDemo
{
    public static void main(String[] arg)
    {
        System.out.println("Enter your score on exam 1:");
        int firstScore = SavitchIn.readLineInt();
        int[] nextScore = new int[3];
        int i;
        double possibleAverage;
        for (i = 0; i < nextScore.length; i++)
            nextScore[i] = 80 + 10*i;
        for (i = 0; i < nextScore.length; i++)
        {
            possibleAverage = average(firstScore, nextScore[i]);
            System.out.println("If your score on exam 2 is "
                                + nextScore[i]);
            System.out.println("your average will be "
                                + possibleAverage);
        }
    }

    public static double average(int n1, int n2)
    {
       return (n1 + n2)/2.0;
    }
}