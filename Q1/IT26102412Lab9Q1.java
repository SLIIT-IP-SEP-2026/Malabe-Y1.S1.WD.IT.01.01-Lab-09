import java.util.Scanner;

public class IT26102412Lab9Q1{
    public static void main (String[]args){

        // Declare variables to store quadratic equation coefficients
        double aValue, bValue, cValue;

        // Create Scanner object to get user inputs
        Scanner input = new Scanner(System.in);

        // Get the values of a, b and c
        System.out.print("Enter value a: ");
        aValue = input.nextDouble();

        System.out.print("Enter value b: ");
        bValue = input.nextDouble();

        System.out.print("Enter value c: ");
        cValue = input.nextDouble();


        // Calculate the two roots using the quadratic formula
        double root1 = (-bValue + (Math.sqrt(Math.pow(bValue,2)-4*aValue*cValue)))/(2*aValue);
        double root2 = (-bValue - (Math.sqrt(Math.pow(bValue,2)-4*aValue*cValue)))/(2*aValue);

        // Calculate the discriminant to determine the number of real roots
        double noOfRoots = Math.pow(bValue,2)-4*aValue*cValue;

        // Check whether the equation has two different real roots
        if(noOfRoots > 0){
            System.out.println("Roots are real and different :");
            System.out.printf("Root 1: %.2f%n",root1);
            System.out.printf("Root 2: %.2f%n",root2);

        // Check whether the equation has only one real root
        }else if(noOfRoots == 0){
            System.out.println("Only one root:");
            System.out.printf("Root: %.2f%n",root1);

        // Display a message if there are no real roots
        }else{
            System.out.println("No real roots");
        }
    }
}