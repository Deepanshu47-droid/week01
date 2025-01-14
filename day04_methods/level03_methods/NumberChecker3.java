import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker3 {
	
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
	
	//method to find sum of digits
	public static int sumOfDigits(int number) {
		
		//creating an array digits to store digits of number
		int digits[] = digitOfNumber(number);
		
		//creating variable sum to indicate the sum of digits
		int sum = 0;
		
		//calculating sum of digits
		for(int i=0; i<(digits.length); i++) {
			sum += digits[i];
		}
		//returning the sum
		return sum;
	}
	
	//method to find sum of squares of digits
	public static int sumOfSquareOfDigits(int number) {
		
		//creating an array digits to store digits of number
		int digits[] = digitOfNumber(number);
		
		//creating variable sumOfSq to indicate the sum squares of digits
		int sumOfSq = 0;
		
		//calculating sum of square of digits
		for(int i=0; i<(digits.length); i++) {
			sumOfSq += digits[i] * digits[i];
		}
		//returning the sum of square of digits
		return sumOfSq;
	}
		
	
	//method to check whether number is harshad number or not
	public static boolean isHarshad(int number) {
		
		//calcuulating sum of digits
		int sumOfDigits = sumOfDigits(number);
		
		//checking number is harshad number or not
		if(number%sumOfDigits == 0) {
			//returning true because number is divisible by sum of digit of number
			return true;
		}
		
		//returning false because number is not divisible by sum of digit of number
		return false;
	}
	
	//method to find frequency of digits in a number
	public static int[][] frequency(int number) {
		
		//creating an array digits to store digits of number
		int digits[] = digitOfNumber(number);
		
		//sorting the array
		Arrays.sort(digits);
		
		//creating a 2d array tempFrequencyArray to store frequency of digits in the form of {digit, frequency}
		int[][] tempFrequencyArray = new int[digits.length][2];
		
		 // Starting with the first number
		int currentNumber = digits[0];
        int count = 0, index = 0;

        // Counting frequencies
        for (int num : digits) {
            if (num == currentNumber) {
                count++;
            } else {
				// Storing the number
                tempFrequencyArray[index][0] = currentNumber; 
				// Storing its frequency
                tempFrequencyArray[index][1] = count;         
                index++;
				// Updating to the next number
                currentNumber = num;  
                count = 1;           
            }
        }

        // Storing the last number and its frequency
        tempFrequencyArray[index][0] = currentNumber;
        tempFrequencyArray[index][1] = count;
        index++;

        // Creating the final 2D array with the exact size
        int[][] frequencyArray = new int[index][2];
        for (int i = 0; i < index; i++) {
            frequencyArray[i][0] = tempFrequencyArray[i][0];
            frequencyArray[i][1] = tempFrequencyArray[i][1];
        }
		//returning the frequencies
		return frequencyArray;
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
		
		//creating variable sumOfDigits to store sum of digits
		int sumOfDigits = sumOfDigits(number);
		
		//creating variable sumOfDigits to store sum of squares of digits
		int sumOfSq = sumOfSquareOfDigits(number);
		
		//creating array digits to store digits of number
		int[] digits = digitOfNumber(number);
		
		//creating a 2d array to store frequencies of number
		int frequencyArray[][] = frequency(number);
		
		//printing the details
		System.out.println("You Entered " + number);
		
		//printing the count of digits
		System.out.println("Number of digits is : " + count);
		
		//printing the digits of number
		System.out.print("digits are :" );
		for(int i=0; i<digits.length; i++) {
			System.out.print(" " + digits[i]);
		}
		//printing the sum of digits
		System.out.println("\nSum of digits is : " + sumOfDigits);
		
		//printing the sum of square of digits
		System.out.println("Sum of square of digits is : " + sumOfSq);
		
		//printing whether the number is harshad or not
		if(isHarshad(number)) {
			System.out.println("It is a harshad number.");
		} else {
			System.out.println("It is not a harshad number.");
		}
		//printing frequencies of each numbers
        System.out.println("Number\tFrequency");
        for (int[] row : frequencyArray) {
            System.out.println(row[0] + "\t" + row[1]);
		}
		//closing the input object
		input.close();
	}
}
