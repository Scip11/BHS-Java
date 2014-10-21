/*****************************************************
 *A program to demonstrate a method returning an array.
 *****************************************************/
public class ReturnArrayDemo
{
    public static void main(String[] arg)
    {
        System.out.println("Enter your score on exam 1:");
        int firstScore = SavitchIn.readLineInt();
        int[] nextScore = new int[3];
        int i;
        for (i = 0; i < nextScore.length; i++)
            nextScore[i] = 80 + 10*i;
        double[] averageScore;
        averageScore = averageArray(firstScore, nextScore);
        for (i = 0; i < nextScore.length; i++)
        {
            System.out.println("If your score on exam 2 is "
                                + nextScore[i]);
            System.out.println("your average will be "
                                + averageScore[i]);
        }
    }

    public static double[] averageArray(int firstScore, 
                                              int[] nextScore)
    {
        double[] temp = new double[nextScore.length];
        int i;
        for (i = 0; i < temp.length; i++)
            temp[i] = average(firstScore, nextScore[i]);
        return temp;
    }

    public static double average(int n1, int n2)
    {
        return (n1 + n2)/2.0;
    }
}
