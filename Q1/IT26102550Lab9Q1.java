import java.util.Scanner;

public class IT26102550Lab9Q1 {

	public static void main(String[]args){
		
		Scanner input= new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Enter the value for a: ");
		a= input.nextInt();
		
		System.out.println("Enter the value for b: ");
		b= input.nextInt();
		
		System.out.println("Enter the value for c: ");
		c= input.nextInt();
		
		double power= pow(b);
		double sqrtM= sqrt(a,b,c,power);
		
		double x1 = ((-b + sqrtM)/(2*a));
		double x2 = ((-b - sqrtM)/(2*a));
		
		System.out.println("Root 1 is "+x1);
		System.out.println("Root 2 is "+x2);
		
	}
		
		public static int pow( int b){
			return b*b;
			}
		
		public static double sqrt (int a,int b, int c, double power){
			return Math.sqrt(power-4*a*c);
			} 
		
		
		
		
	

}