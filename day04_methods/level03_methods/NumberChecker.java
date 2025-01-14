import java.util.Scanner;
public class NumberChecker {
	
	//method to count digits of a number
	public static int digitCounter(int number) {
		
		//putting the value of number in temp variable
		int temp = number;
		
		//creating a variable count to count the digits
		int count = 0;
		
		//counting the digits
		while(temp != 0) {
			//dividing the number by 10
			temp /= 10;
			
			//incrementing the count
			count++;
		}
		//returning the count
		return count;
	}
	
	//method to store digit in array
	public static int[] digitOfNumber(int number) {
		
		//putting the value of number in temp variable
		int temp = number;
		
		//creating a variable index to point index of array
		int index = 0;
		
		//creating the array digits to store digits of number 
		int maxSize = 10;
		int[] digits = new int[maxSize]; 
		
		
		//storing the digits in digits array
		while(temp != 0) {
			
			//increasing the size of digits array if max size reached
			if(index == maxSize) {
				maxSize += 10;
				
				//creating tempARR array 
				int[] tempARR = new int[maxSize];
				
				//copying the digits array into tempARR array
				for(int i=0; i<index+1; i++) {
					tempARR[i] = digits[i];
				}
				digits = tempARR;
				
			}
			//storing the last digit in array
			digits[index] = temp%10;
			
			//dividing the number by 10
			temp /= 10;
			
			//incrementing the index
			index++;
		}
		
		//trimming the extra spaces
		int[] tempARR = new int[index];
		for(int i=0; i<index; i++) {
			tempARR[i] = digits[i];
		}
		digits = tempARR;
		
		//reversing the digits
		digits = reverseArray(digits);
		
		//returning the digits
		return digits;
	}
	
	//method to reverse an array
	public static int[] reverseArray(int[] array) {
		
		//creating array reversedArray array to store reversed array
		int[] reversedArray = new int[array.length];
		
		//reversing the array
		for(int i=0; i<array.length; i++) {
			reversedArray[i] = array[array.length-i-1];
		}
		
		//returning the reversedArray
		return reversedArray;
	}
	
	//method to check whether number palindrome or not
	public static boolean isPalindrome(int number) {
		
		//creating an array digits to store digits of number
		int digits[] = digitOfNumber(number);
		
		//creating an array reversedDigits to store reversed digits of number
		int[] reversedDigits = reverseArray(digits);
		
		//comparing each element of arrays
		for(int i=0; i<(digits.length); i++) {
			
			//returning false if both values are different
			if(digits[i] != reversedDigits[i]) {
				return false;
			}
		}
		//returning true because all elements are same
		return true;
	}
	
	//method to check whether number is duck number or not
	public static boolean isDuckNumber(int number) {
		
		//creating an array digits to store digits of number
		int digits[] = digitOfNumber(number);
	
		//iterating through each element of array
		for(int i=0; i<(digits.length); i++) {
			
			//returning false if element is zero
			if(digits[i] == 0) {
				return false;
			}
		}
		//returning true because all elements are non-zero
		return true;
	}
	
	public static void main(String []args) {
		
		//creating scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		//creating variable number to indicate the number
		int number;
		
		//taking user input for number
		System.out.print("Enter a number : ");
		number = input.nextInt();
		
		//creating variables count to indicate number of digits
		int count = digitCounter(number);
		
		//creating array digits to store digits of number
		int[] digits = digitOfNumber(number);
		
		//creating array reversedDigits to store digits in reversed form
		int[] reversedDigits = reverseArray(digits);
		
		//printing the details
		System.out.println("You Entered " + number);
		
		//printing the count of digits
		System.out.println("Number of digits is : " + count);
		
		//printing the digits of number
		System.out.print("digits are :" );
		for(int i=0; i<digits.length; i++) {
			System.out.print(" " + digits[i]);
		}
		
		//printing the digits of number in reversed form
		System.out.print("\nReversed digits are :" );
		for(int i=0; i<digits.length; i++) {
			System.out.print(" " + reversedDigits[i]);
		}
		
		//printing whether the number is palindrome or not
		if(isPalindrome(number)) {
			System.out.println("\nIt is a palindrome number.");
		} else {
			System.out.println("\nIt is not a palindrome number.");
		}
		
		//printing whether the number is duck number or not
		if(isDuckNumber(number)) {
			System.out.println("It is a duck number.");
		} else {
			System.out.println("It is not a duck number.");
		}
		
		//closing the input object
		input.close();
	}
}
