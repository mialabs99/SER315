package SER315_GroupProject;

//Class that holds organizer information.
public class Organizers {

	//Organizer attributes
	private int organizerID;
	private String name;
	private ContactInfo contactInfo;
	
	//Organizers constructor
	public Organizers(int organizerID, String name, ContactInfo contactInfo) {
		this.organizerID = organizerID;
		this.name = name;
		this.contactInfo = contactInfo;
	}
	
	//Creates a new race class to add to the list
	public void createRace() {
		
	}
	
	//Updates an already existing race in the list
	public void updateRace() {
		
	}
	
	//Updates the stages within an already existing race
	public void setStages() {
		
	}
	
	//Updates the results of a completed race
	public void updateResults() {
		
	}
	
	//Getters and setters
	public int getOrganizerID() {
		return organizerID;
	}
	public String getName() {
		return name;
	}
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setOrganizerID(int organizerID) {
		this.organizerID = organizerID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
}


