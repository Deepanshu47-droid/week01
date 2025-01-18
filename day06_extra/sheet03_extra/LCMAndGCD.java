import java.util.Scanner;
import java.lang.Math;
public class LCMAndGCD {
    public static void main(String[] args) {
        //creating scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for two number
        System.out.print("Enter a number : ");
        int number1 = input.nextInt();
        System.out.print("Enter another number : ");
        int number2 = input.nextInt();

        //calling the method calculateLCM to calculate LCM of numbers
        int LCM = calculateLCM(number1, number2);

        //calculating the GCD
        int GCD = (number1 * number2)/LCM;

        //printing the lcm and gcd
        System.out.println("LCM of " + number1 + " and " + number2 + " is " + LCM + " and GCD is " + GCD );

        //closing the input
        input.close();
    }
    //method to calculate LCM of numbers
    public static int calculateLCM(int number1, int number2) {

        //loop from 2 to half of minimum of two numbers
        for(int i=2; i<=Math.min(number1, number2)/2; i++) {
            if(number1%i == 0 && number2%i == 0) {
                return i;
            }
        }
        return (number1 * number2);
    }
}
