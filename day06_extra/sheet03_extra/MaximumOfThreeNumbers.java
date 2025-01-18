import java.util.Scanner;
import java.lang.Math;
public class MaximumOfThreeNumbers {
    public static void main(String []args) {

        //creating a scanner object
        Scanner input = new Scanner(System.in);

        //creating variables num1, num2, num3 to indicate 3 numbers
        double num1, num2, num3;

        //taking three numbers as user input
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();
        System.out.print("Enter third number: ");
        num3 = input.nextDouble();

        //creating variable max to indicate maximum of three numbers
        double max = num1;

        if(num1 < num2) {
            if(num2 < num3) {
                max = num3;
            } else {
                max = num2;
            }
        } else {
            if(num1 < num3) {
                max = num3;
            } else {
                max = num1;
            }
        }

        //printing maximum
        System.out.print("Maximum of three numbers is " + max);

        //closing the input
        input.close();
    }


}
