import java.util.Scanner;
public class UtilityConvertor {

	// Conversion factor for kilometers to miles
    private static final double KM_TO_MILES = 0.621371;

    // Conversion factor for miles to kilometers
    private static final double MILES_TO_KM = 1.60934;

    // Conversion factor for meters to feet
    private static final double METERS_TO_FEET = 3.28084;

    // Conversion factor for feet to meters
    private static final double FEET_TO_METERS = 0.3048;
	
	//method to convert kilometers to miles
	public static double kilometerToMile(double kilometer) {
		return (kilometer * KM_TO_MILES);
	}
	
	public static double mileToKilometer(double mile) {
		return (mile * MILES_TO_KM);
	}
	
	//method to convert meter to feet
	public static double meterToFeet(double meter) {
		return (meter * METERS_TO_FEET);
	}
	
	//method to convert feet to meter
	public static double feetToMeter(double feet) {
		return (feet * FEET_TO_METERS);
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
		System.out.print("Enter your choice \n1 to convert kilometer to mile \n2 to convert miles to kilometer \n3 to convert meter to feet \n4 to convert feet to meter \n");
		choice = input.nextInt();
		
		//calling the respective method to perform desired operation
		switch (choice) {
			case 1 : {
				
				//calling the method kilometeToMile to convert kilometer to mile
				result = kilometerToMile(distance);
				
				//printing the results
				System.out.print("The distance in kilometer is " + distance + " and in mile is " + result);
				break;
			}
			case 2 : {
				
				//calling the method mileToMile to convert kilometer to mile
				result = mileToKilometer(distance);
				
				//printing the results
				System.out.print("The distance in mile is " + distance + " and in kilometer is " + result);
				break;
			}
			case 3 : {
				
				//calling the metmileToFeet to convert meter to feet
				result = meterToFeet(distance);
				
				//printing the results
				System.out.print("The distance in meter is " + distance + " and in feet is " + result);
				break;
			}
			case 4 : {
				
				//calling the methodfeetToMeter to convert feet to meter
				result = feetToMeter(distance);
				
				//printing the results
				System.out.print("The distance in feet is " + distance + " and in meter is " + result);
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