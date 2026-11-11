import java.util.Scanner;
public class IT26102623Lab9Q4
{
	
	public static void main(String[] args)
	{
		// Create Scanner Object for input 
		Scanner input = new Scanner(System.in);
		
		//Create String Array
		String[] names = new String[5];
		
		//Create Double Arrays 
		double assignmentMarks[] = new double[5] ;
		double examMarks[] = new double[5] ;
		double finalmark [] = new double[5] ;
		
		// Create Char Array
		char grades[] = new char[5];
		
		// Input marks of 5 Students
		int count;
		for(count=0; count < 5; count++)
		{
			System.out.println();
			System.out.print("Enter Name of the Student" + (count+1) + ": ");
			names[count]=input.nextLine() ;
			
			System.out.print("Enter Assignment Mark (out of 100) for " + names[count] + ": ");
			assignmentMarks[count]= input.nextDouble();
			
			System.out.print("Enter Exam Mark (out of 100) for " + names[count] + ": ") ;
			examMarks[count]= input.nextDouble();
			input.nextLine();
			
			//Calculate Final mark and grade
			finalmark [count] = calcFinalMark(assignmentMarks[count],examMarks[count]);
			grades[count] = findGrades(finalmark[count]);
			
		}
		System.out.println();
		//Print the headers 
		System.out.println("Name\t\tFinal Mark\tGrade");
		
		
		//Print the Details of 5 students
		for(count = 0; count < 5; count++)
		{
			printDetails(names[count], finalmark[count], grades[count]);
		}
	}
	//Create method for Calculate Final Marks
	public static double calcFinalMark(double assignmentMarks, double examMarks)
	{
		return (assignmentMarks * 0.3) + (examMarks * 0.7) ;
	}
	//Create method for Finding grades
	public static char findGrades(double finalmark)
	{
		if(finalmark >= 75)
		{
			return 'A' ;
		}
		else if( finalmark >= 60)
		{
			return 'B' ;
		}
		else if( finalmark >= 50)
		{
			return 'C' ;
		}
		else
		{
			return 'F'  ;
		}
	}
	 //Create method for printing list
	public static void printDetails(String name, double finalmark, char grades)
	{
		System.out.println(name + "\t\t" + String.format("%.2f", finalmark) + "\t\t" + grades);
	}
			
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		