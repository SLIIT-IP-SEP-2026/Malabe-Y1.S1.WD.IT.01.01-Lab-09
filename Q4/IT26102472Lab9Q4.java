import java.util.Scanner;

public class IT26102472Lab9Q4 {

    // Calculate Final Mark
    static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.3) + (exam * 0.7);
    }

    // Find Grade
    static String findGrades(double mark) {
        if (mark >= 75)
            return "A";
        else if (mark >= 60)
            return "B";
        else if (mark >= 50)
            return "C";
        else
            return "F";
    }

    // Print Details
    static void printDetails(String name, double mark, String grade) {
        System.out.printf("%-10s %-12.2f %-5s\n", name, mark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] assignment = new double[5];
        double[] exam = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            assignment[i] = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            exam[i] = input.nextDouble();

            System.out.println();
        }

        System.out.println("Name       Final Mark   Grade");

        for (int i = 0; i < 5; i++) {
            double finalMark = calcFinalMark(assignment[i], exam[i]);
            String grade = findGrades(finalMark);

            printDetails(names[i], finalMark, grade);
        }

        input.close();
    }
}