
public class Program {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		int z = 18;
		
		char letter = 'A'; // Character is actually an int
		// ASCII -- ISO-8995 || Only applies to English characters
		// UTF-8 -- Unicode || { Support multiple languages }
		char m = '\u0065';
		
		if (letter == 65) {
			System.out.print("This is an \u0006");
		}
		
		String dog = "Bulldog";
		String dog2 = "Beagle";
		String dog3 = "beagle";

		
		// if (condition) {body} else if (condition) {body} else {}
		// String.equals() for string equality check 
		// || or, && and
		
		// If x >= 1 set z = x + y else set z = 0
		// int var = (x >= 1) ? {true} : {false}
		z = x >= 1 ? x + y : 0;
		
		if (x >= 1) {
			z = x + y;
		}
		else {
			z = 0;
		}
		
		// switch {case statement} char / int
		// switch (x) {case : , default}
		switch (x) {
			case 5:
				System.out.print("x is 5");
				break;
			case 4:
				System.out.println("4 ran");
				break;
			case 3:
				System.out.println("3 ran");
				break;
			case 2:
				System.out.println("x is 1, 2, 3 or 4");
				break;
			case 1:
				System.out.println("x is 1");
				break;
			default:
				System.out.println("no clue what x is");
		}
		
//		if ((y == 5) && (x == 3 || x == 5)) {
//			
//		}
		
		
//		if (dog2.equals(dog3)) {
//			System.out.println("Same dog");
//		}	
		
//		if (x == 5) { }
		
//		if (x > y) {
//			System.out.println("X is greater than Y");
//			System.out.println("Something else");
//		} 
//		else if (y < x) {
//			
//			
//		} 
//		else {
//			
			
//		}
		
	}

	// functions / methods
	// function / method / header signature
	
	// access modifiers { private , public, protected, final, static }
	// private only accessible in its scope
	// public accessible everywhere
	// protected publicly accessible only in its package
	
	// Complier signature view
	// public static void checking(String)
	public static void checking(String n) { }
	// public static void checking(string , string)
	public static void checking(String n, String l) { }
	// public static void checking(string, int)
	public static void checking(String n, int x) { }
	public static void checking(int x, String n) { 
		if (x == 3) { return; }
	}
	
	// String x = fullname("Damon", "Drake");

	public static String fullname(String fn, String ln) {
		if (ln.startsWith("D")) { return ""; }
		
		return String.format("%s %s", fn, ln);
	}
}
