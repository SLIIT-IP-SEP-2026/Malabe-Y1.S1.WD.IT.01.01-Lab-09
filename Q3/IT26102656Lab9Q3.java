public class IT26102656Lab9Q3{
	public static void main (String[]args){
		
		// Declare variables to store the calculated results
		double firstAnswer, secondAnswer;
		
		// Calculate the first expression by calling the required methods
		firstAnswer = square(add(multiply(3, 4) ,multiply(5, 7)));
		
		// Calculate the second expression by calling the required methods
		secondAnswer = add(square(add(4, 7)), square(add(8, 3)));
		
		// Display the results of both expressions
		System.out.print("Results of (3 * 4 + 5 * 7)^2        : ");
		System.out.println(firstAnswer);
		
		System.out.print("Results of (4 + 7)^2 + (8 + 3)^2    : ");
		System.out.println(secondAnswer);
	}
	
	// Method to add two integer values and return the result
	public static double add(double addValue1, double addValue2){
			return addValue1 + addValue2;
	}
	
	// Method to multiply two integer values and return the result
	public static double multiply(double mulValue1, double mulValue2){
			return mulValue1 * mulValue2;
	}
	
	// Method to calculate the square of a value and return the result
	public static double square(double sqrValue){
			return Math.pow(sqrValue, 2);
	}
}