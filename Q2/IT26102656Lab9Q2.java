import java.util.Scanner;

public class IT26102656Lab9Q2{

    // Declare a constant value for PI
    public static final double PI = 3.14159;

    public static void main (String[]args){

        // Declare variables to store radius and area
        double radius, area;

        // Create Scanner object to get user inputs
        Scanner input = new Scanner(System.in);

        // Get the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();

        // Calculate the area by calling the method
        area = circleArea(radius);

        // Display the calculated area
        System.out.println("The area of the circle with radius " + radius + " is : " + area);
    }

    // Method to calculate and return the area of the circle
    public static double circleArea(double radius){

        // Calculate the area using the circle area formula
        return PI * Math.pow(radius, 2);
    }
}