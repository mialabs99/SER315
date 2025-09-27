package SER315_GroupProject;

public class Administrators {
	
	//Administrator attributes
	private int adminID;
	private String name;
	
	//Administrator constructor
	public Administrators(int adminID, String name){
		this.adminID = adminID;
		this.name = name;
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
	
	public int getAdminID() {
		return adminID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAdminID(int newID) {
		adminID = newID;
	}
	
	public void setName(String newName) {
		name = newName;
	}
}

