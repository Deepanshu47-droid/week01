public class NullPointerExceptionHandler {
	public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException generation: ");
        try {
			// This will throw the exception
            generateException(); 
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main method: " + e.getMessage());
        }

        System.out.println("\nDemonstrating handling of NullPointerException: ");
        
		// This handles the exception
		handleException(); 
    }

    // Method to generate the NullPointerException
    public static void generateException() {
        // Initialize text to null
		String text = null; 
        
		// Attempt to call a String method on null to generate the exception
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle the NullPointerException
    public static void handleException() {
        // Initialize text to null
		String text = null; 
        try {
            // Attempt to call a String method on null
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught! Text is null.");
        }
    }
}