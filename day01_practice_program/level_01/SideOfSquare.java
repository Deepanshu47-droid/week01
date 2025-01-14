import java.util.Scanner;
public class SideOfSquare{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		
		//creating variable perimeter and length to indicate perimeter and length of square 
		double perimeter, length;
		
		//taking perimeter as user input
		System.out.print("Enter perimeter : ");
		perimeter = sc.nextDouble();
		
		//calculating length
		length = perimeter/4.0;
		
		//printing the length
		System.out.println("The length of the square is " + length + " whose perimeter is " + perimeter);
	}
}

