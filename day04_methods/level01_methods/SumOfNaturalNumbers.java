import java.util.Scanner;
public class SumOfNaturalNumbers {

	/*method to calculate maximum number of handshakes 
	taking n as parameter indicating the number of persons*/
	public static int sumCalc (int n) {
		
		//creating variable sum to indicate the sum
		int sum=0;
		
		//calculating sum by for loop
		for(int i=1;i<=n;i++)
		{
			sum += i;
		}
       
		
		//returning the sum
		return sum;
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		/*creating variables n and sum indicating the number
		and sum of n natural numbers respectively*/
		int n, sum = 0;
		
		//taking user input
		System.out.print("Enter a number :");
		n = input.nextInt();
		
		//calling the method
		sum = sumCalc(n);
		
		//printing results
		System.out.print("The sum of natural numbers from 1 to " + n + " is " + sum);
		
		//closing the input object
		input.close();

	}
}		
		
		