import java.util.Scanner;

public class IllegalArgumentExceptionHandler {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        // Calling the method to generate the exception
        System.out.println("\nDemonstrating exception generation:");
        try {
            generateException(inputString);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic Exception exception caught in main: " + e.getMessage());
        }

        // Calling the method to handle the exception
        System.out.println("\nDemonstrating exception handling:");
        handleException(inputString);
    }
	
    // Method to generate IllegalArgumentException
    public static void generateException(String inputString) {
        System.out.println("Generating IllegalArgumentException...");
        
		// Using substring() with start index greater than end index
        String result = inputString.substring(5, 2);
        System.out.println("Substring: " + result);
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String inputString) {
        System.out.println("Handling IllegalArgumentException...");
        try {
            // Using substring() with start index greater than end index
            String result = inputString.substring(5, 2);
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Enter valid range.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: Enter valid range.");
        }
    }
}