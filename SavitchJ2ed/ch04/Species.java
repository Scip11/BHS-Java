/***************************************
 *Class for data on endangered species.
 ****************************************/
public class Species
{
    private String name;
    private int population;
    private double growthRate;

    public void readInput()
    {
        System.out.println("What is the species� name?");
        name = SavitchIn.readLine();
        System.out.println(
                      "What is the population of the species?");
        population = SavitchIn.readLineInt();
        while (population < 0)
        {
            System.out.println("Population cannot be negative.");
            System.out.println("Reenter population:");
            population = SavitchIn.readLineInt();
        }
        System.out.println(
                      "Enter growth rate (percent increase per year):");
       growthRate = SavitchIn.readLineDouble();
    }

    public void writeOutput()
    {
         System.out.println("Name = " + name);
         System.out.println("Population = " + population);
         System.out.println("Growth rate = " + growthRate + "%");
    }

    /*******************************************************
     *Precondition: years is a nonnegative number.
     *Returns the projected population of the calling object
     *after the specified number of years.
     *******************************************************/
    public int projectedPopulation(int years)
    {
        double populationAmount = population;
        int count = years;

        while ((count > 0) && (populationAmount > 0))
        {
            populationAmount = (populationAmount +
                         (growthRate/100) * populationAmount);
            count--;
        }
        if (populationAmount > 0)
            return (int)populationAmount;
        else
            return 0;
    }

    public void set(String newName, int newPopulation, double newGrowthRate)
    {
        name = newName;
        if (newPopulation >= 0)
            population = newPopulation;
        else
        {
            System.out.println("ERROR: using a negative population.");
            System.exit(0);
        }
        growthRate = newGrowthRate;
    }

    public String getName()
    {
        return name;
    }

    public int getPopulation()
    {
        return population;
    }

    public double getGrowthRate()
    {
        return growthRate;
    }

    public boolean equals(Species otherObject)
    {
        return ((name.equalsIgnoreCase(otherObject.name))
                && (population == otherObject.population)
                && (growthRate == otherObject.growthRate));
    }
}