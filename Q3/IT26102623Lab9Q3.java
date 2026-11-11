import java.util.Scanner;
public class IT26102623Lab9Q3
{
	
	public static void main(String[] args)
	{
		int result1 = square(add(multiply(3,4),multiply(5,7)));
		int result2 = add(square(add(4,7)),square(add(8,3)));
		
		System.out.println ("Result of ( 3* 4 + 5 * 7)^2   : "+ result1);
		System.out.println ("Result of (4 + 3)^2 + (8 + 3)^2  : " +result2);
	}
	//Create method for Addition
	public static int add(int num1, int num2)
	{
		return num1 + num2;
	}
	
	//Create method for Multiplication
	public static int multiply(int num1, int num2)
	{
		return num1 * num2;
	}
	
	//Create method for Square
	public static int square(int num)
	{
		return num * num;
	}
}
	
	