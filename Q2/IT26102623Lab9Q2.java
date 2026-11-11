import java.util.Scanner;
public class IT26102623Lab9Q2
{
	
	public static void main(String[] args)
	{
		// Create a new scanner object
		Scanner input = new Scanner(System.in);
		
		// Get radius as input
		System.out.print("Enter the radius of circle : "); 
		double radius = input.nextDouble();
		double area = circleArea(radius);
		
		System.out.print("The area of the circle with radius " + radius+ " is : "+ area);
	}
	
	
		// Create method to calculate area of circle
	
	public static double circleArea(double radius)
	{
		double area = Math.PI * radius * radius;
		return area;
	}
}	