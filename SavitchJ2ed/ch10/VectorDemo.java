import java.util.*;


public class VectorDemo
{
   public static void main(String[] args)
   {
      Vector toDoList = new Vector(10);


      System.out.println(
                    "Enter items for the list, when prompted.");
      boolean done = false;
      String next = null;
      char ans;
      while (! done)
      {
          System.out.println("Input an entry:");
          next = SavitchIn.readLine();
          toDoList.addElement(next);
          System.out.print("More items for the list?(y/n): ");
          ans = SavitchIn.readLineNonwhiteChar();
          if ((ans == 'n') || (ans == 'N'))
                done = true;
      }


      System.out.println("The list contains:");
      int position;
      int vectorSize = toDoList.size();
      for (position = 0; position < vectorSize; position++)
      System.out.println(
                   (String)(toDoList.elementAt(position)));
   }
}