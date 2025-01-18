import java.util.Scanner;
public class MostFrequentCharacter {
	public static void main(String[] args) {
		
		//creating scanner object to take input
		Scanner input = new Scanner(System.in);
		
		//creating string text to indicate text
		System.out.print("Enter text : ");
		String text = input.nextLine();
		
		//creating array of 256 elements to store frequency of characters
		int[] frequency = new int[256];
		
		//creating a variable largestFrequency to indicate largest frequency
		int largestFrequency = 0;
		
		//creating a variable to store most frequent character
		char mostFrequentChar = '\u0000';
		
		//storing the frequencies of each text
		for(int i=0; i<text.length(); i++) {
			
			//increasing the frequency of current characters
			frequency[text.charAt(i)]++;
			
			//updating the largestFrequency if current character is most frequent
			if(frequency[text.charAt(i)] > largestFrequency) {
				largestFrequency = frequency[text.charAt(i)];
				mostFrequentChar = text.charAt(i);
			}
		}
		
		//removing the characters if its frequency not equal to 1
		for(int i=0; i<text.length(); i++) {
			
			//skipping if character is space
			if(frequency[text.charAt(i)] != 1) {
				continue;
			}
			
			//increasing the frequency of current characters
			if(frequency[text.charAt(i)] != 1) {
				text = text.substring(0,i).concat(text.substring(i+1,text.length()));
				i--;
			}
		}
		
		//printing the most Frequent Character
		if(mostFrequentChar == '\u0000') {
			System.out.println("There is no character. ");
		} else {
			System.out.println("Most frequent character is " + mostFrequentChar);
		}
		//closing the input
		input.close();
		
	}
}
		
		
		
		