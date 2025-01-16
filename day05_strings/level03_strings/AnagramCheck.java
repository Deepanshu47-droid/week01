import java.util.Scanner;

public class AnagramCheck {
	// Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user inputs for two texts
        System.out.print("Enter the first text: ");
        String text1 = input.nextLine();
        
        System.out.print("Enter the second text: ");
        String text2 = input.nextLine();

        // Checking if the two texts are anagrams
        if (areAnagrams(text1, text2)) {
            System.out.println(text1 + " and " + text2 + " are anagrams.");
        } else {
            System.out.println(text1 + " and " + text2 + " are not anagrams.");
        }

        input.close();
    }
    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Checking if the lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Creating arrays to store the frequency of characters
        int[] freqText1 = new int[256]; 
        int[] freqText2 = new int[256]; 

        // Finding the frequency of characters in the two texts
        for (int i = 0; i < text1.length(); i++) {
            freqText1[text1.charAt(i)]++;
            freqText2[text2.charAt(i)]++;
        }

        // Comparing the frequency of characters in both texts
        for (int i = 0; i < 256; i++) {
            if (freqText1[i] != freqText2[i]) {
                return false;
            }
        }

        // If all frequencies match, the texts are anagrams
        return true;
    }
}
