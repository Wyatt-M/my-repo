import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Asset Tags are made up of the following criteria:
 * 1.) Database ID: First 7 characters and is a 32 bit integer
 * 2.) Device Type: 3 characters long following the database id
 * 		* Valid Values Are:
 * 			- CMP - Computer
 * 			- LPT - Laptop
 * 			- PRN - Printer
 * 			- PRJ - Projector
 * 			- TBT - Tablet
 * 			- PHN - Phone
 * 			- OTH - Other
 * 3.) Building: 2 Characters following the device type
 * 		* Valid Values Are:
 * 			- MN - Main Campus
 * 			- SA - Sauder Extension Building
 * 			- DC - Downtown Campus
 * 			- WD - Welding Building
 * 			- TC - Technology Building
 * 			- JE - Jones Education Center
 * 4.) Room Number: 5 Characters following the building code
 * 		* This can contain numbers, characters and spaces
 * 5.) PO Number: The PO number is 6 characters following the room number.
 * 		* This is a 32 bit integer corresponding the Purchase Order in the database
 * 6.) Tag Date: 8 digits following PO number. 
 * 		* Format {yyyyMMdd} yyyy = 4 digit year, MM = 2 digit month, dd = 2 digit day
 * 7.) Checksum: 3 hexidecimal characters matching the start of a SHA1 hash function following
 * 	   the tag date.
 * 
 * --------------------
 * 
 * Using the criteria above complete the AssetTag class adding in each fields and it's
 * corresponding getters/setters
 * 
 * Create a constructor that takes an asset tag string. In this constructor using a 
 * regular expression of your design taking into account the criteria and validate the
 * asset tag. Also in the constructor populate the corresponding fields.
 * 
 * For every asset tag, validate and print out through a function the information 
 * in the following format:
 *
 * Example for 0000001CMPMNM102 00037220160113A3F:
 * 
 * ID: 1
 * Computer - Main Campus - M102
 * PO: 372
 * Tagged: 01/13/2016
 * Checksum: A3F
 * 
 */
public class AssetTag {

	public static void main(String[] args) {
		// TODO validate and use the following tags:
		List<String> tracks = new ArrayList<String>();
		
		tracks.add("0000022CMPMNM121 00021720160113A3F");
		tracks.add("0000158CMPMNM121 00021720160113D66");
		tracks.add("0000311PHNMNM102 00046820140416EEF");
		tracks.add("0000444PRJSAS102 00092020150722FFF");
		tracks.add("0002589PRNJEJ004 000A2220150801982");
		tracks.add("0000011CMPMNM108J00031120140509460");
		tracks.add("0001635LPTMNM115 00031120150807ABE");
		tracks.add("0000387CMPDCDC10300142220130807CAB");
		tracks.add("0002020OTHDCDC10500091820120202DEF");
		tracks.add("0008511TBTMNM104 00022920150101BAD");
		tracks.add("8675309OTHMNM113 00063620140611DAD");
		
		for(String a : tracks) {
			AssetTag tag = new AssetTag(a);
			tag.print();
		}

	}
	
	private String dataID;
	public String getDataID() { return dataID; }
	public void setDataID(String ID) { ID = dataID; }
	
	private String deviceType;
	public String getDeviceType() { return deviceType; }
	public void setDeviceType(String dt) { dt = deviceType; }
	
	private String building;
	public String getBuilding() { return building; }
	public void setBuilding(String b) { b = building; }
	
	private String roomNum;
	public String getRoomNum() { return roomNum; }
	public void setRoomNum(String rn) { rn = roomNum; }
	
	private String poNum;
	public String getPoNum() { return poNum; }
	public void setPoNum(String pn) { pn = poNum; }
	
	private String tagDate;
	public String getTagDate() { return tagDate; }
	public void setTagDate(String td) { td = tagDate; }
	
	private String checksum;
	public String getChecksum() { return checksum; }
	public void setCheckSum(String cs) { cs = checksum; }
	
	public AssetTag(String track) {
		
		//String reg = ("^[0-9]$", 7);
		
		String[] data = track.split("^[0-9]$", 7);
		
		dataID = Arrays.toString(data);
	}
	
	public void print() {
		System.out.println(getDataID());
	}
}
