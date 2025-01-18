import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {

        //creating scanner object
        Scanner input = new Scanner(System.in);

        //creating a variable number to indicate number
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        if(number <= 2) {
            System.out.println("Number " + number + " is not prime. ");
            return;
        }

        //loop from 2 to half of number
        for(int i=2; i<number/2; i++) {
            if(number%i == 0) {
                System.out.println("Number " + number + " is not prime. ");
                return;
            }
        }
        System.out.println("Number " + number + " is prime. ");
    }
}
