public class IT26102626Lab9Q3{
	
	//Main method
	public static void main(String[]args){
		
		//Calling methods for necessary calculations and passing appropriate parameters
	 int ans1 = multiply(3,4);
	 int ans2 = multiply(5,7);
	 int ans3 = add(ans1,ans2);
	 int result1 = square(ans3);
	 
	 //Calling methods for necessary calculations and passing appropriate parameters
	 int ans4 = add(4,7);
	 int ans5 = add(8,3);
	 int ans6 = square(ans4);
	 int ans7 = square(ans5);
	 int result2 = add(ans6,ans7);
	 
	 //Displaying the results
	 System.out.println("Result of (3*4+5*7)^2 : " + result1);
	 System.out.print("Result of (4+7)^2 + (8+3)^2 : " + result2);
 }
 
 //Creating a method to add two integers
 public static int add(int num1, int num2){
	 int result = num1+ num2;
	 return result;
 }
 
  //Creating a method to multiply two integers
 public static int multiply(int num1,int num2){
	 int result = num1*num2;
	 return result;
 }
 
  //Creating a method to square an integer
 public static int square(int num){
	int result = num*num;
	return result;
 }
}