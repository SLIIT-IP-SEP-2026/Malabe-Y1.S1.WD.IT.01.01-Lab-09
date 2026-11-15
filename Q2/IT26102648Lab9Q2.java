import java.util.Scanner;

public class IT26102648Lab9Q2 {
	public static double circleArea(double radius){
		//Calculating & returning the area
		return (Math.PI*radius*radius);
	}
	
	public static void main(String[]args){
		//Declaring variables
		double radius;
		
		//Declaring Scanner
		Scanner input = new Scanner(System.in);
		
		//Getting input for radius
		System.out.print("Enter the radius of the circle: ");
		radius = input.nextDouble();
		
		//Printing the Area of the circle
		System.out.print("The area of the circle with radius "+ radius +" is : ");
		System.out.print(circleArea(radius));
		
	}
}