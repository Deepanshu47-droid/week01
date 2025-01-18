import java.util.Scanner;
public class DuplicateRemoval {
	public static void main(String[] args) {
		
		//creating scanner object to take input
		Scanner input = new Scanner(System.in);
		
		//creating string text to indicate text
		System.out.print("Enter text : ");
		String text = input.nextLine();
		
		//creating array of 256 elements to store frequency of characters
		int[] frequency = new int[256];
		
		//storing the frequencies of each text
		for(int i=0; i<text.length(); i++) {
			
			//increasing the frequency of current characters
			frequency[text.charAt(i)]++;
		}
		
		//removing the characters if its frequency not equal to 1
		for(int i=0; i<text.length(); i++) {
			
			//increasing the frequency of current characters
			if(frequency[text.charAt(i)] != 1) {
				text = text.substring(0,i).concat(text.substring(i+1,text.length()));
				i--;
			}
		}
		
		//printing the final text after removing duplicates
		System.out.println(text);
		
		//closing the input
		input.close();
		
	}
}
		
		
		
		