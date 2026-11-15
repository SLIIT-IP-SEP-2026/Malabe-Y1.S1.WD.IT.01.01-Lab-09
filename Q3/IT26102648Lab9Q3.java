import java.util.Scanner;

public class IT26102648Lab9Q3 {
	public static int add(int value1,int value2){
		//calculating and returning the sum
		return value1+value2;
	}
	
	public static int multiply(int value1,int value2){
		//calculating and returning the multiplied value
		return value1*value2;
	}
	
	public static int square(int value){
		//calculating and return the squared value
		return value*value;
	}
	
	public static void main(String[]args){
		
		// calculating first expression
		System.out.print("Result of (3 * 4 + 5 * 7)^2 \t\t : ");
		System.out.print(square(add(multiply(3,4),multiply(5,7)))+ "\n");
		
		// calculating second expression
		System.out.print("Result of ( 4 + 7 )^2 + ( 8 + 3 )^2 \t : ");
		System.out.print(add(square(add(4,7)),square(add(8,3)))+ "\n");
	}
}