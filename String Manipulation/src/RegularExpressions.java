import java.util.Scanner;

public class RegularExpressions {
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Create username
		// No spaces, first letter firstname, entire lastname, all lowercase
		// less than or equal to 20 characters
		// create email address {username}@example.org
		
		System.out.print("Enter in First Name: ");
		String fn = in.nextLine();
		System.out.print("Enter in Last Name: ");
		String ln = in.nextLine();
		ln.replaceAll(" ", "");
		String fnLetter = Character.toString(fn.toCharArray()[0]);
		String fnLett = fn.substring(0, 1);
		
		String username = (fnLett + ln).toLowerCase().trim();
		String email = username + "@example.org";
		
		String pattern = "^[a-z]{1,20}$";
		
		if(!username.matches(pattern)) {
			username = username.substring(0, 19);
		}
		
		System.out.print(username);
		
// ---------------------------------------------------------------------------------------------------------------------		
		// String .matches({regex}) - returns boolean
		
		// Match a hexidecimal color code
		// ^#([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$

//		String pattern = "^#([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$";
//		String code = "#ffaadd";
//		
//		if(code.matches(pattern)) {
//			System.out.println("Valid hexidecimal color code: ");
//		}
		
		
		in.close();
	}

}
