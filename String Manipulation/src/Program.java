
public class Program {

	public static void main(String[] args) {
		// Character functions
		/*
		 Boolean checks on a Character
		 ----------------------------- 
		Character.isDigit('') | 0-9
		Character.isLetter('') | a-z A-Z
		Character.isUpperCase('') | works only letters
		Character.isLowerCase('') | works only letters
		Character.isWhitespace('') | \r \n ' ' \t
		
		char Character.isUpperCase('') | upper case a letter and return it
		char Character.isLowerCase('') | lower case a letter and return it
		Character.toString('') | converts a character to a string
		*/
		
		// String functions
		// String name = "Damon Drake E";
		
		// String name.substring(startIndex, endIndex) | (0, 3) -> Dam | returns part of a string
		// String name.toUpperCase() | returns an upper case string
		// String name.toLowerCase() | returns a lower case string
		// int name.length() | human readable length of the string ( < )
		// String[] name.split(",") | delimiter
		// Common delimiter , \t |
		// , \t - CSV, | pipe delimiter
		// char[] name.toCharArray() | string into a character array
		
		/* Regular Expression ( string pattern matching )
		 * ----------------------------------------------
		 * \d - digit
		 * \D - non digit
		 * \w - word character a-z A-Z
		 * \W - non word character
		 * \s - space character
		 * \S - non space character
		 * 
		 * ^ - starts with
		 * $ - ends with
		 * 
		 * Quantifiers
		 * * - 0 or more - anything else ^d.$
		 * . - almost everything except line/carriage returns 
		 * + - 1 or more
		 * {x} - must match x number of times
		 * {x, y} - must match x -y number of times only
		 * {x,} must match minimum of x number of times to unlimited
		 * 
		 * Sets
		 * [abcdef0123456789] - set match
		 * [^ghik] - can't be in this set
		 * () - grouping
		 * | - or statement
		 */
		
		// You are writing a web browser
		// Needs to match hexadecimal color codes
		// <p style='color:#ffffff></p>
		// ^#([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$
		
		// validate a uri (url)
		// google.com, www.google.com, mail.google.com secure.mail.google.com
		// ^http[s]{0,1}://.\.(com|net|gov|biz)$
		
		// Donald Duck, Damon Drake, Fred Flintstone
		// check for proper names assuming 1 first name 1 last name
		// ^[A-Z]{1}\w+\s{1}[A-Z]{1}\w+$
		
		// Course Code
		// CPD 222 A - 6 * char(5) = char(30)
		// 'CPD  222  A                   ' - 30 bytes * 22,800
		// 'BI   100  A                   '
		// 'PDV  100  EHS                 '
		// 'MICT 100  B                   '
		// 'BAT  110  Z2                  '
		
		// ^[A-Z ]{5}[0-9 ]{5}[0-9A-Z ]{5}\s{15}$

	}

}
