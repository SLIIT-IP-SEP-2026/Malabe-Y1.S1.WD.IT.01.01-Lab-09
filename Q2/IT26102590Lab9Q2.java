import java.util.Scanner;

public class IT26102590Lab9Q2{
	public static void main (String [] args){
		
		Scanner input= new Scanner(System.in);
		
	
		final double pi= 3.14;
		
		
		System.out.print("Enter the radius of the circle: ");
		int radius = input.nextInt();
		
		double circleArea= circleArea(radius,pi);
		
		System.out.println("The Area of the circle with " +radius +" is " +circleArea);
	}
	
	public static double circleArea(int radius, double pi){
		
		return pi*radius*radius;
	}
	
}