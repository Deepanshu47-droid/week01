import java.util.Scanner;
public class TwoDimArray{
	public static void main(String []args){
		
		//creating the scanner object
		Scanner input = new Scanner(System.in);
		
		/*creating variables row and column
		to indicate no of rows and columns of 2d array*/
		int row, column;
		
		//creating a pointer of 1d array
		int k=0;
		//taking no of rows and no of columns as user input
		System.out.print("Enter no of rows :");
		row = input.nextInt();
		System.out.print("Enter no of columns :");
		column = input.nextInt();
		
		//creating 2-d array named as arr
		double arr[][] = new double[row][column];
		
		//creating 1-d  array named as arr2
		double arr2[] = new double[row*column];
		
		//taking elements of 2d array as user input
		for(int i=0; i < row; i++){
			for(int j=0; j < column; j++){
				System.out.print("Enter the element belongs to row " + i + " and column " + j + " : ");
				arr[i][j] = input.nextDouble();
			}
		}
		
		//copying the 2d array in 1d array
		for(int i=0; i < row; i++){
			for(int j=0; j < column; j++){
				arr2[k]=arr[i][j];
				k++;
			}
		}
		
		//printing the 1d array
		System.out.print("The elements of 1d array are : ");
		for(double n: arr2){
			System.out.print(n + ", ");
		}
		
		//closing input object
		input.close();
		
	}
}