import java.util.Scanner;

public class IT26102550Lab9Q4{
	public static void main (String[] args){
		
		Scanner input= new Scanner(System.in);
		
		double assignmentMark[]= new double[5];
		double examPaperMark[]= new double[5];
		double finalMark []= new double [5];
		
		char []finalGrade = new char [5];
		
		String [] name= new String [5];
		
		
		
		//input students details
		for (int i=0;i<5;i++){
			
			System.out.println("Student no: "+(i+1)+" ");
			
			System.out.println("Enter Your name: ");
			name[i]= input.nextLine();
			
			
			System.out.println("Enter Your Assignment Mark: ");
			assignmentMark[i]= input.nextDouble();
			
			
			System.out.println("Enter Your Exam Paper Mark: ");
			examPaperMark[i]= input.nextDouble();
			
			
			finalMark[i] = calcFinalMark(assignmentMark[i],examPaperMark[i]);
			finalGrade[i]= findGrade(finalMark[i]);
		}
	
		System.out.print ("name \t\t finalMark \t\t Grade");
		
		for (int i=0;i<5;i++){
			printDetails(name[i], finalMark[i], finalGrade[i]);
		}
	}
	
	public static double calcFinalMark(double assignmentMark, double examPaperMark){
		return assignmentMark*0.3 + examPaperMark*0.7;
		
	}
	
	public static char findGrade(double finalMark){
		 if (finalMark>=75){
			return 'A';
		}
		
		else if (finalMark>=60){
			return 'B';
		}
		else if (finalMark>=50){
			return 'C';
		}
		else {return 'F';}
	}
	
	public static void printDetails(String name, double finalMark, char grade){
		System.out.println (name +"\t\t"+ String.format("@.2f",finalMark)+"\t\t"+grade);

	}
	
}