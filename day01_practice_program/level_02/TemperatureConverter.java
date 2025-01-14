import java.util.Scanner;
public class TemperatureConverter{
	public static void main(String []args){
	
		Scanner sc=new Scanner(System.in);
		
		/*creating variables celsius and fahrenheitResult to indicate 
		temperature in celsius and fahrenheit respectively*/
		double celsius,fahrenheitResult;
		
		//taking temperature in celsius
		System.out.print("Enter the temperature in celsius: ");
		celsius=sc.nextDouble();
		
		//calculating temperature in fahrenheit
		fahrenheitResult=(celsius * 9.0 / 5.0) + 32.0;
		
		//printing temperature in fahrenheit
		System.out.print("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
		
	}
}

