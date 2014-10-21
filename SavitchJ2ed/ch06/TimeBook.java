/**************************************************
 *Class for a one-week record of the time worked by 
 *each Employee. Uses a five-day week (Mon.-Fri.). 
 *main has a sample application.
 **************************************************/
public class TimeBook
{
    private int numberOfEmployees;
    private int[][] hours; 
        //hours[i][j] has the hours for employee j on day i.
    private int[] weekHours; 
        //weekHours[i] has the week's hours work for employee i+1.
    private int[] dayHours; 
        //dayHours[i] has the total hours worked by all employees.
        //on day i. Monday is 0, Tuesday 1, etc,


    /***********************************************************
     *Reads hours worked for each employee on each day of
     *the week into the two-dimensional array hours. (The method
     *for input is just a stub in this preliminary version.)
     *Computes the total weekly hours for each employee and
     *the total daily hours for all employees combined.
     ***********************************************************/
    public static void main(String[] args)
    {
        TimeBook book = new TimeBook(3);
        book.setHours();
        book.update();
        book.showTable();
    }

    public TimeBook(int theNumberOfEmployees)
    {
        numberOfEmployees = theNumberOfEmployees; 
        hours = new int[5][numberOfEmployees];
        //the 5 is for the 5 days Monday through Friday.
        weekHours = new int[numberOfEmployees];
        dayHours = new int[5];
    }

    public void setHours() //This is just a stub.
    {
        hours[0][0] = 8;  hours[0][1] = 0;  hours[0][2] = 9;
        hours[1][0] = 8;  hours[1][1] = 0;  hours[1][2] = 9;
        hours[2][0] = 8;  hours[2][1] = 8;  hours[2][2] = 8;
        hours[3][0] = 8;  hours[3][1] = 8;  hours[3][2] = 4;
        hours[4][0] = 8;  hours[4][1] = 8;  hours[4][2] = 8;
    } 

    public void update()
    {
        computeWeekHours();
        computeDayHours();
    }

    private void computeWeekHours()
    {
        int dayNumber, employeeNumber, sum;

        for (employeeNumber = 1;
              employeeNumber <= numberOfEmployees; employeeNumber++)
        {//Process one employee:
            sum = 0;
            for(dayNumber = 0; dayNumber < 5; dayNumber++)
                sum = sum + hours[dayNumber][employeeNumber - 1];
                //sum contains the sum of all the hours worked
                //in one week by employee with number employeeNumber.
            weekHours[employeeNumber - 1] = sum;
        }
    }

    private void computeDayHours()
    {
        int dayNumber, employeeNumber, sum;

        for (dayNumber = 0; dayNumber < 5; dayNumber++)
        {//Process one day's (for all employees):
            sum = 0; 
            for (employeeNumber = 1;
                  employeeNumber <= numberOfEmployees; employeeNumber++)
                sum = sum + hours[dayNumber][employeeNumber - 1];
                //sum contains the sum of all hours worked by all 
                //employees on day dayNumber.
            dayHours[dayNumber] = sum;  
        }
    }
    
    public void showTable()
    {
        int row, column;
        System.out.print("Employee  ");
        for(column = 0; column < numberOfEmployees; column++)
            System.out.print((column + 1) + "   ");
        System.out.println("totals");
        System.out.println();

        for (row = 0; row < 5; row++)
        {
            System.out.print(day(row) + " ");   
            for (column = 0; column < hours[row].length; column++)
                System.out.print(hours[row][column] + "   ");
            System.out.println(dayHours[row]);
        }
        System.out.println();

        System.out.print("Total  =  "); 
        for (column = 0; column <  numberOfEmployees; column++)
            System.out.print(weekHours[column] + "  ");
        System.out.println();
    }
  
    //Converts 0 to "Monday", 1 to "Tuesday" etc.
    //Blanks used to make all strings the same length.
    private String day(int dayNumber)
    {
        String dayName = null;
        switch (dayNumber)
        {
            case 0:
                dayName = "Monday   ";
                break;
            case 1:
                dayName = "Tuesday  ";
                break;
            case 2: 
                dayName = "Wednesday";
                break;
            case 3:
                dayName = "Thursday ";
                break;
            case 4:
                dayName = "Friday   ";
                break;
            default:
                System.out.println("Fatal Error.");
                System.exit(0);
                break;
       }
       
       return dayName;
    }

}
