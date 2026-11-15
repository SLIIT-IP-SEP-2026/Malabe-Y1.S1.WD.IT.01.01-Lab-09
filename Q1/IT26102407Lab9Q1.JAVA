import java.util.Scanner;
public class IT26102407Lab9Q1{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		double a,b,c;
		double root1,root2;
		
		System.out.print("Enter value a: ");
		a = input.nextDouble();
		
		System.out.print("Enter value b: ");
		b = input.nextDouble();
		
		System.out.print("Enter value c: ");
		c = input.nextDouble();
		
		System.out.println(" ");
		
		// to check whether the equation is quadratic
		if (a == 0){
			System.out.println("This is not a quadratic equation");
			
		}
	    
		// to check wheter roots are real and different
		else if ((Math.pow(b,2) - 4*a*c)> 0 )
			{
				System.out.println("Roots are real and different");
				root1 = ( -b + (Math.sqrt(Math.pow(b,2) - 4*a*c))) / (2*a);
				root2 = ( -b - (Math.sqrt(Math.pow(b,2) - 4*a*c))) / (2*a);
				System.out.println("Root 1: " + root1);
				System.out.println("Root 2: " + root2);
				
			}
			// to check wheter roots are unreal 
			else if ((Math.pow(b,2) - 4*a*c) < 0)
			{
				System.out.println("Roots are unreal");
			}
			
			// to check wheter roots are real and same
			else{
				
				System.out.println("Roots are real and equal");
				root1 = ( -b + (Math.sqrt(Math.pow(b,2) - 4*a*c))) / (2*a);
				root2 = root1;
				System.out.println("Both Roots are : " + root1);
				
			}
		}
		
	}
