public class SpeciesFirstTry
{
    public String name;
    public int population;
    public double growthRate;

    public void readInput()
    {
        System.out.println("What is the species name?");
        name = SavitchIn.readLine();
        System.out.println("What is the population of the species?");
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

    public int populationIn10()
    {
        double populationAmount = population;
        int count = 10;
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
}