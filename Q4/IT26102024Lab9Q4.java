import java.util.Scanner;

public class IT26102024Lab9Q4{

	public static double calcFinalMark(int assignmentMark, int examMark){

		double finalMark = (assignmentMark * 30 / 100.0) + (examMark * 70 / 100.0);
		return finalMark;

	}

	public static String findGrades(double finalMark){

		String grade;

		if (finalMark >= 75){
			grade = "A";
		}else if (finalMark >= 60){
			grade = "B";
		}else if (finalMark >= 50){
			grade = "C";
		}else{
			grade = "F";
		}

		return grade;

	}

	public static void printDetails(String name, double finalMark, String grade){

		System.out.printf("%-16s%-16.2f%s%n", name, finalMark, grade);

	}

	public static void main (String[]args){

		String[] names = new String[5];
		double[] finalMarks = new double[5];

		int assignmentMark, examMark;

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 5; i++){

			System.out.print("Enter Name of Student "+(i+1)+": ");
			names[i] = input.next();

			System.out.print("Enter Assignment Mark (out of 100) for "+names[i]+": ");
			assignmentMark = input.nextInt();

			System.out.print("Enter Exam Paper Mark (out of 100) for "+names[i]+": ");
			examMark = input.nextInt();

			finalMarks[i] = calcFinalMark(assignmentMark, examMark);

			System.out.println();
		}

		System.out.printf("%-16s%-16s%s%n", "Name", "Final Mark", "Grade");

		for (int i = 0; i < 5; i++){
			printDetails(names[i], finalMarks[i], findGrades(finalMarks[i]));
		}

	}
}
