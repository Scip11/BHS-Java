/************************************************************
 *Toy program to demonstrate how a programmer can access
 *and change private data in an object of the class CadetClass.
 ************************************************************/
public class Hacker
{
    public static void main(String[] args)
    {
        CadetClass starFleetOfficer = new CadetClass();
        System.out.println("starFleetOfficer contains:");
        starFleetOfficer.writeOutput();
        PetRecord badGuy;
        badGuy = starFleetOfficer.getPet();
        badGuy.set("Dominion Spy", 1200, 500);
        System.out.println("Looks like a security breach:");
        System.out.println("starFleetOfficer now contains:");
        starFleetOfficer.writeOutput();
        System.out.println("The pet wasn't so private!");
    }
}
