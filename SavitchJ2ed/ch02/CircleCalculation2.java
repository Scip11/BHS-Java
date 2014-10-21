/*******************************************
 *Program to determine area of a circle.
 *Author: Jane Q. Programmer.
 *Email Address: janeq@somemachine.etc.etc.
 *Assignment Number: 2.
 *Last Changed: October 7, 2001.
 *********************************************/
public class CircleCalculation2
{
    public static final double PI = 3.14159;
    
    public static void main(String[] args)
    {
        double radius; //in inches
        double area; //in square inches
                
        System.out.println("Enter the radius of a circle in inches:");
        radius = SavitchIn.readLineDouble();
        
        area = PI * radius * radius;
        
        System.out.println("A circle of radius " 
                                   + radius + " inches");
        System.out.println("has an area of " 
                                   + area + " square inches.");
    }

}