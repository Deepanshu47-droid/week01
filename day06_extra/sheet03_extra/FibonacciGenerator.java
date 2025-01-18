import java.util.Scanner;
import java.util.Arrays;
public class FibonacciGenerator {
    public static void main(String[] args) {

        //creating scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for a number which indicate number of fibinacci numbers
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        //calling the fibonacci method and storing the fibonacci numbers in fib array
        int fib[] = fibonacci(number);

        //printing the fibonacci numbers
        System.out.println("Fibonacci numbers are : " + Arrays.toString(fib));

        //closing the input
        input.close();
    }
    public static int[] fibonacci(int n) {
        //creating array fib to store fibonacci numbers
        int[] fib = new int[n];

        //the first and second fibonacci numbers are 1 and 1
        fib[0] = 1;
        fib[1] = 1;

        //storing the remaining fibonacci numbers in array
        for(int i=2; i<n; i++) {
            fib[i]  = fib[i-1] + fib[i-2];
        }
        //returning fibonacci numbers as array
        return fib;
    }
}
