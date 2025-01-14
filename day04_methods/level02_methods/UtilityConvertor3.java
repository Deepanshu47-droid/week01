
import java.util.Scanner;
public class UtilityConvertor3 {

	// Conversion factor for pound to kilogram
    private static final double POUND_TO_KILOGRAM = 0.453592;

    // Conversion factor for kilogram to pound
    private static final double KILOGRAM_TO_POUND = 2.20462;

    // Conversion factor for gallon to liter
    private static final double GALLON_TO_LITER = 3.78541;

    // Conversion factor for liter to gallon
    private static final double LITER_TO_GALLON = 0.264172;

	//method to convert farhenheit to celsius
	public static double farhenheitToCelsius(double farhenheit) {
		
		//creating celsius variable to indicate temperature inn celsius
		double celsius = (farhenheit - 32) * 5 / 9;
		
		//returning the temperature in celsius
		return celsius;
	}
	
	//method to convert celsius to farhenheit
	public static double celsiusToFarhenheit(double celsius) {
		
		//creating celsius variable to indicate temperature in celsius
		double farhenheit = (celsius * 9 / 5) + 32;
		
		//returning the temperature in farhenheit
		return farhenheit;
	}

	//method to convert pound to kilogram
	public static double poundToKilogram(double pound) {
		return (pound * POUND_TO_KILOGRAM);
	}
	
	//method to convert kilogram to pound
	public static double kilogramToPound(double kilogram) {
		return (kilogram * KILOGRAM_TO_POUND);
	}
	
	//method to convert gallon to liter
	public static double gallonToLiter(double gallon) {
		return (gallon * GALLON_TO_LITER);
	}
	
	//method to convert liter to gallon
	public static double literToGallon(double liter) {
		return (liter * LITER_TO_GALLON);
	}
	
	public static void main(String[] args) {
		
		//creating Scanner object for taking inputs
		Scanner input = new Scanner(System.in);
		
		/*creating variables distance, choice and result to indicate distance entered 
		by user, choice of user and respective distance after conversion respectively*/
		double initialUnit, resultUnit;
		int choice;
		
		
		// asking the user to select the desired operation to perform and taking user input
		System.out.print("Enter your choice \n1 to convert farhenheit to celsius \n2 to convert celsius to farhenheit \n3 to convert pound to kilogram \n4 to convert kilogram to pound \n5 to convert gallon to liter \n6 to convert liter to gallon \n");
		choice = input.nextInt();
		
		//calling the respective method to perform desired operation
		switch (choice) {
			case 1 : {
				
				//taking user input
				System.out.print("Enter temperature in farhenheit : ");
				initialUnit = input.nextDouble();
				
				//calling the method farhenheitToCelsius to convert farhenheit to celsius
				resultUnit = farhenheitToCelsius(initialUnit);
				
				//printing the results
				System.out.print("The temperature in farhenheit is " + initialUnit + " and in celsius is " + resultUnit);
				break;
			}
			case 2 : {
				
				//taking user input
				System.out.print("Enter temperature in celsius : ");
				initialUnit = input.nextDouble();
				
				//calling the method celsiusToFarhenheit to convert celsius to farhenheit
				resultUnit = celsiusToFarhenheit(initialUnit);
				
				//printing the results
				System.out.print("The temperature in celsius is " + initialUnit + " and in farhenheit is " + resultUnit);
				break;
			}
			case 3 : {
				
				//taking user input
				System.out.print("Enter weight in pound : ");
				initialUnit = input.nextDouble();
				
				//calling the method poundToKilogram to convert pound to kilogram
				resultUnit = poundToKilogram(initialUnit);
				
				//printing the results
				System.out.print("The weight in pound is " + initialUnit + " and in kilogram is " + resultUnit);
				break;
			}
			case 4 : {
				
				//taking user input
				System.out.print("Enter weight in kilogram : ");
				initialUnit = input.nextDouble();
				
				//calling the method kilogramToPound to convert kilogram to pound
				resultUnit = kilogramToPound(initialUnit);
				
				//printing the results
				System.out.print("The weight in kilogram is " + initialUnit + " and in pound is " + resultUnit);
				break;
			}
			case 5 : {
				
				//taking user input
				System.out.print("Enter volume in gallon : ");
				initialUnit = input.nextDouble();
				
				//calling the method gallonToLiter to convert gallon to liter
				resultUnit = gallonToLiter(initialUnit);
				
				//printing the results
				System.out.print("The volume in gallon is " + initialUnit + " and in liter is " + resultUnit);
				break;
			}
			case 6 : {
				
				//taking user input
				System.out.print("Enter weight in pound : ");
				initialUnit = input.nextDouble();
				
				//calling the method liter to gallon to convert liter to gallon
				resultUnit = literToGallon(initialUnit);
				
				//printing the results
				System.out.print("The volume in liter is " + initialUnit + " and in gallon is " + resultUnit);
				break;
			}
			default : {
				System.out.print("You have entered a wrong choice");
			}
		}
		
		//closing the input object
		input.close();
	}
}