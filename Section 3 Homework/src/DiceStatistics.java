import java.util.ArrayList;
import java.util.List;
import java.util.Random; //Import to use Random generator
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * Roll a six sided dice x number of times determined by the user. For every roll keep track of the 
 * number rolled and store it in an array or List<T> ( your choice ). When the dice has been rolled x number of
 * times print out the information in the following format:
 * 
 * {x} is a place holder representing dynamic data based on the program run.
 * 
 * Dice was rolled {x} number of times.
 * 1 was rolled {x} number of times.
 * 2 was rolled {x} number of times.
 * 3 was rolled {x} number of times.
 * 4 was rolled {x} number of times.
 * 5 was rolled {x} number of times.
 * 6 was rolled {x} number of times.
 */

public class DiceStatistics {
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {	
		Random rnd = new Random(); // Random needs to only be initialized once for the entire application		
		// Sample for getting an individual roll
		// 1 - 6 hover over '.nextInt(6)' for explanation
		
		List<Integer> rolls = new ArrayList<Integer>(); // Lists only works with Reference types
		                                                // For primitives int, double, etc... Use TypeWrapper
		
		System.out.print("How many rolls do you want: ");
		int numRolls = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < numRolls; i++) {
			int roll = rnd.nextInt(6) + 1;
			rolls.add(roll);
		}
		
		System.out.println("Dice was rolled " + rolls.size() + " number of times.");
		List<Integer> diceRolled = rolls.stream().filter(x -> x > 0).collect(Collectors.toList());
		
		for(int i = 0; i < 6; i++) {
			int number = i + 1;
			if(diceRolled.contains(number)) {
				long stat = rolls.stream().filter(x -> x == number).count();
				System.out.println(number + " was rolled " + stat + " number of times.");
			}
		}
		
		
//		int ones = 0;
//		int twos = 0;
//		int threes = 0;
//		int fours = 0;
//		int fives = 0;
//		int sixes = 0;
//		
//		for(int r : rolls) {
//			switch(r) {
//			case 1:
//				ones++;
//				break;
//			case 2:
//				twos++;
//				break;
//			case 3:
//				threes++;
//				break;
//			case 4:
//				fours++;
//				break;
//			case 5:
//				fives++;
//				break;
//			case 6:
//				sixes++;
//				break;
//			}
//		}
//		
//		System.out.println("Dice was rolled " + rolls.size() + " number of times.");
//		System.out.println("1 was rolled " + ones + " number of times.");
//		System.out.println("2 was rolled " + twos + " number of times.");
//		System.out.println("3 was rolled " + threes + " number of times.");
//		System.out.println("4 was rolled " + fours + " number of times.");
//		System.out.println("5 was rolled " + fives + " number of times.");
//		System.out.println("6 was rolled " + sixes + " number of times.");
//		
		in.close();		
	}
}