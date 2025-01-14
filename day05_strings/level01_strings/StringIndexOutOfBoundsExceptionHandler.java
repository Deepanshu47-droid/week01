import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionHandler {

	public static void main(String[] args) {
        
		//creating scanner object to take input
		Scanner input = new Scanner(System.in); 

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        // Calling the method to generate the exception
        System.out.println("\nDemonstrating exception generation: ");
        try {
            generateException(inputString);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Calling the method to handle the exception
        System.out.println("\nDemonstrating exception handling:");
        handleException(inputString);
    }
	
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String inputString) {
        System.out.println("Generating StringIndexOutOfBoundsException...");
        
		// Accessing index beyond the length of the string
        System.out.println("Character at index 10: " + inputString.charAt(10));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String inputString) {
        
		System.out.println("Handling StringIndexOutOfBoundsException...");
        try {
		
            // Accessing index beyond the length of the string
            System.out.println("Character at index 10: " + inputString.charAt(10));
			
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught! String length is less than 10.");
        }
    }
}