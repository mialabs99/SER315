
//class that holds administrator information.
public class Administrators implements RaceObserver {
	
	//administrator attributes
	private int adminID;
	private String name;
	private ContactInfo contactInfo;
	
	//administrator constructor
	public Administrators(int adminID, String name, ContactInfo contactInfo){
		this.adminID = adminID;
		this.name = name;
		this.contactInfo = contactInfo;
	}
	
	//selects a user account to manage
	public void ManageUserAccounts() {
		
	}
	
	//selects a license to manage
	public void ManageLicenses() {
		
	}
	
	//selects a setting to manage
	public void ManageSystemSettings() {
		
	}
	
	//observer pattern implementation
	@Override
	public void onRaceCreated(Race race) {
		System.out.println("Administrator " + name + " notified: New race '" + race.getRaceName() + "' has been created and requires approval!");
	}
	
	@Override
	public void onRaceUpdated(Race race) {
		System.out.println("Administrator " + name + " notified: Race '" + race.getRaceName() + "' has been updated!");
	}
	
	@Override
	public void onRaceResultsPublished(Race race, RaceResults results) {
		System.out.println("Administrator " + name + " notified: Results for race '" + race.getRaceName() + "' have been published!");
	}
	
	@Override
	public void onRacerRegistered(Race race, Racers racer) {
		System.out.println("Administrator " + name + " notified: Racer " + racer.getName() + " has registered for race '" + race.getRaceName() + "'!");
	}
	
	//getters and setters
	public int getAdminID() {
		return adminID;
	}
	public String getName() {
		return name;
	}
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
}



