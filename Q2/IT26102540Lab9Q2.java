 import java.util.Scanner;
public class IT26102540Lab9Q2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius :");
		double radius = input.nextDouble();
		
		double Area = circleArea(3.14, radius);
		
		System.out.print("The Area is :"+Area);
	}
	public static double circleArea(double pi, double radius)
	{
		return pi*radius*radius;
	}
}