import java.util.Scanner;
public class SmallestAndLargest {

	/*method to calculate maximum number of handshakes 
	taking n as parameter indicating the number of persons*/
	public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
		
		// creating array result to store smallest and largest number
		int result[] = new int[2];
		
		//calculating smallest
		if(number1>number2){
			if(number2>number3){
				result[0] = number3;
			} else {
				result[0] = number2;
			} 
		} else {
			if(number1>number3){
				result[0] = number3;
			} else {
				result[0] = number1;
			} 
		}
		
		//calculating largest number
		if(number1<number2){
			if(number2<number3){
				result[1] = number3;
			} else {
				result[1] = number2;
			} 
		} else {
			if(number1<number3){
				result[1] = number3;
			} else {
				result[1] = number1;
			} 
		}       
		
		//returning the smallest and largest number
		return result;
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		// Take user input for the first number
		System.out.print("Enter the first number: ");
		int number1 = input.nextInt();
		
		// Take user input for the second number
		System.out.print("Enter the second number: ");
		int number2 = input.nextInt();
		
		// Take user input for the third number
		System.out.print("Enter the third number: ");
		int number3 = input.nextInt();
		
		// creating array result to store smallest and largest number
		int result[] = new int[2];
		
		//calling the method
		result = findSmallestAndLargest(number1, number2, number3);
		
		//printing smallest and largest one
		System.out.print("The numbers are : " + number1 + " " + number2 + " " + number3 + "\nThe smallest of three numbers is " + result[0] + " and largest is " + result[1]);
		
		//closing the input object
		input.close();

	}
}		
		
		