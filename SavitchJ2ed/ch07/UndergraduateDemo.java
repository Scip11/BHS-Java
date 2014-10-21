
public class UndergraduateDemo
{
    public static void main(String[] args)
    {
        Undergraduate ug1 = new Undergraduate("James Bond", 007, 1);
        ug1.writeOutput();
        ug1.reset("Sam Spade", 1940, 2);
        System.out.println("ug1 is:");
        ug1.writeOutput();

        Undergraduate ug2 = new Undergraduate("James Bond", 007, 1);
        System.out.println("ug2 is:");
        ug2.writeOutput();
        if (ug1.equals(ug2))
            System.out.println("Same students.");
        else
            System.out.println("Not the same students.");

        //sameName inherited from Student, which inherited it fron Person.
        if (ug1.sameName(ug2))
            System.out.println("Same names.");
        else
            System.out.println("Not the same names.");


    }
}