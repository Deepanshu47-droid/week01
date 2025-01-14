import java.util.Scanner;
public class NumberTable6To9{
	public static void main(String []args){
		
		//creating the scanner object
		Scanner input = new Scanner(System.in);
		
		/*creating variable n indicating the number*/
		int n;
		
		//taking user input
		System.out.print("Enter a number :");
		n = input.nextInt();
		
		//creating array arr to store the multiplication from 6 to 9
		int arr[] = new int[4];
		
		//calculating and storing the multiplication
		for(int i=6; i <= 9; i++){
			
			arr[i-6] = n * i;
		}
		
		//printing the table
		for(int i=6; i <= 9; i++)
		{
			System.out.println(n + " * " + i + " = " + arr[i-6] );
		}
	
		//closing input object
		input.close();

	}
	
}