/*
 * Create a program that allows the user to input their first and last name. Use the information gathered to create
 * a username with the following criteria:
 * 
 * 1.) must be all lowercase
 * 2.) can't contain spaces
 * 3.) must be less than 20 characters
 * 4.) should use the first letter of the first name and the entire last name if possible.
 * 
 * Sample:
 * Fred Flintstone = fflintstone
 * Donald Duck = dduck
 * 
 */
import java.util.Scanner;

public class UserLogin {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter in First Name: ");
		String fn = in.nextLine();
		System.out.print("Enter in Last Name: ");
		String ln = in.nextLine();
		ln.replaceAll(" ", "");
		String fnLetter = fn.substring(0, 1);
		
		String username = (fnLetter + ln).toLowerCase().trim();
		
		String pattern = "^[a-z]{1,20}$";
		
		if(!username.matches(pattern)) {
			username = username.substring(0, 19);
		}
		
		System.out.print(username);

	}
}