import java.util.Scanner;

import java.util.List; // working with collections

import java.util.ArrayList; // working with collections
import java.util.Arrays;

public class ArraySample {

	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		String sentence = "Some weird sentence we just made up";
		char[] characters = sentence.toCharArray();
		
		//TODO count sentence spaces
		
		int spaceCount = 0;
		int vowelCount = 0;
		// for a single char we are calling c in the array/collection characters
		List<String> vowels = new ArrayList<String>(Arrays.asList(new String[] { "a", "e", "i", "o", "u" })); 
		
		for(char c : characters) {
			if (c == ' ') { spaceCount++; } // if (Character.toString(c).equals(" ")
			if (vowels.contains(Character.toString(c).toUpperCase())) { vowelCount++; }
			// if (Character.toUpperCase(c) == 'A') { vowelCount++ }
			// if (Character.toUpperCase(c) == 'E') { vowelCount++ }
			// if (Character.toUpperCase(c) == 'I') { vowelCount++ }
			// if (Character.toUpperCase(c) == 'O') { vowelCount++ }
			// if (Character.toUpperCase(c) == 'U') { vowelCount++ }
			
			
		}
		
		System.out.println("Number of spaces in sentence is: " + spaceCount);
		System.out.println("Number of spaces in vowels is: " + vowelCount);
		
		
		
		
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------				
		
		

		
		// do until
		// 1.) post test loop
		// 2.) generic all purpose loop
//		String name = "Dogbrains";
//		do {
//			System.out.print("Enter a name: ");
//			name = in.nextLine();
//		}
//		while (name.length() < 0);
		
		// while loop
		// 1.) pre-test loop
		// 2.) generic all purpose loop
//		while (name.length() < 3) {
//			System.out.print("Enter a name: ");
//			name = in.nextLine();
//		}
		
		// for loop
		// 1.) used for incremental stepping
		// 2.) ({loop variable}; {condition}; {stepping value})
		// 3.) set number of times, accumulation, dealing with an array by index
//		char[] letters = name.toCharArray();
//		for (int x = 0; x < letters.length; x++) {
//			System.out.println(letters[x]);
//		}
	
		// for each loop
		// 1.) arrays and collections by value
		// foreach(char c in letters)
//		for(char c : letters) {
//			System.out.println(c);
//		}
		
		
		
		
// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		
		
	
		// List<T>
		// 1.) add and remove objects ( resize backing array )
		
		//List <of type> names = new ArrayList<of type>();
//		List<String> names = new ArrayList<String>();
//		names.add("Damon"); // adds an item at the end of an array
//		names.add("Dog");
//		names.add("Cat");
//		names.add("Damon");
//		names.remove("Damon"); // removes an item  with the value "Damon" (first occurrence)
//		
//		names.size(); // tells the number of elements in the list
//		names.get(2); // gets index 2 from the backing array "Cat"
//		names.clear(); // clear out all values / size
//		names.toArray(); // returns backing array
//		
//		names = null;
//		
//		if (names.contains("damon")) {
//			// do something
//		} // returns a boolean value
		
		
		
// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
		
		
		
		// array
		// a collection of like data types
		// 1.) must initialize / set number of elements. ( once set can't change number of elements ) 
		
//		System.out.print("What is your name: ");
//		String name = in.nextLine();
//		
//		char[] lnums = new char[name.length()];
//		char[] letters = name.toCharArray(); //"Troy" 
//		
//		String str1 = "srt 1";
//		String str2 = "str 2";
//		String str3 = "str 3";
//		
//		int[] nums = new int[5];
//		int[] nums2 = new int[] { 5, 4, 1, 99, 33, 44, 17 };
//		
//		// string{s}
//		String[] strSet = new String[3]; // set an array to contain 3 elements
//		String[] strSet3 = new String[] { str1, str2, str3, "Damon" }; // initialize with values
//		
//		System.out.println(strSet.length); // length gets the number of elements in an array
//		
//		strSet3[3] = ""; // assign empty string to where "Damon" was
//		System.out.println(strSet3[3]);
//		
//		in.close();
	}

}
