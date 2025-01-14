import java.util.Scanner;
import java.lang.Math;
public class NumberChecker2 {
	
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
	
	//method to check whether two arrays are palindrome or not
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
	
	//method to check whether number is armstrong of not
	public static boolean isArmStrong(int number) {
		
		//creating an array digits to store digits of number
		int digits[] = digitOfNumber(number);
		
		//creating a variable arm to store the sum of cubes of digits
		int arm = 0;
		//iterating through each element of array
		for(int i=0; i<(digits.length); i++) {
			arm += Math.pow(digits[i],3);
			
		}
		
		//returning true if number is armstrong else false
		if(arm == number) {
			return true;
		} else {
			return false;
		}
	}
	
	//method to find smallest and second smallest digits
	public static int[] smallestAndSecondSmallestDigits(int number) {
		
		//creating an array digits to store digits of number
		int digits[] = digitOfNumber(number);
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest =Integer.MAX_VALUE;
		
		//finding smallest and second smallest digits
		for(int value: digits) {
			if(value < smallest) {
				secondSmallest = smallest;
				smallest = value;
			} else if (value < secondSmallest && value != smallest) {
                secondSmallest = value; 
            }
		}
		
		//creating array to store smallest and second Smallest values
		int[] smallestAndSecondSmallest = {smallest, secondSmallest};
		
		//returning the smallest and second Smallest values
		return smallestAndSecondSmallest;
	}
	
	//method to find largest and second largest digits
	public static int[] largestAndSecondLargestDigits(int number) {
		
		//creating an array digits to store digits of number
		int digits[] = digitOfNumber(number);
		
		int largest = Integer.MIN_VALUE;
		int secondLargest =Integer.MIN_VALUE;
		
		//finding largest and second largest digit
		for(int value: digits) {
			if(value > largest) {
				secondLargest = largest;
				largest = value;
			} else if (value > secondLargest && value != largest) {
                secondLargest = value; 
            }
		}
		
		//creating array to store largest and second largest values
		int[] largestAndSecondLargest = {largest, secondLargest};
		
		//returning the largest and second largest values
		return largestAndSecondLargest;
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
		
		//creating the variables largest, secondLargest, smallest and secondSmallest to storing the largest digit, second largest digit, smallest digit and second smallest digit
		int largest = largestAndSecondLargestDigits(number)[0];
		int secondLargest =  largestAndSecondLargestDigits(number)[1];
		int smallest = smallestAndSecondSmallestDigits(number)[0];
		int secondSmallest = smallestAndSecondSmallestDigits(number)[1];
		
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
		//printing whether the number is armstrong number or not
		if(isArmStrong(number)) {
			System.out.println("It is a armstrong number.");
		} else {
			System.out.println("It is not a armstrong number.");
		}
		//printing the largest and second largest digits
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("Largest digit: " + largest);
            System.out.println("No second largest digit (all elements might be the same).");
        } else {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }
		
		//printing the largest and second largest digits
		if (secondSmallest == Integer.MAX_VALUE) {
			System.out.println("Smallest digit: " + smallest);
            System.out.println("No second smallest digit (all elements might be the same).");
        } else {
            System.out.println("Smallest digit: " + smallest);
            System.out.println("Second smallest digit: " + secondSmallest);
        }
		
		//closing the input object
		input.close();
	}
}
