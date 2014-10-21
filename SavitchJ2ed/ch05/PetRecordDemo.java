public class PetRecordDemo
{
    public static void main(String[] args)
    {
        PetRecord usersPet = new PetRecord("Jane Doe");
        System.out.println("My records on your pet are inaccurate.");
        System.out.println("Here is what they currently say:");
        usersPet.writeOutput();

        System.out.println("Please enter the correct pet name:");
        String correctName = SavitchIn.readLine();
        System.out.println("Please enter the correct pet age:");
        int correctAge = SavitchIn.readLineInt();
        System.out.println("Please enter the correct pet weight:");
        double correctWeight = SavitchIn.readLineDouble();
        usersPet.set(correctName, correctAge, correctWeight);
        System.out.println("My updated records now say:");
        usersPet.writeOutput();
    }
}