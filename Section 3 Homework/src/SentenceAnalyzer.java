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

		System.out.print("Type a sentence: ");
		String sentence = in.nextLine();
		
		String pattern = "^[A-Z]{1}.*[\\.\\?]{1}$";
		
		String trimmed = sentence.trim();
		int words = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
		// sentence.split(" ")
		// for(String s in splits){
		// s.replace(".", "").replace("?", "")
		
		// extra credit
		String[] word = sentence.replace(".", "").replace("?", "").split(" ");
		
		int[] letters = new int[26];
		// 0|1|2|3
		// A|B|C|D
		
		for(String w : word) {
			char[] characters = w.toCharArray();
			for(char c : characters) {
				int index = (int)Character.toUpperCase(c) - 65;
				letters[index]++;
			}
		}
		
		for(int i = 0; i < letters.length; i++) {
			char c = (char)(i + 65);
			System.out.println(c + " used " + letters[i] + " many times");
		}
		// end of extra credit
		
		if(sentence.matches(pattern)){
			System.out.println("Correct");
			System.out.println("The sentence is " + sentence.length() + " characters long.");
			System.out.println("The sentence is " + words + " words long.");
			System.out.println(sentence.substring(0, sentence.length() - 1));
		}
		else {
			System.out.println("Incorrect sentence structure.");
		}
		
		in.close();
	}

}