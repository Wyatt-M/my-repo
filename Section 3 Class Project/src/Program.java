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
		User user = new User();
		user.setFirstName("Donald");
		user.setlastName("Dicchico");
		user.setEmail("ddicchico@remulak.net");
		user.setUsername("beldar");
		user.setPassword("p@ssw0rd");
		
		Post post = new Post();
		post.setMessage("Just say no!");
		post.setOwner(user);
		post.setPosted(LocalDate.now());
		
		Post post2 = new Post();
		post2.setMessage("I tried.");
		post2.setOwner(user);
		post2.setPosted(LocalDate.now());
		post2.setParent(post);
		
		List<Post> replies = new ArrayList<Post>();
		replies.add(post2);
		post.setReplies(replies);
		
		List<Post> all = new ArrayList<Post>();
		all.add(post);
		all.add(post2);
		
		user.setPosts(all);
		// stream filter post.getParent() == null = Root Post
		//								  != null = Post Reply
		
		// Dependency chain
		// 2. Person <- User <- Post <- Reply 

	}

}
