/*
 * Using regular expressions and string.matches() create a program to validate
 * html color codes.
 * 
 * Valid Color Codes:
 * #fffaaa
 * #ffa
 * #9900bb
 */
import java.util.Scanner;

public class HtmlColorValidator {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("Enter your HTML color code: ");
		String code = in.nextLine();
		
		String hex = "^#([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$";
		
		if(code.matches(hex)) {
			System.out.println(code + " is a valid html code.");
		}
		else {
			System.out.println(code + " is not a valid html code.");
		}
		
	}
}