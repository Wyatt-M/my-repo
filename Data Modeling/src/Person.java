import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Person {
	//THIS DOES NOT BELONG TO THE INSTANCE OF THIS CLASS
	//--------------------------------------------------
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {		
		
		// Indeterminate amount of people
		List<Person> people = new ArrayList<Person>();
		
		Person p1 = new Person();
		p1.setFirstName("Fred");
		p1.setLastName("Flintstone");
		people.add(p1);
		
		Person p2 = new Person();
		p2.setFirstName("Stewie");
		p2.setLastName("Griffin");
		people.add(p2);
		
		Person p3 = new Person();
		p3.setFirstName("Jeffery");
		p3.setLastName("Dahmer");
		people.add(p3);
		
		Person p4 = new Person();
		p4.setFirstName("Wesley");
		p4.setLastName("Snipes");
		people.add(p4);
		
		// Sorting - Order By 
		// Filtering - WHERE ( return you a subset of a list )
		
		 /*public int sort(Person x, Person y) {
		 	x.getFirstName.compareTo(y.getFirstName()));
		 }*/
		
		// Lambda expression () ->, () =>
		// Ascending
		// Descending
		
		// Collections.sort(people, (x , y) -> y.getFirstName().compareTo(x.getFirstName()));
		
		// Stream | ParallelStream
		// Collections / a stream represents function to manage a collection
		// Stream - single threaded apartment model
		// ParallelStream - parallel processing model
		// Parallel vs Thread 
		// -------------------------------------------------------------------------
		// Race Condition - First in wins
		// Deadlock - One thread does not release resources, locks other threads out
		
		people.stream()
		//.filter(x -> x.getFirstName().startsWith("W") && x.getLastName().toLowerCase().startsWith("S"))
		//.sorted((x , y) -> x.getFirstName().compareTo(y.getFirstName()))
		.sorted((x , y) -> Integer.compare(x.getAge(), y.getAge()))
		.forEach(x -> System.out.println(x.getFirstName() + " " + x.getLastName() + " " + x.getAge()));
		

		
		
		
// -----------------------------------------------------------------------------------------------------------------------------------------		
//		System.out.print("How many people do you want to enter: ");
//		int numPeople = Integer.parseInt(in.nextLine());
//		
//		User[] peeps = new User[numPeople]; // same affect of List<Person>
//		
//		for(int i = 0; i < numPeople; i++) {
//			User u = new User();
//			
//			System.out.print("Enter First Name: ");
//			u.setFirstName(in.nextLine());
//			System.out.print("Enter Last Name: ");
//			u.setLastName(in.nextLine());
//			
//			peeps[i] = u;
//			people.add(u);
//		}
//		
//		// print them all out
//		// ^L+$
//		for (Person t : people) { // could change people to peeps 
//			char[] fnArray = t.getFirstName().toCharArray();
//			
//			if (t.getLastName().startsWith("L") || t.getLastName().startsWith("W")) {
//				System.out.println("Name: " + t.getFirstName() + " " + t.getLastName());
//			}
//			
//			if (fnArray[2] == 'a') {
//				System.out.println("Name: " + t.getFirstName() + " " + t.getLastName());
//			}
//			
//			if (fnArray.length >= 4 && fnArray[0] + fnArray[3] < 243) {
//				System.out.println(fnArray[0] + fnArray[3]);
//				System.out.println("Name: " + t.getFirstName() + " " + t.getLastName());
//			}
//			
//			
//		}
//		
//		// TODO only print names where the last name starts with an L or W (in the for loop)
//		// TODO only print names where the 3rd letter of the firstName is 'a' lower case (fnArray)
//		// TODO print names where letters 1 and 4 adds up to be less than 243 (fnArray.length)
//		
		in.close();
	}
	//--------------------------------------------------
	
	// POJO (plain old java object)
	// 1.) all fields/properties must be private with a public getter/setter
	// 2.) only use a default constructor
	// 3.) constructor must be blank and not build the object
	private String firstName;
	public String getFirstName() { return firstName; }
	public void setFirstName(String fn) { firstName = fn; }
	
	private String lastName;
	public String getLastName() { return lastName; }
	public void setLastName(String ln) { lastName = ln; }
	
	private int age;
	public int getAge() { return age; }
	public void setAge(int a) { age = a; }
}
