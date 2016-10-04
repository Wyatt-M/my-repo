import java.util.Scanner;

public class Chivalry {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("You are a new knight to Camelot. May I ask what your name is: ");
		String name = in.nextLine();

		System.out.println("Well " + name + " would it be fine it I see for my self if you truely are a knight? You just need to answer yes or no. ");
		String answer = in.nextLine().toLowerCase();
		
		if(answer == "yes") {
			System.out.println("I am glad you said yes!");
			
			
			
		}
		else {
			System.out.println("Well then I can't consider you a knight");
		}
		
		
	}

}
