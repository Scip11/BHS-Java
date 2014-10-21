public class ArrayOfTemperatures2
{
    /*****************************************************
     *Reads in 7 temperatures and shows which are above and
     *which are below the average of the 7 temperatures.
     *****************************************************/
    public static void main(String[] args)
    {
        double[] temperature = new double[7];

        int index;
        double sum, average;
        System.out.println("Enter " + temperature.length 
                                    + " temperatures:");
        sum = 0;
        for (index = 0; index < temperature.length; index++)
        {
            temperature[index] = SavitchIn.readLineDouble();
            sum = sum + temperature[index];
        }
        average = sum/temperature.length;

        System.out.println("The average temperature is " + average);
        System.out.println("The temperatures are");
        for (index = 0; index < temperature.length; index++)
        {
            if (temperature[index] < average)
                System.out.println(
             temperature[index] + " below average.");
            else if (temperature[index] > average)
                System.out.println(
             temperature[index] + " above average.");
            else //temperature[index] == average
                System.out.println(
             temperature[index] + " the average.");
        }
        System.out.println("Have a nice week.");
    }
}