import java.lang.Math;
import java.util.Scanner;
public class Wind {

	/*method to calculate maximum number of handshakes 
	taking n as parameter indicating the number of persons*/
	public static double windChillCalc(double temperature, double windSpeed) {
		
		//creating variable numberOfRounds to indicate number Of Rounds
		double windChill;
		 
		//calculating wind chill
		windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16); 
		
		//returning wind chill
		return windChill;
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		/*creating variables temperature, windSpeed and windChill to indicate the 
		temperature, wind speed and windchill respectively*/
		double temperature, windSpeed, windChill;
		
		//taking temperature and windChill as user input
		System.out.print("Enter temperature : ");
		temperature = input.nextDouble();
		
		System.out.print("Enter windChill : ");
		windSpeed = input.nextDouble();
		
		//calling the method
		windChill = windChillCalc(temperature, windSpeed);
		
		//printing details
		System.out.print("Temperature = " + temperature + "\nWind Speed = " + windSpeed + "\nWind chill = " + windChill);
		
		//closing the input object
		input.close();

	}
}		
		
		