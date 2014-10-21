/*****************************************
 *Program to demonstrate use of the class
 *ImprovedCadet, which has an inner class.
 *****************************************/
public class InnerDemo
{
    public static void main(String[] args)
    {
        ImprovedCadet starFleetOfficer = 
                     new ImprovedCadet("Wesley Crusher");
        System.out.println("starFleetOfficer contains:");
        starFleetOfficer.writeOutput();
    }
}