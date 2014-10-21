/********************************************
 *Demonstrates the use of mutator method set. 
 ********************************************/
public class SpeciesFourthTryDemo
{
    public static void main(String[] args)
    {
        SpeciesFourthTry speciesOfTheMonth = 
                                         new SpeciesFourthTry();
        int numberOfYears, futurePopulation;
        
        System.out.println("Enter number of years to project:");
        numberOfYears = SavitchIn.readLineInt();


        System.out.println("Enter data on the Species of the Month:");
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput(); 


        futurePopulation = 
             speciesOfTheMonth.projectedPopulation(numberOfYears);
        System.out.println("In " + numberOfYears 
                                + " years the population will be "
                                + futurePopulation);
       

        speciesOfTheMonth.set("Klingon ox", 10, 15);
        System.out.println("The new Species of the Month:");
        speciesOfTheMonth.writeOutput(); 
        System.out.println("In " + numberOfYears
           + " years the population will be "
           + speciesOfTheMonth.projectedPopulation(numberOfYears));
    }
}