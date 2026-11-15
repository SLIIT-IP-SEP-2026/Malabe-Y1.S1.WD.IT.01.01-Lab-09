import java.util.Scanner;
public class IT26102552Lab9Q2{
	public static void main(String[] args){
		
		double radius;
		final double pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the circle:");
		radius = input.nextDouble();
		
		double area = circleArea(radius,pi);
		System.out.print("The area of the circle with radius " + radius + "   is:" +area );
	}
	public static double circleArea(double radius,double pi){
		return pi*radius*radius;
		
	}
}
}