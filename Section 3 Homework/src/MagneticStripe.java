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
		
		// Data Stripe 1
		tracks.add("%B6011000000000012^DRAKE/DAMON E             ^18071X100000*000000000XXX000000?");
		tracks.add("%B300012552615478^DUCK/DONALD               ^1806Z3011225*000378000XXX000142?");		
		
		for(String s : tracks) {
			MagneticStripe stripe = new MagneticStripe(s);
			stripe.print();
		}
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
	
	
	public MagneticStripe(String track) {
		/*
		 * String[] trk = track.split("\^")
		 * %B300012552615478 - 0 - trk[0].replaceAll(%B, "") | trk[0].substring(2) accountNumber =
		 * "^[3456]{1}[0-9]{14,15}$" - 
		 * 
		 * 
		 * DUCK/DONALD - 1     
		 * x = trk[1].splt("/")
		 * x[0] = lastName, x[1].trim() = firstName
		 * 
		 * 
		 * 1806Z3011225*000378000XXX000142? - 2
		 * trk[2].substring(0, 2) = year, trk[2].substring(2, 2) = month
		 */
		String[] trk = track.split("\\^");
		
		accountNumber = trk[0].replaceAll("%B", "");
		
		String[] x = trk[1].split("/");
		lastName = x[0];
		firstName = x[1].trim();
		
		expYear = trk[2].substring(0, 2);
		expMonth = trk[2].substring(3, 4);
		
		
	}
	
	
	public void print() {
		System.out.println("Your account number is: " + getAccountNumber());
		System.out.println("First name: " + getFirstName() + " " + "Last name: " +getLastName());
		System.out.println("Exp Year: " + getExpYear() + " " +"Exp Month: " + getExpMonth());
		System.out.println();
	}
	
	
}