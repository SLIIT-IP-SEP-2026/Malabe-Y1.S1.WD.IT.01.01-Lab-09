import java.util.Scanner;

public class IT26102648Lab9Q1 {
	public static void main(String[]args){
		//Declaring variables
		double a,b,c,root1,root2,discriminant;
		
		//Declaring the scanner
		Scanner input = new Scanner(System.in);
		
		//Getting inputs
		// for a
		System.out.print("Enter value a: ");
		a = input.nextDouble();
		
		//validating a
		while (a==0){
			System.out.print("Error: a cannot be zero");
			System.out.print("Enter value a: ");
			a = input.nextDouble();
		}
		
		//for b
		System.out.print("Enter value b: ");
		b = input.nextDouble();
		
		//validating b
		while (b==0){
			System.out.print("Error: b cannot be zero");
			System.out.print("Enter value b: ");
			b = input.nextDouble();
		}
		//for c
		System.out.print("Enter value c: ");
		c = input.nextDouble();
		
		System.out.println();
		
		//Calculating discriminant
		discriminant = Math.pow(b,2) - 4*a*c;
		
		if(discriminant<0){
			System.out.println("Roots are not real");
		}else if (discriminant==0){
			System.out.println("Roots are real and same :");
			System.out.println("Root is : " + (-b/2*a));
		}else {
			System.out.println("Roots are real and different :");
			root1 = (-b + Math.sqrt(discriminant))/(2*a);
			root2 = (-b - Math.sqrt(discriminant))/(2*a);
			System.out.println("Roots 1: "+ root1);
			System.out.println("Roots 2: "+ root2);
		}
	}
}