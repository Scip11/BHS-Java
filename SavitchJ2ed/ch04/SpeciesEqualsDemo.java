public class SpeciesEqualsDemo
{
    public static void main(String[] args)
    {
        Species s1 = new Species(), s2 = new Species();
 
        s1.set("Klingon Ox", 10, 15);
        s2.set("Klingon Ox", 10, 15);

        if (s1 == s2)
            System.out.println("Match with ==.");
        else
            System.out.println("Do Not match with ==.");

        if (s1.equals(s2))
            System.out.println("Match with the method equals.");
        else
            System.out.println("Do Not match with the method equals.");

        System.out.println(
                       "Now we change one Klingon Ox to all lowercase.");
        s2.set("klingon ox", 10, 15);
        if (s1.equals(s2))
            System.out.println("Still match with the method equals.");
        else
            System.out.println("Do Not match with the method equals.");
    }
}