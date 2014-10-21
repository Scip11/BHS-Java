 
/******************************************************************
 *Demonstrates the use of a parameter with the method projectedPopulation.
 ******************************************************************/
public class SpeciesSecondTryDemo
{
    public static void main(String[] args)
    {
        SpeciesSecondTry speciesOfTheMonth = new SpeciesSecondTry();
        int futurePopulation;
        
        System.out.println("Enter data on the Species of the Month:");
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput(); 
        
        futurePopulation = speciesOfTheMonth.projectedPopulation(10);
        System.out.println("In ten years the population will be " +
                                                    futurePopulation);
       
        speciesOfTheMonth.name = "Klingon ox";
        speciesOfTheMonth.population = 10;
        speciesOfTheMonth.growthRate = 15;
        System.out.println("The new Species of the Month:");
        speciesOfTheMonth.writeOutput(); 
        System.out.println("In ten years the population will be " + 
                           speciesOfTheMonth.projectedPopulation(10));
    }
}