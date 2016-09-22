/*
 * Given the following sample tracks in the code pull out information to populate a 
 * class and print out the information to the screen for all the class properties given
 * 
 * Resources:
 * https://en.wikipedia.org/wiki/Magnetic_stripe_card
 * 
 * Hints:
 * String.split()
 * 
 * Class:
 * Account Number (PAN) - getter/setter
 * Expiration Year - getter/setter
 * Expiration Month - getter/setter
 * Account Holder First Name - getter/setter
 * Account Holder Last Name - getter/setter
 */

import java.util.List;
import java.util.ArrayList;
public class MagneticStripe {
	public static void main(String[] args) {
		List<String> tracks = new ArrayList<String>();
		
		tracks.add("%B6011000000000012^DRAKE/DAMON E             ^18071X100000*000000000XXX000000?");
		tracks.add("%B300012552615478^DUCK/DONALD               ^1806Z3011225*000378000XXX000142?");

	}
	
	/*--- CLASS INSTANCE CODE ---*/
	private String accountNumber;
	public String getAccountNumber() { return accountNumber; }
	public void setAccountNumber(String an) { an = accountNumber; }
	
	private String expYear;
	public String getExpYear() { return expYear; }
	public void setExpYear(String ey) { ey = expYear; }
	
	private String expMonth;
	public String getExpMonth() { return expMonth; }
	public void setExpMonth(String em) { em = expMonth; }
	
	private String firstName;
	public String getFirstName() { return firstName; }
	public void setFirstName(String fn) { fn = firstName; }
	
	private String lastName;
	public String getLastName() { return lastName; }
	public void setLastName(String ln) { ln = lastName; }
	
	
	public void print() {
		
	}
}