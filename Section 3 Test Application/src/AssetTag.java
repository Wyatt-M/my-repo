import java.util.ArrayList;
import java.util.List;

/*
 * Asset Tags are made up of the following criteria:
 * 1.) Database ID: First 7 characters and is a 32 bit integer \d7
 * 2.) Device Type: 3 characters long following the database id \w{3}
 * 		* Valid Values Are:
 * 			- CMP - Computer
 * 			- LPT - Laptop
 * 			- PRN - Printer
 * 			- PRJ - Projector
 * 			- TBT - Tablet
 * 			- PHN - Phone
 * 			- OTH - Other
 * 3.) Building: 2 Characters following the device type \w{2}
 * 		* Valid Values Are:
 * 			- MN - Main Campus
 * 			- SA - Sauder Extension Building
 * 			- DC - Downtown Campus
 * 			- WD - Welding Building
 * 			- TC - Technology Building
 * 			- JE - Jones Education Center
 * 4.) Room Number: 5 Characters following the building code\w{6}
 * 		* This can contain numbers, characters and spaces
 * 5.) PO Number: The PO number is 6 characters following the room number.\d{6}
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
		
		// 0000022 CMP MN M121 000217 (2016 01 13) A3F
		// 0000158 CMP MN M121 000217 (2016 01 13) D66
		// 0000311 PHN MN M102 000468 (2014 04 16) EEF
		// 0000444 PRJ SA S102 000920 (2015 07 22) FFF
		// 0002589 PRN JE J004 000A22 (2015 08 01) 982
		// 0000011 CMP MN M108J 000311 (2014 05 09) 460
		// 0001635 LPT MN M115 000311 (2015 08 07) ABE
		// 0000387 CMP DC DC103 001422 (2013 08 07) CAB
		// 0002020 OTH DC DC105 000918 (2012 02 02) DEF
		// 0008511 TBT MN M104 000229 (2015 01 01) BAD
		// 8675309 OTH MN M113 000636 (2014 06 11) DAD
		
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
		
		
//		String reg = "^[0-9]{7}[A-Z]{3}[A-Z]{2}[0-9A-Z]\\s?{4,5}[0-9]{8}[0-9A-Z]{3}?";
//		if(track.matches(reg)) {
//			dataID = track;
//		}

			
		
		dataID = track.substring(0, 7);
		deviceType = track.substring(7, 10);
		building = track.substring(10, 12);
		roomNum = track.substring(12, 17).trim();
		poNum = track.substring(17, 23);
		tagDate = track.substring(23, 31);
		checksum = track.substring(31, 34);
		
		
		dataID = dataID.replaceFirst("^0*", "");
		
		
		deviceType = deviceType.replace("CMP", "Computer");
		deviceType = deviceType.replace("LPT", "Laptop");
		deviceType = deviceType.replace("PRN", "Printer");
		deviceType = deviceType.replace("PRJ", "Projector");
		deviceType = deviceType.replace("TBT", "Tablet");
		deviceType = deviceType.replace("PHN", "Phone");
		deviceType = deviceType.replace("OTH", "Other");
		

		building = building.replace("MN", "Main Campus");
		building = building.replace("SA", "Sauder Extension Building");
		building = building.replace("DC", "Downtown Campus");
		building = building.replace("WD", "Welding Building");
		building = building.replace("TC", "Technology Building");
		building = building.replace("JE", "Jones Education Center");
		
		
		String year = tagDate.substring(0, 4);
		String month = tagDate.substring(4, 6);
		String day = tagDate.substring(6, 8);
		tagDate = (month + "/" + day + "/" + year);
		
		poNum = poNum.replaceFirst("^0*", "");
	}
	
	public void print() {
		System.out.println("ID: " + getDataID());
		System.out.println(getDeviceType() + " - " +getBuilding() + " - " + getRoomNum());
		System.out.println("PO: " + getPoNum());
		System.out.println("Tagged: " + getTagDate());
		System.out.println("Checksum: " + getChecksum());
		System.out.println();
	}
}

