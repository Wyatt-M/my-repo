import java.util.Scanner;

public class Chivalry {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("You are a new knight to Camelot. May I ask what your name is: ");
		String name = in.nextLine();

		System.out.println("Well " + name + " I am going to ask you a few questions to see for myself if you are a Knight.");
			
			System.out.println("Know time for the first question.");
			
			System.out.println("If someone had a knife to your neck and told you he would let you live if you denied God, would you?");
			Integer piety = in.nextLine().length();
			
			
			System.out.println("Alright then. Next question.");
			
			System.out.println("If someone was disrespcting you and making you look humilitated in front of a group would you let it slide?");
			Integer honour = in.nextLine().length();
			
			
			System.out.println("Ok next question.");
			
			System.out.println("You are in a battle and many knights are dead all around you even your best friend, do you continue fighting to death?");
			Integer valor = in.nextLine().length();
			
			
			System.out.println("Lets move on to the next question.");
			
			System.out.println("If you are walking with your King and you see an old lady drop her belongings do you help her?");
			Integer courtesy = in.nextLine().length();
			
			
			System.out.println("Lets move on to the second to last question.");
			
			System.out.println("You find a beautiful women and she invites you to her room for a little fun, do you have a little fun?");
			Integer chastity = in.nextLine().length();
			
			
			System.out.println("Finally onto the final question.");
			
			System.out.println("Your King has asked you to do a task that is something that you believe should not be done, do you do it anyways?");
			Integer loyalty = in.nextLine().length();
			
			
			if(piety == 2 && honour == 2 && valor == 3 && courtesy == 3 && chastity == 2 && loyalty == 3) {
				System.out.println("Well then " + name + " I guess you truely are a Knight.");
				System.out.println("These questions looked at the basic of Chivarly to Knights and some basic scenarios on what you should do in those situations.");
			}
			else {
				System.out.println("Well then " + name + " I guess I can't count you as a Knight.");
				System.out.println("You should think about what it means to be a Knight");
			}
		
	}

}