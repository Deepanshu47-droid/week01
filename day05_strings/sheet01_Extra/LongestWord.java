import java.util.Scanner;
public class LongestWord {
	public static void main(String[] args) {
		
		//creating input object to take inputs
		Scanner input = new Scanner(System.in);
		
		//taking user inputs for sentence
		System.out.print("Enter a sentence : ");
		String sentence = input.nextLine();
		
		//creating a variable to store longest word
		String longestWord = findLongestWord(sentence);
		
		//printing the longest word of string
		System.out.println("Longest word of sentence " + sentence + ". is " + longestWord);
		
		//closing the input
		input.close();
	}
	//method to find longest word in the sentence
	public static String findLongestWord(String sentence) {
		
		//creating array words to store the words of sentence
		String [] words = sentence.split(" ");
		
		//Creating a variable maxLen and longestWord to store the maximum length of word and the longest word
		int maxLen = 0;
		String longestWord = "";
		
		//checking for the longest word in array words
		for(int i=0; i<words.length; i++) {
			if(words[i].length()>maxLen) {
				maxLen = words[i].length();
				longestWord = words[i];
			}
		}
		//returning the longest word
		return longestWord;
		
	}
}