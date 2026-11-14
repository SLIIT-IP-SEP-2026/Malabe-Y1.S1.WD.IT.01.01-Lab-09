import java.util.Scanner;

public class IT26102095Lab9Q1 {

    public static void calculateRoots(double a, double b, double c) {
        if (a == 0) {
            System.out.println("a must not be zero.");
            return;
        }

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("There are no real roots.");
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			
			System.out.println();
			System.out.println("Roots are real and different :");
            System.out.println("Root 1: " + x1);
            System.out.println("Root 2: " + x2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        calculateRoots(a, b, c);

        
    }
}
