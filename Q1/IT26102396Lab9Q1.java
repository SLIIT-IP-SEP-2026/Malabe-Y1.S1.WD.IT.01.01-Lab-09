import java.util.Scanner;

public class IT26102396Lab9Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value c: ");
        double c = sc.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c;   // discriminant

        System.out.println();
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and different :");
            System.out.printf("Root 1: %.2f%n", r1);
            System.out.printf("Root 2: %.2f%n", r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are real and equal :");
            System.out.printf("Root 1 = Root 2: %.2f%n", r);
        } else {
            System.out.println("Roots are imaginary (no real roots)");
        }
    }
}