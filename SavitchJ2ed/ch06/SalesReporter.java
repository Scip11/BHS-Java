/********************************
 *Program to generate sales report.
 ********************************/
public class SalesReporter
{
    private double highest;
    private double average;
    private SalesAssociate[] record;//Array object created in getFigures.
    private int numberOfAssociates; //Same as record.length

    public void getFigures()
    {
        System.out.println("Enter number of sales associates:");
        numberOfAssociates = SavitchIn.readLineInt();
        record = new SalesAssociate[numberOfAssociates];
        int i;
        for (i = 0; i < numberOfAssociates; i++)
        {
            record[i] = new SalesAssociate();
            System.out.println("Enter data for associate " + (i + 1));
            record[i].readInput();
            System.out.println();
        }
    }

    /***************************************************
     *Computes the average and highest sales figures.
     *Precondition: There is at least one salesAssociate.
     ***************************************************/
    public void update()
    {
        int i;
        double nextSales = record[0].getSales();
        highest = nextSales;
        double sum = nextSales;
        for (i = 1; i < numberOfAssociates; i++)
        {
             nextSales = record[i].getSales();
             sum = sum + nextSales;
             if (nextSales > highest)
                highest = nextSales;//highest sales figure so far.
         }
        average = sum/numberOfAssociates;
    }

  /*****************************************
   *Displays sales report on console screen.
   *****************************************/
  public void displayResults()
  {
      System.out.println("Average sales per associate is $" + average);
      System.out.println("The highest sales figure is $" + highest);
      System.out.println();
      int i;
      System.out.println("The following had the highest sales:");
      for (i = 0; i < numberOfAssociates; i++)
      {
          double nextSales = record[i].getSales();
          if (nextSales == highest)
          {
              record[i].writeOutput();
              System.out.println("$" + (nextSales - average)
                                     + " above the average.");
              System.out.println();
          }
      }

      System.out.println("The rest performed as follows:");
      for (i = 0; i < numberOfAssociates; i++)
      {
          double nextSales = record[i].getSales();
          if (record[i].getSales() != highest)
          {
              record[i].writeOutput();
              if (nextSales >= average)
                  System.out.println("$" + (nextSales - average)
                                         + " above the average.");
              else
                  System.out.println("$" + (average - nextSales)
                                         + " below the average.");
              System.out.println();
          }
      }
  }

  public static void main(String[] arg)
  {
      SalesReporter clerk = new SalesReporter();
      clerk.getFigures();
      clerk.update();
      clerk.displayResults();
  }
}

