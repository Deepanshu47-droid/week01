import java.util.Scanner;
public class NatureOfNumberWithMethod {

	/*method to check whether the number is positive negative or zero*/
	public int natureEvaluation(int number) {
		
		// Check if the number is positive, negative, or zero
		if (number > 0) {
			return 1;
		} else if (number < 0) {
			return -1;
		} else {
			return 0;
		}
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
       
		// Taking user input for the number
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		//creating object obj for calling the method
		NatureOfNumberWithMethod obj = new NatureOfNumberWithMethod();
		
		//calling the method and storing the result in result variable
		 int result = obj.natureEvaluation(number);
		
		//printing results
		if (result == 1) {
			System.out.println("The number is positive.");
		} else if (result == -1) {
			System.out.println("The number is negative.");
		} else {
			System.out.println("The number is zero.");
		}
		
		//closing the input object
		input.close();

	}
}		
		
		