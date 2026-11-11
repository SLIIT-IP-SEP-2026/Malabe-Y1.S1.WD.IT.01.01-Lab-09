import java.util.Scanner;
public class IT26102623Lab9Q1{
	public static void main(String[] args)
	{
		// Create a new scanner object
		Scanner input = new Scanner(System.in);
		
		// Get input values for a,b,c
		System.out.println("Enter value a: ");
		double a = input.nextDouble();
		
		System.out.println("Enter value b: ");
		double b = input.nextDouble();
		
		System.out.println("Enter value c: ");
		double c = input.nextDouble();
		
		// Find out the discriminant
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		
		// Find out the roots
		double root1 = ((-1 * b) + Math.sqrt(discriminant) ) / (2 * a);
		double root2 = ((-1 * b) - Math.sqrt(discriminant) ) / (2 * a);
		
		
		
		if (a == 0)   // Check the equation as quadratic
		{
		System.out.println("Not a quadratic equation because 'a' is 0.");
		}
		else 
		{
			
			if (discriminant >0)	// Find out the roots are real or not
			{
				System.out.println ("Roots are real and different :") ; 
				System.out.println ("Root 1 : "+ root1);
				System.out.println ("Root 2 : "+ root2);
			}
			else if (discriminant < 0)
			{
				System.out.println ("Roots are not real :");
			}
			else 
			{
				System.out.println ("Roots are real and same :") ;
				System.out.println ("Root 1 : "+ root1);
				System.out.println ("Root 2 : "+ root2);
			}
		}
	}
}
		