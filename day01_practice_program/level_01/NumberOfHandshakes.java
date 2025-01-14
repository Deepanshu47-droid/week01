import java.util.Scanner;
public class NumberOfHandshakes{
    public static void main(String []args){
   
        Scanner sc = new Scanner(System.in);
       
        /*creating variable numberOfPersons and numberOfHandShakes
        to indicate number Of Persons, number Of HandShakes */
        double numberOfPersons, numberOfHandShakes;
       
        //taking number of persons as user input
        System.out.print("Enter number of persons : ");
        numberOfPersons = sc.nextDouble();
       
        //calculating number of handshakes
        numberOfHandShakes =  (numberOfPersons * (numberOfPersons - 1)) / 2;
       
        //printing details
        System.out.println("the number of possible handshakes is " + numberOfHandShakes);
    }
}

