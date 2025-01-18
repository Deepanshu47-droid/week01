import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        //creating a scanner object
        Scanner input = new Scanner(System.in);

        //creating random object
        Random rand = new Random();

        //taking a random number
        int randNum = rand.nextInt(100);

        while(true) {

            //taking user input for a number
            System.out.print("Enter a 2 digit number : ");
            int number = input.nextInt();

            if(number < randNum) {
                System.out.println("Enter a large number. ");
            } else if(number > randNum) {
                System.out.println("Enter a small number. ");
            } else {
                System.out.println("This is the correct number. ");
                break;
            }
        }
        //closing the input
        input.close();
    }

}