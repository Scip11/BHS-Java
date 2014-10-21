/***************************************************
 *Class for basic pet records: name, age, and weight.
 ***************************************************/
public class PetRecord implements Comparable
{
    private String name;
    private int age;//in years
    private double weight;//in pounds

    public static void main(String[] args)
    {
        PetRecord dog = new PetRecord("Fido", 5, 55.6);
        PetRecord cat = new PetRecord("Fluffy", 6, 10.3);
        System.out.println("Dog record:");
        dog.writeOutput();
        System.out.println("Cat record:");
        cat.writeOutput();

        if (dog.comesBefore(cat))
            System.out.println("Dog weighs less than cat.");
        else
            System.out.println("Cat weighs less than dog.");
    }

    public boolean comesBefore(Object otherPet)
    {
		return (this.weight < ((PetRecord)otherPet).weight);
    }

    public void writeOutput()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " pounds");
    }

    public PetRecord(String initialName, int initialAge,
                                          double initialWeight)
    {
        name = initialName;
        if ((initialAge < 0) || (initialWeight < 0))
        {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        }
        else
        {
            age = initialAge;
            weight = initialWeight;
        }
    }

    public void set(String newName, int newAge, double newWeight)
    {
        name = newName;
        if ((newAge < 0) || (newWeight < 0))
        {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        }
        else
        {
            age = newAge;
            weight = newWeight;
        }
    }

    public PetRecord(String initialName)
    {
        name = initialName;
        age = 0;
        weight = 0;
    }

    public void set(String newName)
    {
        name = newName; //age and weight are unchanged.
    }

    public PetRecord(int initialAge)
    {
        name = "No name yet.";
        weight = 0;
        if (initialAge < 0)
        {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else
            age = initialAge;
    }

    public void set(int newAge)
    {
        if (newAge < 0)
        {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else
            age = newAge;
        //name and weight are unchanged.
    }

    public PetRecord(double initialWeight)
    {
        name = "No name yet";
        age = 0;
        if (initialWeight < 0)
        {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        else
            weight = initialWeight;
    }

    public void set(double newWeight)
    {
        if (newWeight < 0)
        {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        else
            weight = newWeight; //name and age are unchanged.
    }

    public PetRecord()
    {
        name = "No name yet.";
        age = 0;
        weight = 0;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }
}

