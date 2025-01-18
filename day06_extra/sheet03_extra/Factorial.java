import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        //creating object of scanner class
        Scanner input = new Scanner(System.in);

        //taking user input for a number
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        //finding the factorial of number by calling the findFactorial method
        int fact = findFactorial(number);

        //printing the factorial
        System.out.println("Factorial of " + number + " is " + fact);

        //closing the input
        input.close();
    }
    //method to find a factorial
    public static int findFactorial(int number) {

        //returning 1 if number is 1
        if(number == 1) {
            return 1;
        } else {
            //returning product of factorial of previous number and current number
            return number * findFactorial(number-1);
        }
    }
}
