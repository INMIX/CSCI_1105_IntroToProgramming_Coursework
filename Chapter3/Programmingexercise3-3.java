import java.util.Scanner;	
public class SolveLinearEquations {
	
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// Solve the 2*2 Linear equation located in module one
		
		//Promt user for values of a, b, c, d, e, and f.
		System.out.print("Enter a value for a: ");		
		double a = in.nextDouble();
		System.out.print("Enter a value for b: ");		
		double b = in.nextDouble();
		System.out.print("Enter a value for c: ");
		double c = in.nextDouble();
		System.out.print("Enter a value for d: ");	
		double d = in.nextDouble();
		System.out.print("Enter a value for e: ");
		double e = in.nextDouble();
		System.out.print("Enter a value for f: ");
		double f = in.nextDouble();
		
		if ((a*d) - (b*c) != 0) {
			
			double x = ((e*d) - (b*f)) / ((a*d) - (b*c));
			double y = ((a*f) - (e*c)) / ((a*d) - (b*c));
			System.out.println("x =" + x);
			System.out.println("y =" + y);
	
		}
		
		else { 
			System.out.println("The equation has no solution");
		}	
		
	}

}
