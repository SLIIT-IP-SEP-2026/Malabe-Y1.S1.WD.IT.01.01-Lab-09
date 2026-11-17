public class IT26102651Lab9Q3{
	public static void main (String[]args){
		
		int equation1= square(add(multiply(3,4),multiply(5,7)));
		int equation2= add(square(add(4,7)),square(add(8,3)));
		
		System.out.println ("(3*4 + 5*7)^2 is "+equation1);
		System.out.println ("(4 + 7)^2+ (8 + 3)^2 is "+equation2);
		
	}
	
	public static int add(int x, int y){
		return x+y;
		
	}
	
	public static int multiply(int x, int y){
		return x*y;
	}
	
	public static int square(int x){
		return x*x;
		
	}
	
}