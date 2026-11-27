import java.util.Scanner;
public class IT26102626Lab9Q1{
	public static void main(String[]args){
		
		//Create a Scanner object for input
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		double num1,num2,num3,result1,result2;
		
		System.out.print("Enter value a : ");
		num1 = input.nextDouble();
		System.out.print("Enter value b : ");
		num2 = input.nextDouble();
		System.out.print("Enter value c : ");
		num3 = input.nextDouble();
		
		result1 = (-num2 + Math.sqrt(Math.pow(num2,2)-4*num1*num3))/(2*num1);
		result2 = (-num2 - Math.sqrt(Math.pow(num2,2)-4*num1*num3))/(2*num1);
		
		System.out.println();
		System.out.println("Roots are real and different: ");
		System.out.println("Root 1: " + result1);
		System.out.print("Root 2: " + result2);
		
	}
}