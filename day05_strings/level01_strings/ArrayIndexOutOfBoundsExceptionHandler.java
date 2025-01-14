import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionHandler {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // creating an array of names and take input from the user
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
		
		//new line 
		input.nextLine();

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        // Calling the method to generate the exception
        System.out.println("\nDemonstrating exception generation:");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic exception caught in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        System.out.println("\nDemonstrating exception handling:");
        handleException(names);
    }
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        
		// Attempting to access an index beyond the array's length
        System.out.println("Accessing index 10: " + names[10]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        System.out.println("Handling ArrayIndexOutOfBoundsException...");
        try {
            // Attempting to access an index beyond the array's length
            System.out.println("Accessing index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Length of array is less than 10. ");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: Length of array is less than 10.");
        }
    }
}
