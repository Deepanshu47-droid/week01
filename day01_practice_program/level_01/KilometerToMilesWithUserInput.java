import java.util.Scanner;
public class KilometerToMilesWithUserInput{
    public static void main(String []args){
       
        //creating scanner object for user input
        Scanner sc=new Scanner(System.in);
    
        /*creating variables km and miles to indicate
        distance in kilometer and miles*/
        double km,miles;
       
        //taking user input
        System.out.print("Enter distance in kilometers: ");
        km=sc.nextDouble();
       
        //calculating distance in miles
        miles=km*1.6;
       
        //printing the distance in miles
        System.out.print("The total miles is " + miles + " mile for the given " + km + " km");
       
    }
}
