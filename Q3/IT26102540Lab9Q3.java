 import java.util.Scanner;
public class IT26102540Lab9Q3{
	public static void main(String[] args)
	{
		
		int F1 = multiply(3,4);
		int F1_2 = multiply(5,7);
		int F1_3 = add(F1,F1_2);
		int result  = square(F1_3);
        
		int F2 = add(4,7);
		int F2_1 = square(F2);
		int F2_2 = add(8,3);
		int F2_3 = square(F2_2);
		int result2 = add(F2_1,F2_3);


		System.out.println("Result of (3 * 4 + 5 * 7)²    : " +result);
		System.out.println("Result of (4 + 7)² + (8 + 3)² : "+result2);
	}
	public static int add(int n1, int n2)
	{
		return n1+n2;
	}
	public static int multiply(int n1, int n2)
	{
		return n1*n2;
	}
	public static int square(int n1)
	{
		return n1*n1;
	}
}