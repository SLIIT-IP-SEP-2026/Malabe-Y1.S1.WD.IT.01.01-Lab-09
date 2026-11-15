import java.util.Scanner;

public class IT26102412Lab9Q4{
	public static void main (String[]args){
		
		// Create Scanner object to get user inputs
		Scanner input = new Scanner(System.in);
		
		// Declare arrays to store student names and marks
		String stuArray[] = new String[5];
		double stuAssiArray[] = new double[5];
		double stuExamArray[] = new double[5];
		
		// Get names, assignment marks and exam marks of five students
		for(int i=0; i < stuArray.length; i++){
			
			System.out.print("Enter Name of Student "+(i+1)+": ");
			stuArray[i] = input.next();
			
			System.out.print("Enter Assignment Mark (out of 100) for "+stuArray[i]+": ");
			stuAssiArray[i] = input.nextDouble();
			
			System.out.print("Enter Exam Paper Mark (out of 100) for "+stuArray[i]+": ");
			stuExamArray[i] = input.nextDouble();
		}
		
		// Calculate final marks by calling the method
		double finalMark[] = clacFinalMark(stuAssiArray, stuExamArray);
		
		// Find grades according to the final marks
		char finalGrade[] = findGrades(finalMark);
		
		// Display student details, final marks and grades
		printDetails(stuArray, finalMark, finalGrade);
	}
	
	
	// Method to calculate final marks using assignment and exam marks
	public static double[] clacFinalMark(double stuAssiArray[], double stuExamArray[]){
		double finalMark[] = new double[stuAssiArray.length];
		
		// Calculate the weighted final mark of each student
		for(int i=0; i < stuAssiArray.length; i++){
			finalMark[i] = (stuAssiArray[i]*0.3) + (stuExamArray[i]*0.7);
		}
		return finalMark;
	}
	
	
	// Method to determine grades according to final marks
	public static char[] findGrades(double finalMark[]){
		char finalGrade[] = new char[finalMark.length];
		
		// Assign grades based on the final marks
		for(int i=0; i < finalMark.length; i++){
			if(finalMark[i] >= 75){
				finalGrade[i] = 'A';
			}else if(finalMark[i] >= 60){
				finalGrade[i] = 'B';
			}else if(finalMark[i] >= 50){
				finalGrade[i] = 'C';
			}else{
				finalGrade[i] = 'F';
			}
		}
		return finalGrade;
	}
	
	
	// Method to display student names, final marks and grades
	public static void printDetails(String stuArray[], double finalMark[], char finalGrade[]){
		System.out.println("Name\t\tFinal Mark\tGrade");
		
		// Display the details of each student
		for(int i=0; i < stuArray.length; i++){
			System.out.println(stuArray[i] + "\t\t" + finalMark[i] + "\t\t" + finalGrade[i]);
		}
	}
	
}