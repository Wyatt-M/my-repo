import java.time.LocalDate;
import java.util.List;
//3.) Post Class - Message, LocalDate, Owner ( { User } ), Collection<Reply>
public class Post {

	private String message;
	public String getMessage() { return message; }
	public void setMessage(String m) { message = m; }
	
	private LocalDate posted;
	public LocalDate getPosted() { return posted; }
	public void setPosted(LocalDate p) { posted = p; }
	
	private User owner;
	public User getOwner() { return owner; }
	public void setOwner(User u) { owner = u; }
	
	private Post parent;
	public Post getParent() { return parent; }
	public void setParent(Post p) { parent = p; }
	
	private List<Post> replies;
	public List<Post> getReplies() { return replies; }
	public void setReplies(List<Post> r) { replies = r; }
}