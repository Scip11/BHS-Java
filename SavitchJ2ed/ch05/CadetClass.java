/********************************************
 *Example of a class that does NOT correctly
 *hide its private instance variable.
 ********************************************/
public class CadetClass
{
    private PetRecord pet;

    public CadetClass()
    {
        pet =
            new PetRecord("Faithful Guard Dog", 5, 75);
    }

    public void writeOutput()
    {
        System.out.println("Here's the pet:");
        pet.writeOutput();
    }

    public PetRecord getPet()
    {
        return pet;
    }
}
