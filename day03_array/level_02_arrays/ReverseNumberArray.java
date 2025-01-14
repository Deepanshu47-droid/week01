import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //Finding the count of digits in the number
        int temp = number;
        int digitCount = 0;

        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        //Storing the digits in an array
        int[] digits = new int[digitCount];
        temp = number; // Reset temp to the original number
        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10; // Extract the last digit
            temp /= 10; // Remove the last digit
        }

        //Creating an array to store the digits in reverse order
        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[i];
        }

        //Displaying the reversed array
        System.out.print("Reversed number: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }

        // Closing the input
        input.close();
    }
}
