import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create a program that receives integers from the user and keeps a running total of the integers.
 * When the user enters in 0 stop the loop and then display the total. 
 */

public class LoopValues {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		List<Integer> x = new ArrayList<Integer>();
		
		int count = 0;
		int num = 0;
		do {
			System.out.print("Enter a number, a zero will exit the loop: ");
			num = Integer.parseInt(in.nextLine());
			
			x.add(num);
			count++;

		} while (num > 0);

		int sum = 0;
		
		for(int i = 0; i < x.size(); i++)
	    {
	        sum = sum + x.get(i);
	    }
	    System.out.println("Your sum is " + sum);
		
		in.close();
	}
}