import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * Create a program that collects information on a person, their posts, and replies to their post.
 * 
 * Print out the Person in order by last name first
 */

// 1.) Person Class - First Name, Last Name, User name, email, password, mobile phone number
// 2.) User ??
// 3.) Post Class - Message, LocalDate, Owner ( { User } ), Collection<Reply>
// 4.) Reply Class - ( Post ), Post { Parent }

public class Program {

	public static void main(String[] args) {
		
		//List<User> people = new ArrayList<User>();
		
		User user = new User();
		user.setFirstName("Donald");
		user.setlastName("Dicchico");
		user.setEmail("ddicchico@remulak.net");
		user.setUsername("beldar");
		user.setPassword("p@ssw0rd");
		
		
		User user2 = new User();
		user2.setFirstName("Fred");
		user2.setlastName("Flintstone");
		user2.setEmail("fflinstone@remulak.net");
		user2.setUsername("flint");
		user2.setPassword("p@ssw0rd");
		
		
		
		Post post = new Post();
		post.setMessage("Just say no!");
		post.setOwner(user);
		post.setPosted(LocalDate.now());
		
		Post post2 = new Post();
		post2.setMessage("I tried.");
		post2.setOwner(user);
		post2.setPosted(LocalDate.now());
		post2.setParent(post);
		
		
		Post post3 = new Post();
		post3.setMessage("Lets do this");
		post3.setOwner(user2);
		post3.setPosted(LocalDate.now());
		
		Post post4 = new Post();
		post4.setMessage("Naw man.");
		post4.setOwner(user2);
		post4.setPosted(LocalDate.now());
		post4.setParent(post3);
		
		
		List<Post> one = new ArrayList<Post>();
		one.add(post);
		one.add(post2);
		
		
		List<Post> two = new ArrayList<Post>();
		two.add(post3);
		two.add(post4);
		
		
		List<Post> replies = new ArrayList<Post>();
		replies.add(post2);
		replies.add(post4);
		post.setReplies(replies);
	
		List<Post> all = new ArrayList<Post>();
		all.add(post);
		all.add(post2);
		all.add(post3);
		all.add(post4);

		user.setPosts(one);
		user2.setPosts(two);
		
		List<User> people = new ArrayList<User>();
		people.add(user);
		people.add(user2);
		
		
		
		for(User x : people) {
			x.print();
			System.out.println();
		}

	}

}
