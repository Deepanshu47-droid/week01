import java.util.Scanner;
public class EvenAndOddArray{
	public static void main(String []args){
		
		//creating the scanner object
		Scanner input = new Scanner(System.in);
		
		/*creating variable n indicating the number*/
		int n;
		
		//taking user input
		System.out.print("Enter a number :");
		n = input.nextInt();
		
		
		/*creating arrays odd and even to indicate the array 
		of odd numbers as well as even numbers*/
		double even[] = new double[(n/2) + 1];
		double odd[] = new double[(n/2) + 1];
		
		/*creating variables j, k to point the current 
		active element of array  even, odd respectively*/
		int j = 0, k = 0;
		
		//iterating from 1 to n
		for(int i=1; i<=n; i++)
		{	
			//checking if number is even
			if(i%2 == 0){
				
				even[j] = i;
				
				//incrementing the pointer
				j++;
			} else
			{
				
				odd[k] = i;
				
				//incrementing the pointer
				k++;
			}
				
		}
		//printing the even array
		System.out.print("Even array is : " );
		for(int i=0; i < even.length; i++)
		{
			
			System.out.print(even[i] + ", " );
		}
		
		//printing the new line
		System.out.print("\n" );
		
		//printing odd array
		System.out.print("\nodd array is : " );
		for(int i=0; i < odd.length; i++)
		{
			
			System.out.print(odd[i] + ", " );
		}
	
	
		//closing input object
		input.close();

	}
	
}