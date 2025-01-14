import java.util.Scanner;
public class TemperatureConverter2{
	public static void main(String []args){
	
		Scanner sc=new Scanner(System.in);
		
		/*creating variables fahrenheit and celsiusResult to indicate 
		temperature in fahrenheit and celsius respectively*/
		double fahrenheit,celsiusResult;
		
		//taking temperature in fahrenheit
		System.out.print("Enter the temperature in fahrenheit: ");
		fahrenheit=sc.nextDouble();
		
		//calculating temperature in celsius
		celsiusResult= (fahrenheit - 32) * 5/9;
		
		//printing temperature in celsius
		System.out.print("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
		
	}
}

