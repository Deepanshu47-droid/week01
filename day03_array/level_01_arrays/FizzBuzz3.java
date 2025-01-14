import java.lang.Integer;
import java.util.Scanner;
public class FizzBuzz3 {
	public static void main(String[] args) {
		
		// Create a Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take user input to indicate number
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		
		//creating array num to store numbers, and fizz buzz
		String num[] = new String[number];
		
		
		// Loop from 0 to the entered number using while loop
		int i=1;
		while (i <= number) {
					
			// Check for multiples of 3 and 5
			if (i % 3 == 0 && i % 5 == 0) {
				num[i-1] = "FizzBuzz";
			} 
			else if (i % 3 == 0) {
				num[i-1] = "Fizz";
			}
			else if (i % 5 == 0) {
				num[i-1] = "Buzz";
			}
			else {
				num[i-1] = Integer.toString(i);
			}
			
			// Increment the counter
			i++;
		}
		
		//printing the array
		
		for(int j=1; j<=number; j++)
		{	
			System.out.println("Position " + j + " = " + num[j-1]);
		}
		
		// Close the scanner
		input.close();
	}
}


