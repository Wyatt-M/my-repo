import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * Create a class that store information for a game. Please try to research and use real examples. Complete the todo statements and upload to moodle when
 * completed.
 */
public class VideoGame {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		VideoGame v1 = new VideoGame();
		
		VideoGame.print();
		
		in.close();
	}
	/*
	 Create fields for:
	 --------------------------------------
	 	Title
	 	Genre
	 	Platform ( x box, pc, etc... )
	 	Number of Players
	 	Game Rating C - Early Childhood, E - Everyone, E 10+ - Everyone 10+, Teen (13+), Mature 17+,  Adult Only 18+
	 	Cost
	 */
	
	// TODO Create Fields for specified information 6pts
	private static String title;
	public String getTitle() { return title; }
	public void setTitle(String t) { title = t; }
	
	private static String genre;
	public String getGenre() { return genre; }
	public void setGenre(String g) { genre = g; }
	
	private static String platform;
	public String getPlatform() { return platform; }
	public void setPlatform(String p) { platform = p; }
	
	private static int numPlay;
	public int getNumPlay() { return numPlay; }
	public void setNumPlay(int nP) { numPlay = nP; }
	
	private static String gRate;
	public String getGRate() { return gRate; }
	public void setGRate(String gR) { gRate = gR; }
	
	private static double cost;
	public double getCost() { return cost; }
	public void setCost(double c) { cost = c; }
	
	public static int age;
	public static int getAge() { return age; }
	public void setCost(int a) { age = a; }
	// TODO Create getters/setters for every field 12pts
		
	// TODO Create default constructor to prompt for game information 12pts
	public VideoGame() {
		
		System.out.print("Enter title for game: ");
		title = VideoGame.in.nextLine();
		
		System.out.print("Enter genre of video game: ");
		genre = VideoGame.in.nextLine();
		
		System.out.print("Enter gaming platform: ");
		platform = VideoGame.in.nextLine();
		
		System.out.print("Enter number of players: ");
		numPlay = Integer.parseInt(VideoGame.in.nextLine());
		
		System.out.print("Enter the game rating (ex. C, E, E 10+, T, M, A): ");
		gRate = VideoGame.in.nextLine();
		
		System.out.print("Enter cost: ");
		cost = Double.parseDouble(VideoGame.in.nextLine());
		
		System.out.print("Enter age: ");
		age = Integer.parseInt(VideoGame.in.nextLine());
		
	}
	// TODO Create function to prompt the individual for their age and return if they are allowed 8pts
	// to play the game based on the ESRB ratings chart and the information provided.
	public static String Age(String gR, int age) {
		String i = "";
		
		if (gR == "C" && age > 0) {
			 return i = "You can play the game";
		}
		
		
		return i;

		
	}
	
	
	// TODO Create print function to print out game details 7pts
	/*
	 	{title} - {genre}
	 	{platform}
	 	{game rating} {game rating text} Number of Players: {number of players}
	 	{cost:$#,#00.00}
	 	
	 	ex.
	 	
	 	Skyrim - Fantasy
	 	X-Box 360
	 	M Mature 17+ Number of Players: 1
	 	cost: $18.99
	 	
	 	
	 	Hint: if you care to use
	 	# is a place holder that is only shown if there is a value
	 	0 is a place holder that is always shown
	 	.00 means that this will round and only display out to 2 decimal places
	 	
	 	DecimalFormat fmt = new DecimalFormat("$#,##0.00"); // This is a common money format.
	 	String prettyMoney = fmt.format(cost); // Function returns a string with the format you have specified. 	
	 */
	public static void print() {
		System.out.println(title + " - " + genre);
		System.out.println(platform);
		System.out.println(gRate + " Number of players: " + numPlay);
		
		DecimalFormat fmt = new DecimalFormat("$#,##0.00");
		String Money = fmt.format(cost);
		
		System.out.print(Money);
		System.out.print(VideoGame.Age(i));
	}

}