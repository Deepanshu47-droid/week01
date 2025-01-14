
			
import java.util.Scanner;

public class LargestTwoDigits2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking number as user input 
        System.out.print("Enter a number to know the largest and second largest digit: ");
        int number = input.nextInt();

        // creating an array to store the digits, with max size set to maxDigit
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0; 

        // Extracting digits from the number and store in the array
        while (number != 0) {
			
            if (index == maxDigit) {
                if (index == maxDigit) {
					// Increase the size of the array
					maxDigit += 10; 
					// Creating a new temporary array
					int[] temp = new int[maxDigit]; 
					// Copying existing array
					System.arraycopy(digits, 0, temp, 0, digits.length); 
					// Reassigning digits array to the temp array
					digits = temp; 
            }
			
            }
			 // Extracting the last digit
            digits[index] = number % 10;
            // Removing the last digit from the number
			number /= 10; 
            // increasing index
			index++; 
        }

        // creating Variables to store the largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                // Updating second largest before updating largest
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                // Updating second largest if current digit is less than largest but greater than second largest
                secondLargest = digits[i];
            }
        }

        // Displaying the results
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);

        // Closing input object
        input.close();
    }
}
