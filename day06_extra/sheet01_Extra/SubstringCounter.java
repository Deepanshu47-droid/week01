import java.util.Scanner;
public class SubstringCounter {
	
	public static void main(String[] args) {
	//creating a scanner object 
	Scanner input = new Scanner(System.in);
	
	//creating a variable text to store text
	System.out.print("Enter the text : ");
	String text = input.nextLine();
	
	//creating another variable subtext to store string which have to be counted
	System.out.print("Enter the substring : ");
	String subtext = input.nextLine();
	//creating variable counter to indicate count of subtext
	int counter = 0;
	
	//loop through each element of string
	for(int i=0; i<text.length()-subtext.length(); i++) {
		//checking whether the substring occures
		if(text.substring(i, i+subtext.length()).equals(subtext)) {
			
			//increasing the counter if substring occures
			counter++;
		}
	}
	//printing the count
	System.out.println("Substring " + subtext + " occurs " + counter + " times. ");
	
	//closing the input
	input.close();
	}
}