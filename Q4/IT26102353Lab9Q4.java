import java.util.Scanner;

public class IT26102353Lab9Q4 {

    public static double calcFinalMark(double assignmentMark, double examMark) {

        double finalMark = (assignmentMark * 0.30) + (examMark * 0.70);

        return finalMark;
    }

    public static String findGrades(double mark) {

        if (mark >= 75) {
            return "A";
        }
        else if (mark >= 60) {
            return "B";
        }
        else if (mark >= 50) {
            return "C";
        }
        else {
            return "F";
        }
    }

    public static void printDetails(String name, double finalMark, String grade) {

        System.out.printf("%-15s %-15.2f %-5s%n", name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] assignmentMarks = new double[5];
        double[] examMarks = new double[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for "
                    + names[i] + ": ");
            assignmentMarks[i] = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for "
                    + names[i] + ": ");
            examMarks[i] = input.nextDouble();

            input.nextLine();

            finalMarks[i] = calcFinalMark(assignmentMarks[i], examMarks[i]);

            grades[i] = findGrades(finalMarks[i]);

            System.out.println();
        }

        System.out.printf("%-15s %-15s %-5s%n",
                "Name", "Final Mark", "Grade");

        for (int i = 0; i < 5; i++) {

            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}