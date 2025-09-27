package SER315_GroupProject;

public class Organizers {

	//Organizer attributes
	int organizerID;
	String name;
	ContactInfo contactInfo;
	
	//Class that holds the organizer's contact info
	public class ContactInfo{
		
		//Contact info attributes
		String phoneNumber;
		String address;
		String email;
		
		//Contact info constructor
		public ContactInfo(String phoneNumber, String address, String email) {
			this.phoneNumber = phoneNumber;
			this.address = address;
			this.email = email;
		}
		
		//Getters and setters
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public String getAddress() {
			return address;
		}
		public String getEmail() {
			return email;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	}
	
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
}
