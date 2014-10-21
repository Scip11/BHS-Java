/***********************************************
 *Example of a class with a private inner class.
 ***********************************************/
public class ImprovedCadet
{
    private String name;
    private PetRecord pet;


    /***************************************************
     *Class for basic pet records: name, age, and weight.
     ***************************************************/
    private class PetRecord
    {
        private String name;
        private int age;//in years
        private double weight;//in pounds

        public PetRecord(String initialName, int initialAge,
                                        double initialWeight)
        {
            name = initialName;
            age = initialAge;
            weight = initialWeight;
        }

        public void writeOutput()
        {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Weight: " + weight);
        }
    }

    public ImprovedCadet(String initialName)
    {
        name = initialName;
        pet =
            new PetRecord("Faithful Guard Dog", 5, 75);
    }

    public void writeOutput()
    {
        System.out.println("Cadet " + name);
        System.out.println("Here's the pet:");
        pet.writeOutput();
    }

    public String getPetName()
    {
        return pet.name;
    }

    public int getPetAge()
    {
        return pet.age;
    }

    public double getPetWeight()
    {
        return pet.weight;
    }
}