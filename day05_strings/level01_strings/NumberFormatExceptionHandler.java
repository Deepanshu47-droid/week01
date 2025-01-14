import java.util.Scanner;

public class NumberFormatExceptionHandler {

    // Method to generate NumberFormatException
    public static void generateException(String inputString) {
        System.out.println("Generating NumberFormatException...");
        // Use Integer.parseInt to convert string to integer
        int number = Integer.parseInt(inputString);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String inputString) {
        System.out.println("Handling NumberFormatException...");
        try {
            // Use Integer.parseInt to convert string to integer
            int number = Integer.parseInt(inputString);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Accepting only integers.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: Accepting only integers");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        // Calling the method to generate the exception
        System.out.println("\nDemonstrating exception generation:");
        try {
            generateException(inputString);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic exception caught in main: " + e.getMessage());
        }

        // Calling the method to handle the exception
        System.out.println("\nDemonstrating exception handling:");
        handleException(inputString);
    }
}
