import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user for starting value of savings.
		System.out.print("What is the starting amount in the savings account?: ");
		double starting = input.nextDouble();
		double monthly = 100;
		
		double firstMonth = starting * (1 + 0.00417);
		double secondMonth = monthly + firstMonth * (1 + 0.00417);
		double thirdMount = monthly + secondMonth * (1 + 0.00417);
		double fourthMonth = monthly + thirdMount * (1 + 0.00417);
		double fifthMonth = monthly + fourthMonth * (1 + 0.00417);
		double sixthMonth = monthly + fifthMonth * (1 + 0.00417);
		
		//Display value of savings account at the sixth month point
		System.out.println("The value of the savings account at six months is " + sixthMonth);
		

	}

}
