
/***************************************************
 *Class for basic pet records: name, age, and weight.
 ***************************************************/
public class Pet
{
    private String name;
    private int age;//in years
    private double weight;//in pounds

    /******************************************
     *This main is just a demonstration program.
     ******************************************/
    public static void main(String[] args)
    {
        Pet myDog = new Pet();
        myDog.set("Fido", 2, 5.5);
        myDog.writeOutput();
        System.out.println("Changing name.");
        myDog.set("Rex");
        myDog.writeOutput();
        System.out.println("Changing weight.");
        myDog.set(6.5);
        myDog.writeOutput();
        System.out.println("Changing age.");
        myDog.set(3);
        myDog.writeOutput();
    }

    public void writeOutput()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " pounds");
    }

    public void set(String newName)
    {
        name = newName;
        //age and weight are unchanged.
    } 
   
    public void set(int newAge)
    {
        if (newAge <= 0)
        {
            System.out.println("Error: illegal age.");
            System.exit(0);
        }
        else
            age = newAge;
        //name and weight are unchanged. 
    }

    public void set(double newWeight)
    {
        if (newWeight <= 0)
        {
            System.out.println("Error: illegal weight.");
            System.exit(0);
        }
        else
            weight = newWeight;
        //name and age are unchanged. 
    }

    public void set(String newName, int newAge, double newWeight)
    {
        name = newName;
        if ((newAge <= 0) || (newWeight <= 0))
        {
            System.out.println("Error: illegal age or weight.");
            System.exit(0);
        }
        else
        {
            age = newAge;
            weight = newWeight;
        }
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