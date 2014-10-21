public class MultipleBirths
{
    public static void main(String[] args)
    {
        int numberOfBabies;
        System.out.print("Enter number of babies: ");
        numberOfBabies = SavitchIn.readLineInt();

        switch (numberOfBabies)
        {
            case 1:
                System.out.println("Congratulations.");
                break;
            case 2:
                System.out.println("Wow. Twins.");
                break;
            case 3:
                System.out.println("Wow. Triplets.");
                break;
            case 4:
            case 5:
                System.out.println("Unbelieveable.");
                System.out.println(numberOfBabies + " babies");
                break;
            default:
                System.out.println("I don't believe you.");
                break;
       }
    }
}