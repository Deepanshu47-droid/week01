
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the number of digits and store the digits in an array
        int temp = number;
        int count = 0;

        // Count the number of digits in the number
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Create an array to store digits
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Create an array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Loop through the digits array and count the frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        input.close();
    }
}

