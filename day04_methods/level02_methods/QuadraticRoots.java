import java.util.Scanner;
import java.lang.Math;
public class QuadraticRoots {
	
	//method to calculate roots of quadratic equation
	public static double[] findRoots(double a, double b, double c) {
		//creating variable delta to indicate delta
		double delta;
		
		//calculating delta
		delta = Math.pow(b,2) - 4 * a * c;
		
		//checking whether delta is positive, negative or zero
		if(delta > 0) {
			//calculating two roots for positive delta
			double root1 = (-b + Math.sqrt(delta))/(2 * a);
			double root2 = (-b - Math.sqrt(delta))/(2 * a);
			
			//storing roots in array
			double roots[] = {root1, root2};
			
			//returning the roots 
			return roots;
		} else if(delta == 0) {
			
			//calculating one root for zero delta 
			double root = -b / (2 * a);
			
			//storing roots in array
			double roots[] = {root};
			
			//returning the roots
			return roots;
		} else {
			
			//storing roots as empty array for negative delta 
			double roots[] = {};
			//returning the 
			return roots;
		}
	}
			
	public static void main(String []args) {
		
		//creating scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		//creating variables a, b and c 
		double a, b, c;
		
		//taking user input for a, b, and c
		System.out.print("Enter the value of a : ");
		a = input.nextDouble();
		System.out.print("Enter the value of b : ");
		b = input.nextDouble();
		System.out.print("Enter the value of c : ");
		c = input.nextDouble();
		
		/*calling the QuadraticRoots method to calculate roots and storing 
		roots in array roots*/
		double roots[] = findRoots(a, b, c);
		
		//printing the roots
		if(roots.length == 0) {
			System.out.print("There is no roots.");
		} else if (roots.length == 1) {
			System.out.print("There is only one root i.e. " + roots[0]);
		} else {
			System.out.print("There are two roots " + roots[0] + " and " + roots[1]);
		}
		//closing the input object
		input.close();
	}
}
		