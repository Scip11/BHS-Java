public class StaticDemo
{
    private static int numberOfInvocations = 0;

    public static void main(String[] args)
    {
        int i;
        StaticDemo object1 = new StaticDemo();
        for (i = 1; i <=10 ; i++)
           object1.outPutCountOfInvocations();
    
        StaticDemo object2 = new StaticDemo();
        for (i = 1; i <=10 ; i++)
           object2.justADemoMethod();

        System.out.println("Total number of invocations = "
                           + numberSoFar());
    }

    public void justADemoMethod()
    {
        numberOfInvocations++;
        //In a real example, more code would go here.
    }

    public void outPutCountOfInvocations()
    {
        numberOfInvocations++;
        System.out.println(numberOfInvocations);
    }

    public static int numberSoFar()
    {
        numberOfInvocations++;
        return numberOfInvocations;
    }
}