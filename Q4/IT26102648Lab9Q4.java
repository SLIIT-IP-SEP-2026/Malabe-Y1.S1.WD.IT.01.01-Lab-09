import java.util.Scanner;

public class IT26102648Lab9Q4 {
	public static double calcFinalMark(double assignmentMarks,double examMarks){
		//calculating and returning the total marks
		return assignmentMarks*0.3 + examMarks*0.7;
	}
	
	public static char findGrades(double mark){
		//calculating and returning the garde character
		if (mark >= 75){
			return 'A';
		}else if (mark >= 60){
			return 'B';
		}else if (mark >= 50){
			return 'C';
		}else {
			return 'F';
		}
	}
	
	public static void printDetails(String name, double marks, char grade){
		//printing the line
		System.out.println(name+"\t\t"+marks+"\t"+grade);
	}
	
	public static void main(String[]args){
		//declaring variables
		double finalMark;
		
		//declaring Array for storing names
		String[] names = new String[5];
		
		//declaring assignmentMarks array to store assignment marks
		double[] assignmentMarks = new double[5];
		
		//declaring examMarks array to store exam marks
		double[] examMarks = new double[5];
		
		//declaring the Scanner
		Scanner input = new Scanner(System.in);
		
		//getting inputs
		for (int i = 0; i<names.length; i++){
			//input name
			System.out.print("Enter Name of Student " + (i+1) + ": ");
			names[i] = input.next();
			
			//input assignment marks
			System.out.print("Enter Assignment Mark (out of 100) for "+ names[i] +": ");
			assignmentMarks[i] = input.nextDouble();
			
			//validating assignment marks
			while (assignmentMarks[i]< 0 || assignmentMarks[i] > 100){
				System.out.println("Error: the marks cannot be higher than 100 or lower than 0");
				System.out.print("Enter Assignment Mark (out of 100) for "+ names[i] +": ");
				assignmentMarks[i] = input.nextDouble();
			}
			
			//input exam paper marks
			System.out.print("Enter Exam Paper Mark (out of 100) for "+ names[i] +": ");
			examMarks[i] = input.nextDouble();
			
			//validating exam paper marks
			while (examMarks[i]< 0 || examMarks[i] > 100){
				System.out.println("Error: the marks cannot be higher than 100 or lower than 0");
				System.out.print("Enter Exam Paper Mark (out of 100) for "+ names[i] +": ");
				examMarks[i] = input.nextDouble();
			}
			
			System.out.println();
		}
		
		//printing the table
		System.out.println("Name\t\tFinal Mark\tGrade");
		
		for (int i = 0; i < names.length; i++){
			finalMark = calcFinalMark(assignmentMarks[i],examMarks[i]);
			printDetails(names[i],finalMark,findGrades(finalMark));
		}
	}
}