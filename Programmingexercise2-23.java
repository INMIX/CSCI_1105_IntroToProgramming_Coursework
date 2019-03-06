import java.util.Scanner;

public class CostOfDriving {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter the distance of the trip
		System.out.print("How many miles is the trip?: ");
		double miles = input.nextDouble();
		
		//Prompt user for gas mileage of their vehicle
		System.out.print("Enter the mileage per gallon of vehicle: ");
		double milage = input.nextDouble();
		
		//Prompt user for the dollar per gallon.
		System.out.print("Enter the current price per gallon of fuel: ");
		double price = input.nextDouble();
		
		//Compute information
		double numberOfGallons = miles / mileage;
		double cost = numberOfGallons * price;
		
		
		//Display to console
		System.out.println("The cost to drive " + miles + " miles " + " at " + price + " per gallon" + " is " + cost);
		

	}
}
