import java.util.Scanner;
import java.lang.Math;
public class RandomMaxMinAverage {
	
	//method to generate random numbers
	public static int[] generate4DigitRandomArray(int size) {
	
		//creating array numbers to store random numbers
		int numbers[] = new int[size];
		
		//generating random numbers and storing into array
		for(int i=0; i<size; i++) {
			numbers[i] = (int) (Math.random() * 9000) + 1000;
		}
		//returning the array
		return numbers;
	}
	
	//method to calculate maximum, mininmum and average of numbers
	public static double[] findAverageMinMax(int[] numbers) {
		
		//creating array maxMinAverage to store maximum, minimum and average of numbers
		double maxMinAverage[] = new double[3];
		
		//calculating maximum of numbers
		maxMinAverage[0] = numbers[0];
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>maxMinAverage[0]) {
				maxMinAverage[0] = numbers[i];
			}
		}
		
		//calculating minimum of numbers
		maxMinAverage[1] = numbers[0];
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]<maxMinAverage[1]) {
				maxMinAverage[1] = numbers[i];
			}
		}
		
		//creating sum variable to store sum of number
		int sum = 0;
		
		//calculating sum
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		
		//calculating average of numbers
		maxMinAverage[2] = sum/numbers.length;
		
		//returning the array
		return maxMinAverage;
	}
			
	public static void main(String []args) {
		
		//creating scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		//creating variables size to indicate size of array
		int size;
		
		//taking user input for size
		System.out.print("Enter the number of elements : ");
		size = input.nextInt();
		
		//creating array numbers to store random numbers
		int numbers[] = new int[size];
		
		//creating array maxMinAverage to store maximum, minimum and average of numbers
		double maxMinAverage[] = new double[3];
		
		/*calling the generate4DigitRandomArray method to generate random numbers*/
		numbers = generate4DigitRandomArray(size);
		
		//calling the findAverageMinMax method to calculate max, min and average 
		maxMinAverage = findAverageMinMax(numbers);
		
		//printing numbers
		System.out.print("numbers are :");
		for(int i=0; i<size; i++) {
			System.out.println(" " + numbers[i]);
		}
		
		//printing details
		System.out.println("Maximum of numbers is " + (int) maxMinAverage[0]);
		System.out.println("Minimum of numbers is " + (int) maxMinAverage[1]);
		System.out.println("average of numbers is " + maxMinAverage[2]);
		
		//closing the input object
		input.close();
	}
}
		