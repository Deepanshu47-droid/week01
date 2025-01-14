
import java.util.Scanner;
public class ElementComparison3 {
	
	public static boolean isPositive(int number) {
		
		//checking number is positive, negative or zero
		if(number > 0) {
			return true;				
		} else if(number < 0) {
			return false;
		} else {
			System.out.println("Number " + number + " is zero ");
			return false;
		}
		
		
	}
	public static boolean isEven(int number) {
		//checking whether the positive number is even or odd
		if(number % 2 == 0)
		{
			return true;
		} else{
			return false;
		}
	}
	public static int compare(int numbers[]) {
		
		//comparing first and last element of array
		if( numbers[0] == numbers[4] )
		{
			return 0;
		} else if(numbers[0] > numbers[4]) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public static void main(String []args) {
		
		//creating the scanner object
		Scanner input = new Scanner(System.in);
		
		//creating array numbers to indicate the numbers
		int numbers[] = new int[5];
		
		//taking 5 numbers as user input
		for(int i=0;i<5;i++){
			System.out.print("Enter number " + (i+1) + " : ");
			numbers[i] = input.nextInt();
		}
		
		//iterating through the numbers array
		for(int i=0;i<5;i++){

			//checking the number is positive or negative by calling isPositive method
			if(isPositive(numbers[i])) {
				System.out.print("Number " + numbers[i] + " is positive ");
				
				//checking whether the positive number is even or odd
				if(isEven(numbers[i])) {
					System.out.println( "and even.");
				} else{
					System.out.println("and odd.");
				}
			} else if(numbers[i]!=0) {
				System.out.println("Number " + numbers[i] + " is negative ");
			} 
		}
				
			
		//comparing first and last element of array
		if(compare(numbers) == 0)
		{
			System.out.println("Both numbers are equal");
		} else if(compare(numbers) == 1) {
			System.out.println("First number is greater than the last.");
		} else {
		System.out.println("last number is greater than the first.");
		}
		
		//closing input object
		input.close();
	}
}


