import java.util.Scanner;

public class Factors2 {
	public static void main(String[] args) {

	// creating a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// taking a user input for a number
	System.out.print("Enter the number: ");
	int number = input.nextInt();

	// creating integer variable maxFactor and initialize to 10
	int maxFactor = 10, index = 0;

	// Creating an Array of size 5 to store the numbers
	int[] factorArray = new int[maxFactor];

	// iterating the loop from 1 to the number
	for(int i = 1; i<=number; i++) {

		// checking for the factor
		if (number % i == 0 ) {

			// checking index
			if (index == maxFactor) {
				// Double the size of the array
				maxFactor *= 2;
                int[] temp = new int[maxFactor];
                for (int j = 0; j < index; j++) {
                    temp[j] = factorArray[j];
                }
                factorArray = temp;
            }

			factorArray[index] = i;
			index++;
		}
	}

	// Displaying the factors
        System.out.print("Factors of " + number + " are : ");
        for (int i = 0; i < index; i++) {
            System.out.print(factorArray[i] + " ");
        }

	// Closing the Scanner Object
	input.close();

	}
}