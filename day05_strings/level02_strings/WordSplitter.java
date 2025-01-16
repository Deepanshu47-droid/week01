import java.util.*;
class WordSplitter {
    public static void main(String[] args) {
		   
		//Taking input from user
        Scanner input = new Scanner(System.in);
		System.out.print("Enter the sentence : ");
        String sentence = input.nextLine();
		
		//printing the length of sentence
		System.out.println("Length of your sentence is " + findLength(sentence));
		
		//creating variable wordCount to store count of words
		int wordCount = wordCounter(sentence);
		//printing the word count
		System.out.println("Number of words = " + wordCount);
		
		//calling the splitter method to get array of words
		String strArray = Arrays.toString(splitter(sentence));
		//printing the array of words and storing it in strArray string after converting it to string		
        System.out.println("The array is " + strArray);
		
		//printing array of words by builtin split() method and storing it in strArray2 string after converting it to string
		String strArray2 = Arrays.toString(sentence.split(" "));
		System.out.println("The array is " + strArray2);
		
		//comparing both arrays (array by method and array by builtin split() method)
		System.out.println("Both arrays are same? " + compareStringArrays(splitter(sentence), sentence.split(" ")));
		
    }
	 //method to find length of given string
	public static int findLength(String str) {
		
		//finding the length of string and storing it in len variable
		int len = 0;
		try {
			while(true) {
				str.charAt(len);
				len++;
			}
		} catch (Exception e) {
			//do nothing if string out of index exception arises
		}
		
		//returning the length
		return len;
	}
	//method to couunt words in a sentence
	public static int wordCounter(String sentence) {
		 
		 //determining he length of string
		 int len = findLength(sentence);
		//creating the wordcount variable to indicate the count of words in the sentence
        int wordcount = 1; 
        for(int i=0;i<len;i++){
            if(sentence.charAt(i)==' '){
				wordcount++;
            }
        }
		//returning the counter
		return wordcount;
	}
	
	//method to split the string
	public static String[] splitter(String sentence) {
		
		//creating variable wordCount to store count of words
		int wordCount = wordCounter(sentence);
		
		int index = 0; 
        String[] strArray = new String[wordCount];
		
		//variables to indicate starting and ending index of word
		int low = 0; 
        int high = 0;
		
        for(int i = 0;i<sentence.length();i++) {    
            if(sentence.charAt(i) != ' '){
                high++;       
               
			}else{ 
				//storing the word into the array    
				strArray[index] = sentence.substring(low,high);
				index++;
				high = high + 1;
                low = high;
            }
        }
		//inserting the last word
		strArray[index] = sentence.substring(low,high); 
		
		//returning the array of words
		return strArray;
	}
	//method to compare two string arrays
	public static boolean compareStringArrays(String array1[], String array2[]) {
		
		//returning false if length are different
		if(array1.length != array2.length) {
			return false;
		}
		
		//returning false if elements differ
		for(int i=0; i<array1.length; i++) {
			if (!(array1[i].equals(array2[i]))) {
				return false;
			}
		}
		//returning true because arrays are same
		return true;
	}
}
