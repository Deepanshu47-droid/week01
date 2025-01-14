import java.util.Scanner;
public class DivisibleByFive{
	public static void main(String []args){
		
		//creating the scanner object
		Scanner sc = new Scanner(System.in);
		
		//creating variable n to indicate the number entered by user
		int n;
		
		//taking the number as user input
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		
		//checking whether the number is divisible by 5 or not
		if(n%5 == 0){
			System.out.print(" Is the number " + n + " divisible by 5? Yes ");
		} else{
			System.out.print(" Is the number " + n + " divisible by 5? No ");
		}
		
		//closing the scanner object
		sc.close();
	}
}
		