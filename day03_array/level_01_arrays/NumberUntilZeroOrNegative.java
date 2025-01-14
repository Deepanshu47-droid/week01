import java.util.Scanner;
public class NumberUntilZeroOrNegative{
	public static void main(String []args){
		
		//creating the scanner object
		Scanner input = new Scanner(System.in);
		
		/*creating variable n, j and sum indicating the recently 
		entered number, number counter and sum of array respectively*/
		double n, sum=0;
		int j = 0;
		
		//creating array arr to indicate the numbers
		double arr[] = new double[10];
		
		while(j < 10 ){
		
			//taking user input
			System.out.print("Enter a number :");
			n = input.nextInt();
			
			if(n <= 0 ){
				break;
			} 
			arr[j] = n;
			j++;
		}
		
		
		//printing the numbers
		System.out.print("numbers are : " );
		for(int i=0; i < arr.length; i++)
		{
			
			System.out.print(arr[i] + ", " );
		}
		
		//calculating the sum
		for(int i=0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		//printing the sum
		System.out.println("\nsum of numbers is " + sum );
		
		//closing input object
		input.close();

	}
	
}