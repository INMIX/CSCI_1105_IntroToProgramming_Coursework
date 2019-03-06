import java.util.Scanner;

public class ConvertFehrenheitToCelsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user for degrees in Celsius
		System.out.print("Enter the current temperature in Celsius: ");
		double celsius = input.nextDouble();
		
		//Convert celsius to fahrenheit
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		//Display results on console
		System.out.println("The current temperature in Fahrenheit is " + fahrenheit);

	}

}
