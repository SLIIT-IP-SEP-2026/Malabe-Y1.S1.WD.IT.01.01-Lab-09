import java.util.Scanner;
public class IT26102626Lab9Q2{
	
	//Main method
 public static void main(String[]args){
	 
	 //Create a scanner object for input
  Scanner input = new Scanner(System.in);
  
  //Getting user input
  System.out.print("Enter radius :");
  double radius = input.nextDouble();
  
  //Calling circleArea method and passing radius as a parameter 
  double area = circleArea(radius);
  
  //Displaying the result
  System.out.print("Circle Area is: " + area);
 }
	
	//Creating a method to find the area of a circle
 public static double circleArea(double radius){
  double Area = 3.14*radius*radius;
  return Area;
 }
}
