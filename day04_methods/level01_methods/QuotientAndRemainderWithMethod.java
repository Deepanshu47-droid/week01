import java.util.Scanner;
public class QuotientAndRemainderWithMethod {

	/*method to calculate maximum number of handshakes 
	taking n as parameter indicating the number of persons*/
	public static int[] findRemainderAndQuotient(int number1, int number2) {
		
		// creating array result to store the quotient and remainder of numbers
		int result[] = new int[2];
		 
		//calculating quotient and storing in first index of result array
		result[0] = number1/number2;
		
		//calculating remainder and storing in the second index of array result
		result[1] = number1%number2;
		
		//returning the quotient and remainder of numbers
		return result;
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		/*creating variables number1 and number2 to indicate the number 1 and number 2 respectively*/
		int number1, number2, quotient, remainder;
		
		//taking number1 and number2 as user input
		System.out.print("Enter first number : ");
		number1 = input.nextInt();
		
		System.out.print("Enter second number : ");
		number2 = input.nextInt();
		
		// creating array result to store quotient and remainder of numbers
		int result[] = new int[2];
		
		//calling the method
		result = findRemainderAndQuotient(number1, number2);
		
		//printing smallest and largest one
		System.out.print("The numbers are : " + number1 + " " + number2 + "\nThe quotient is " + result[0] + " and remainder is " + result[1]);
		
		//closing the input object
		input.close();

	}
}		
		
		