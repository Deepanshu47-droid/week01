import java.lang.Math;
import java.util.Scanner;
public class FactorCalculator {
	
	public static int[] factor(int n) {
		//creating fact array for storing the factors
		int[] fact = new int[10];
		//creating variable max to indicate maximum length of array
		int max = 10;
		
		//creating variable k as pointer of array fact
		int k = 0;
		
		//iterating loop from 1 to number
		for(int i=1; i<=n; i++) {
			
			//checking whether i is factor of n or not
			if(n%i ==0) {
				
				//increasing the size of fact if max length reached
				max +=10;
				int[] temp = new int[max];
				for( int j=0; j<=k; j++) {
					temp[j] = fact[j];
				}
				fact = temp;
				
				//inserting the factor in array
				fact[k] = i;
				//incrementing the pointer
				k++;
			}
			
		}
		
		//removing extra indexes
		int[] temp = new int[k];
		for(int i=0; i<k; i++) {
			temp[i] = fact[i];
		}
		fact=temp;
		
		//returning factors
		return fact;
		
	}
	
	//method to find sum of factors
	public static int sumOfFactor(int[] fact) {
		
		//creating variable sum to indicate the sum of factors
		int sum = 0;
		//calculating the sum of factors
		for(int i=0; i<fact.length; i++) {
			sum += fact[i];
		}
		
		//returning the sum of factors
		return sum;
	}
	
	//method to find product of factors
	public static int productOfFactor(int[] fact) {
		
		//creating variable product to indicate the product of factors
		int product = 1;
		//calculating the sum of factors
		for(int i=0; i<fact.length; i++) {
			product *= fact[i];
		}
		
		//returning the product of factors
		return product;
	}
	
	//method to find sum Of Sq of factors
	public static int sumOfSqOfFactor(int[] fact) {
		
		//creating variable sum of squares to indicate the sum of factors
		int sumOfSq = 0;
		//calculating the sum of squares of factors
		for(int i=0; i<fact.length; i++) {
			sumOfSq += Math.pow(fact[i], 2);
		}
		
		//returning the sum of factors
		return sumOfSq;
	}
	
	public static void main(String[] args) {
		
		//creating Scanner object for taking input
		Scanner input = new Scanner(System.in);
		
		//creating fact array for storing the factors
		int[] fact;
		
		/*creating variables n, sum, product and sumOfSq to indicate 
		number, sum of factors, product of factors and Sum of squares 
		of factors rspectively*/
		int n, sum, product, sumOfSq;
		
		//taking user input for a number
		System.out.print("Enter a number : ");
		n = input.nextInt();
		
		//calling the factor method to find factors
		fact = factor(n);
		
		//calling the sumOfFactor method to find sum of factors
		sum = sumOfFactor(fact);
		
		//calling the productOfFactor method to find product of factors
		product = productOfFactor(fact);
		
		//calling the sumOfSqOfFactor method to find sum of square of factors
		sumOfSq = sumOfSqOfFactor(fact);
		
		
		//printing results
		System.out.println("The number is " + n);
		System.out.print("Factors of number are " );
		for(int i=0; i<fact.length; i++) {
			System.out.print(fact[i] + " ");
		}
		System.out.println("\nThe sum of factors is " + sum);
		System.out.println("The product of factors is " + product);
		System.out.println("The sum of squares of factors is " + sumOfSq);
		
		//closing the input object
		input.close();
	}
}
		