import java.util.Scanner;
public class UtilityConvertor2 {

	// Conversion factor for yard to feet
    private static final double YARD_TO_FEET = 3;

    // Conversion factor for feet to yard
    private static final double FEET_TO_YARD = 0.33333;

    // Conversion factor for meters to inches
    private static final double METERS_TO_INCHES = 39.3701;

    // Conversion factor for inches to meters
    private static final double INCHES_TO_METERS = 0.0254;
	
	// Conversion factor for inches to centimeter
    private static final double INCHES_TO_CM = 2.50;
	
	//method to convert yard to feet
	public static double yardToFeet(double yard) {
		return (yard * YARD_TO_FEET);
	}
	
	//method to convert feet to yard
	public static double feetToYard(double feet) {
		return (feet * FEET_TO_YARD);
	}
	
	//method to convert meter to inches
	public static double meterToInches(double meter) {
		return (meter * METERS_TO_INCHES);
	}
	
	//method to convert inches to meter
	public static double inchesToMeter(double inches) {
		return (inches * INCHES_TO_METERS);
	}
	
	//method to convert inches to centimeter
	public static double inchesToCM(double inches) {
		return (inches * INCHES_TO_CM);
	}
	
	public static void main(String[] args) {
		
		//creating Scanner object for taking inputs
		Scanner input = new Scanner(System.in);
		
		/*creating variables distance, choice and result to indicate distance entered 
		by user, choice of user and respective distance after conversion respectively*/
		double distance, result;
		int choice;
		
		//taking user input
		System.out.print("Enter your value : ");
		distance = input.nextDouble();
		
		// asking the user to select the desired operation to perform and taking user input
		System.out.print("Enter your choice \n1 to convert yard to feet \n2 to convert feet to yard \n3 to convert meter to inches \n4 to convert inches to meter \n5 to convert inches to centimeter \n");
		choice = input.nextInt();
		
		//calling the respective method to perform desired operation
		switch (choice) {
			case 1 : {
				
				//calling the method yardToFeet to convert yard to feet
				result = yardToFeet(distance);
				
				//printing the results
				System.out.print("The distance in yard is " + distance + " and in feet is " + result);
				break;
			}
			case 2 : {
				
				//calling the method feetToYard to convert feet to yard
				result = feetToYard(distance);
				
				//printing the results
				System.out.print("The distance in feet is " + distance + " and in yard is " + result);
				break;
			}
			case 3 : {
				
				//calling the method meterToInches to convert meter to inches
				result = meterToInches(distance);
				
				//printing the results
				System.out.print("The distance in meter is " + distance + " and in inch is " + result);
				break;
			}
			case 4 : {
				
				//calling the method inchesToMeter to convert inches to meter
				result = inchesToMeter(distance);
				
				//printing the results
				System.out.print("The distance in inches is " + distance + " and in meter is " + result);
				break;
			}
			
			case 5 : {
				
				//calling the method inchesToCM to convert inches to centimeter
				result = inchesToCM(distance);
				
				//printing the results
				System.out.print("The distance in inches is " + distance + " and in centimeter is " + result);
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