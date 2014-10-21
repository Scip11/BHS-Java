/******************************************
 *Program to determine area of a circle.
 *Author: Jane Q. Programmer.
 *Email Address: janeq@somemachine.etc.etc.
 *Programming Assignment 2.
 *Last Changed: October 7, 2001.
 ******************************************/
public class CircleCalculation
{
    public static void main(String[] args)
    {
        double radius; //in inches
        double area; //in square inches

        System.out.println("Enter the radius of a circle in inches:");
        radius = SavitchIn.readLineDouble();

        area = 3.14159 * radius * radius;

        System.out.println("A circle of radius " + radius + " inches");
        System.out.println("has an area of " + area + " square inches.");
    }
}