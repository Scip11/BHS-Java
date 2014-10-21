
/***********************************************
 *Demonstrates the use of a the private modifier.
 ***********************************************/
public class SpeciesThirdTryDemo
{
    public static void main(String[] args)
    {
        SpeciesThirdTry speciesOfTheMonth = new SpeciesThirdTry();
        int futurePopulation;

        System.out.println("Enter data on the Species of the Month:");
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput();

        futurePopulation = speciesOfTheMonth.projectedPopulation(10);
        System.out.println("In ten years the population will be " +
                                                    futurePopulation);

        //If you remove the comment symbols so the following code becomes part of
        //the program, then when you compile the program, you will get an error message
        //Try it!

        /*
        speciesOfTheMonth.name = "Klingon ox";
        speciesOfTheMonth.population = 10;
        speciesOfTheMonth.growthRate = 15;
        System.out.println("The new Species of the Month:");
        speciesOfTheMonth.writeOutput();
        System.out.println("In ten years the population will be " +
                           speciesOfTheMonth.projectedPopulation(10));
        */
    }
}