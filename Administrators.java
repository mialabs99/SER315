package SER315_GroupProject;

//Class that holds administrator information.
public class Administrators {
	
	//Administrator attributes
	private int adminID;
	private String name;
	private ContactInfo contactInfo;
	
	//Administrator constructor
	public Administrators(int adminID, String name, ContactInfo contactInfo){
		this.adminID = adminID;
		this.name = name;
		this.contactInfo = contactInfo;
	}
	
	//Selects a user account to manage
	public void ManageUserAccounts() {
		
	}
	
	//Selects a license to manage
	public void ManageLicenses() {
		
	}
	
	//Selects a setting to manage
	public void ManageSystemSettings() {
		
	}
	
	//Getters and setters
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



