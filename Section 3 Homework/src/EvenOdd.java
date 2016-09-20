import java.util.Scanner;

/*
 * Create a program that will take user input. For every number entered in by the user, print the number and
 * a short description if it is even or odd.
 * 
 * Sample Format:
 * 
 * You entered in {x} and it is {odd|event}.
 */
public class EvenOdd {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		for(int i = 0; i <= 100; i++) {
			int num = i % 2;
			if(num == 0) {
				System.out.println("You entered in " + i + " and it is even.");
			}
			else {
				System.out.println("You entered in " + i + " and it is odd.");
			}
		}
		

		in.close();
	}
}