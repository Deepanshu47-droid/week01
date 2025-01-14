import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
	
		/*creating variables baseInCM, heightInCM, baseInInches, heightInInches, areaInSqInches and areaInSqCM 
		to indicate base, height, area in square inches and area in square centimeter*/
		double baseInCM, heightInCM, baseInInches, heightInInches, areaInSqInches, areaInSqCM;
	
		//taking base and height as user input
		System.out.print("Enter base of triangle in cm : ");
		baseInCM = sc.nextDouble();
		
		System.out.print("Enter height of triangle in cm : ");
		heightInCM = sc.nextDouble();
		
		//calculating base and height in inches
		baseInInches = baseInCM/2.54;
		heightInInches = heightInCM/2.54;
		
		//calculating area in square inches
		areaInSqInches = (1.0/2.0) * baseInInches * heightInInches;
		
		//calculating area in square cm
		areaInSqCM = (1.0/2.0) * baseInCM * heightInCM;
		
		//printing the areas
		System.out.println("The area of triangle in square inches is " + areaInSqInches + " and in square cm is " + areaInSqCM);
	}
}