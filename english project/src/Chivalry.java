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
			
			System.out.println("Know time for the first question.");
			
			System.out.println("If someone had a knife to your neck and told you he would let you live if you denied God, would you? ");
			String piety = in.nextLine().toLowerCase();
			
			System.out.println("Alright then. Next question.");
			
			System.out.println("If someone was disrespcting you and making you look humilitated in front of a group would you let it slide? ");
			String honour = in.nextLine().toLowerCase();
			
			System.out.println("Ok next question.");
			
			System.out.println("You are in a battle and many knights are dead all around you even your best friend, do you continue fighting to death? ");
			String valor = in.nextLine().toLowerCase();
			
			System.out.println("Lets move on to the next question.");
			
			System.out.println("If you are walking with your king and you see an old lady drop her belongings do you help her? ");
			String courtesy = in.nextLine().toLowerCase();
			
			System.out.println("Lets move on to the second to last question.");
			
			System.out.println("You find a beautiful women and she invites you to her room for a little fun, do you have a little fun? ");
			String chastity = in.nextLine().toLowerCase();
			
			System.out.println("Finally onto the final question.");
			
			System.out.println("Your king has asked you to do a task that is something that you believe should not be done, do you do it anyways? ");
			String loyalty = in.nextLine().toLowerCase();
			
		}
		else {
			System.out.println("Well then I can't consider you a knight");
		}
		
		
	}

}
