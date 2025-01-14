import java.util.Scanner;
public class ElementComparison{
	public static void main(String []args){
		
		//creating the scanner object
		Scanner input = new Scanner(System.in);
		
		//creating array arr to indicate the numbers
		int arr[] = new int[5];
		
		//taking 5 numbers as user input
		for(int i=0;i<5;i++){
			System.out.print("Enter number " + (i+1) + " : ");
			arr[i] = input.nextInt();
		}
		
		//checking number is positive, negative or zero
		for(int i=0;i<5;i++){
			if(arr[i] > 0){
				System.out.print("Number " + arr[i] + " is positive ");
				
				//checking whether the positive number is even or odd
				if(arr[i] % 2 == 0)
				{
					System.out.println( "and even.");
				} else{
					System.out.println("and odd.");
				}
				
			} else if(arr[i] < 0){
				System.out.println("Number " + arr[i] + " is negative ");
			} else{
				System.out.println("Number " + arr[i] + " is zero ");
			}
		}
			
		//comparing first and last element of array
		if( arr[0] == arr[4] )
		{
			System.out.println("Both numbers are equal");
		} else if(arr[0] > arr[4])
		{
			System.out.println("First number is greater than the last.");
		} else{
		System.out.println("last number is greater than the first.");
		}
		
		//closing input object
		input.close();
	}
}