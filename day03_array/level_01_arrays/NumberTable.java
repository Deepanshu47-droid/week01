import java.util.Scanner;
public class NumberTable{
	public static void main(String []args){
		
		//creating the scanner object
		Scanner input = new Scanner(System.in);
		
		/*creating variable n indicating the number*/
		int n;
		
		//taking user input
		System.out.print("Enter a number :");
		n = input.nextInt();
		
		//creating array arr to store the multiplication from 1 to 10
		int arr[] = new int[10];
		
		//calculating and storing the multiplication
		for(int i=1; i <= 10; i++){
			
			arr[i-1] = n * i;
		}
		
		//printing the table
		for(int i=1; i<=10; i++)
		{
			System.out.println(n + " * " + i + " = " + arr[i-1] );
		}
	
		//closing input object
		input.close();

	}
	
}