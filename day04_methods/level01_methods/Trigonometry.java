import java.lang.Math;
import java.util.Scanner;
public class Trigonometry {
	
	//method to calculate sine cosine and tangent of angle
	public static void trigonometryFunc( double angle) {
		
		//creating variables sin, cos and tan to store sine, cosine and tangent of angle
		double sin, cos, tan;
		//calculating sine
		sin = Math.sin(angle);
		
		//calculating cosine
		cos = Math.cos(angle);
		
		//calculating tangent
		tan = Math.tan(angle);
		
		//printing details
		System.out.println("Angle = " + angle + "\nsine = " + sin + "\ncosine = " + cos + "\ntangent = " + tan);
	}


	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//creating variable angle 
		double angle;
		
		//taking user input
		System.out.print("Enter the angle : ");
		angle = input.nextDouble();
		
		//calling the method
		trigonometryFunc(angle);
		
		//closing the scanner object
		input.close();
		
	}
}