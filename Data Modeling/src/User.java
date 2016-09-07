
// inheritance
// 1.) can only extend 1 class
// 2.) reduction and refactoring of source code
public class User extends Person {
	
	private String username;
	public String getUsername() { return username; }
	public void setUsername(String u) { username = u; }
	
	private String password;
	public String getPassword() { return password; }
	public void setPassword(String p) { password = p; }
}
