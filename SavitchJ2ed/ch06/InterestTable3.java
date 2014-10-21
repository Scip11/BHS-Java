/******************************************************
 *Displays a two-dimensional table showing how interest
 *rates affect bank balances.
 ******************************************************/
public class InterestTable3
{
   public static void main(String[] args)
   {
      int[][] table = new int[10][6];
      int row, column;
      for (row = 0; row < 10; row++)
          for (column = 0; column < 6; column++)
               table[row][column] =
               balance(1000.00, row + 1, (5 + 0.5*column));

      System.out.println("Balances for Various Interest Rates");
      System.out.println("Compounded Annually");
      System.out.println("(Rounded to Whole Dollar Amounts)");
      System.out.println("Years 5.00% 5.50% 6.00% 6.50% 7.00% 7.50%");
      System.out.println();
      showTable(table);
   }

   /******************************************************************
    *The array displayArray can have any dimensions.
    *Postcondition: The array contents are displayed with dollar signs.
    ******************************************************************/
   public static void showTable(int[][] displayArray)
   {
      int row, column;
      for (row = 0; row < displayArray.length; row++)
      {
         System.out.print((row + 1) + "      ");
         for(column = 0; column < displayArray[row].length; column++)
            System.out.print("$" + displayArray[row][column] + "  ");
         System.out.println();
      }
   }


   public static int balance(double startBalance, int years, double rate)
   {
      double runningBalance = startBalance;
      int count;
      for (count = 1; count <= years; count++)
         runningBalance = runningBalance*(1 + rate/100);
      return (int) (Math.round(runningBalance));
   }
 }