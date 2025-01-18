import java.util.Scanner;
public class TemperatureConvertor {
    public static void main(String[] args) {

        //creating a scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for temperature
        System.out.print("Enter temperature : ");
        double temperature = input.nextDouble();


        //creating variable choice to indicate choice of user
        System.out.println("Enter 1 to convert fahrenheit to celsius\n Enter 2 to convert celsius to fahrenheit ");
        int choice = input.nextInt();

        switch(choice) {
            case 1: {
                System.out.println("Temperature in farhenheit is " + temperature + " and in celsius is " + toCelcius(temperature));
                break;
            }
            case 2: {
                System.out.println("Temperature in celsius is " + temperature + " and in fahrenheit is " + toFahrenheit(temperature));
                break;
            }
            default:{
                System.out.println("Invalid choice ....");
            }
        }
        //closing the input
        input.close();
    }
    //method to convert fahrenheit to celsius
    public static double toCelcius(double fahrenheit) {
        //calculating temperature in celsius
        double result= (fahrenheit - 32) * 5/9;

        //returning the result
        return result;
    }
    //method to convert celsius to fahrenheit
    public static double toFahrenheit(double celsius) {
        //calculating temperature in fahrenheit
        double result= (celsius * 9.0 / 5.0) + 32.0;

        //returning the result
        return result;
    }
}
