public class ListDemo
{
    public static void main(String[] args)
    {
        OneWayNoRepeatsList toDoList = 
                              new OneWayNoRepeatsList(3);

        System.out.println(
                    "Enter items for the list, when prompted.");
        boolean more = true;
        String next = null;
        char ans;

        while ( more && (! toDoList.full()))
        {
            System.out.println("Input an entry:");
            next = SavitchIn.readLine();
            toDoList.addItem(next);
            if (toDoList.full())
            {
                System.out.println("List if full.");
            }
            else
            {
                System.out.print(
                             "More items for the list?(y/n): ");
                ans = SavitchIn.readLineNonwhiteChar();
                if ((ans == 'n') || (ans == 'N'))
                    more = false;
            }
        }
 
        System.out.println("The list contains:");
        int position = toDoList.START_POSITION; 
        next = toDoList.getEntryAt(position);
        while (next != null)
        {
            System.out.println(next);
            position++; 
            next = toDoList.getEntryAt(position);
        }
    } 
}
