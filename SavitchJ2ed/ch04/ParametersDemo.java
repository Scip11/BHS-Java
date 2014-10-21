public class ParametersDemo
{
    public static void main(String[] args)
    {
        DemoSpecies s1 = new DemoSpecies(), 
                    s2 = new DemoSpecies();

        s1.set("Klingon Ox", 10, 15);
        s2.set("Ferengie Fur Ball", 90, 56);
        System.out.println("Value of s2 before call to method:");
        s2.writeOutput();
        s1.makeEqual(s2);
        System.out.println("Value of s2 after call to method:");
        s2.writeOutput();

        int aPopulation = 42;
        System.out.println(
                          "Value of aPopulation before call to method: "
                     + aPopulation);
        s1.tryToMakeEqual(aPopulation);
        System.out.println(
                         "Value of aPopulation after call to method: "
                    + aPopulation);
    }
}