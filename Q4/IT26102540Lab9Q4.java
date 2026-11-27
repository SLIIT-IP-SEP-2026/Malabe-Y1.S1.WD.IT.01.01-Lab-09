import java.util.Scanner;

public class IT26102540Lab9Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = input.nextDouble();

            finalMarks[i] = calcFinalMark(assignment, exam);
            System.out.println();
        }

        System.out.println("Name\t\tFinal Mark\tGrade");
        for (int i = 0; i < 5; i++) {
            String grade = findGrades(finalMarks[i]);
            printDetails(names[i], finalMarks[i], grade);
        }
    }
   
    public static double calcFinalMark(double assignment, double exam) {
        double finalMark = assignment * 0.3 + exam * 0.7;
        return finalMark;
    }
   
    public static String findGrades(double mark) {
        if (mark >= 75) {
            return "A";
        } else if (mark >= 60) {
            return "B";
        } else if (mark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void printDetails(String name, double finalMark, String grade) {
        System.out.println(name + "\t\t" + finalMark + "\t\t" + grade);
    }
}