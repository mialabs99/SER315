package SER315_GroupProject;

//Class that holds organizer information.
public class Organizers extends User{

	//Organizer attributes
	private ContactInfo contactInfo;
	
	//Organizers constructor
	public Organizers(int organizerID, String name, ContactInfo contactInfo) {
        super(organizerID, name, Role.ORGANIZER);
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
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
}


