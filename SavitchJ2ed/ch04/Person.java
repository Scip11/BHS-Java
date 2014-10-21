public class Person
{
    private String name;
    private int age;

    public void readInput()
    {
        System.out.println("What is the person’s name?"); 
        name = SavitchIn.readLine(); 

        System.out.println("What is the person’s age?"); 
        age = SavitchIn.readLineInt();
        while (age < 0)
        {
            System.out.println("Age cannot be negative.");
            System.out.println("Reenter age:");
            age = SavitchIn.readLineInt();
        }

    }

    public void writeOutput()
    {
         System.out.println("Name = " + name); 
         System.out.println("Age = " + age); 
    }

    public void set(String newName, int newAge)
    {
        name = newName;
        if (newAge >= 0)
            age = newAge;
        else
        {
            System.out.println("ERROR: Used a negative age.");
            System.exit(0);
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
}