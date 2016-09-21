/*
 * Create a program to analyze a sentence a user puts in.
 * 
 * Use regular expressions to make sure the sentence is valid:
 * 	1.) Begins with a capital letter
 * 	2.) Ends with the following punctuation (.?)
 * 
 * 		- Print out the sentence length
 * 		- Print out the word count for the sentence
 * 		- Print out each word in the sentence excluding associated punctuation
 * 
 * 		- Extra Credit (20 points)
 * 		- Print out how many times a letter was used in the sentence
 */
import java.util.Scanner;
public class SentenceAnalyzer {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Type a sentence: ");
		String sentence = in.nextLine();
		
		String pattern = "^[A-Z][a-z,;'\"\\s]+[.?]$";
		
		String trimmed = sentence.trim();
		int words = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
		
		if(sentence.matches(pattern)){
			System.out.println("Correct");
			System.out.println("The sentence is " + sentence.length() + " characters long.");
			System.out.println("The sentence is " + words + " words long.");
			System.out.println(words);
		}
		else {
			System.out.println("Incorrect sentence structure.");
		}
		
		in.close();
	}

}