import java.util.Scanner;

public class Track {

	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {

		Track t1 = new Track();
		
		Track.print();
		
		in.close();
	}

	private static int trackNum;
	public int getTrackNum() { return trackNum; }
	public void setTrackNum(int tn) { trackNum = tn; }
	
	private static String title;
	public String getTitle() { return title; }
	public void setTitle(String t) { title = t; }
	
	private static String artist;
	public String getArtist() { return artist; }
	public void setArtist(String a) { artist = a; }
	
	private static int duration;
	public int getDuration() { return duration; }
	public void setDuration(int d) { duration = d; }

	private static int bitRate;
	public int getBitRate() { return bitRate; }
	public void setBitRate(int b) { bitRate = b; }
	
	
	public Track() {
		
		System.out.print("Enter track number: "); 
		trackNum = Integer.parseInt(Track.in.nextLine());
		
		System.out.print("Enter the song title: ");
		title = Track.in.nextLine();
		
		System.out.print("Enter the artist: ");
		artist = Track.in.nextLine();
		
		System.out.print("Enter the duration in seconds: ");
		duration = Integer.parseInt(Track.in.nextLine());
		
		System.out.print("Enter the bit rate:");
		bitRate = Integer.parseInt(Track.in.nextLine());
	}

	public static int bit(int bitRate) {
		
		if (bitRate == 128 || bitRate == 160) {
			System.out.print(bitRate + "Good");
		} 
		else if (bitRate == 192 || bitRate == 256) {
			System.out.print(bitRate + "Better");
		}
		else if (bitRate == 320) {
			System.out.print(bitRate + "Best");;
		}
		return bitRate;
		 
		
	}
	
	public static int seconds(int duration) {
		int min = duration / 60;
		int sec = duration - (min * 60);
		
		System.out.print(duration);;
		return duration;
	}
	
	public static void print() {
		
		System.out.println(trackNum + " - " + title);
		System.out.println(artist);
		System.out.println(duration);
		System.out.println(bitRate);
		
	}
	
}

