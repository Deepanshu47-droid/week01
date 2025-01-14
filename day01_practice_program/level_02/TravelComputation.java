import java.util.Scanner;
class TravelComputation{
   Scanner sc=new Scanner(System.in);
   public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
   
		/*Creating variable name, fromCity, viaCity, toCity to 
		indicate the person traveling,city from city, via city 
		and to city the person is travelling*/
		String name, fromCity, viaCity, toCity;
      

		/*Creating a variable distanceFromToVia, timeFromToVia
		to indicate the distance between the fromCity to viaCity, 
		time taken to travel from fromCity to viaCity in minutes*/
		double distanceFromToVia, timeFromToVia;

		/*Creating a variable distanceViaToFinalCity, timeViaToFinalCity
		to indicate the distance between the viaCity to toCity, 
		time taken to travel from viaCity to toCity in minutes*/
		double distanceViaToFinalCity, timeViaToFinalCity;
		
		//taking user input
		System.out.println("Enter the name : ");
		name=sc.next();
		
		System.out.println("Enter the name of from city : ");
		fromCity=sc.next();
		
		System.out.println("Enter the name of via city : ");
		viaCity=sc.next();
		
		System.out.println("Enter the name of to city : ");
		toCity=sc.next();
		
		System.out.println("Enter the distance from fromcity to viacity : ");
		distanceFromToVia=sc.nextDouble();
		
		System.out.println("Enter the distance from viacity to finalcity: ");
		distanceViaToFinalCity=sc.nextDouble();
		
		System.out.println("Enter the time taken from fromcity to viacity: ");
		timeFromToVia=sc.nextDouble();
		
		System.out.println("Enter the time taken from viacity to finalcity: ");
		timeViaToFinalCity=sc.nextDouble();
		
		/*Creating a variable totalDistance to indicate the total distance
		between the fromCity to toCity*/
		double totalDistance = distanceFromToVia + distanceViaToFinalCity;

		/*Creating a variable totalTime to indicate the total time taken to
		travel from fromCity to toCity in minutes*/
		double totalTime = timeFromToVia + timeViaToFinalCity;


		// Printing the travel details
		System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}

