
import java.util.ArrayList;

//class that holds organizer information.
public class Organizers implements RaceObserver {

	//organizer attributes
	private int organizerID;
	private String name;
	private ContactInfo contactInfo;
	
	//organizers constructor
	public Organizers(int organizerID, String name, ContactInfo contactInfo) {
		this.organizerID = organizerID;
		this.name = name;
		this.contactInfo = contactInfo;
	}
	
	//creates a new race class to add to the list
	public void createRace() {
		
	}
	
	//updates an already existing race in the list
	public void updateRace() {
		
	}
	
	//updates the stages within an already existing race
	public void setStages() {
		
	}
	
	//updates the results of a completed race
	public void updateResults() {
		
	}
	
	//factory pattern integration - create races using the factory
	public Race createRace(String raceType, String raceName, String raceDate, 
	                      int numMiles, String raceRoute, ArrayList<String> stages) {
		Race newRace = RaceFactory.createRace(raceType, raceName, raceDate, numMiles, raceRoute, stages);
		System.out.println("Organizer " + name + " created a new " + raceType + " race: " + raceName);
		return newRace;
	}
	
	//observer pattern implementation
	@Override
	public void onRaceCreated(Race race) {
		System.out.println("Organizer " + name + " notified: Race '" + race.getRaceName() + "' has been created!");
	}
	
	@Override
	public void onRaceUpdated(Race race) {
		System.out.println("Organizer " + name + " notified: Race '" + race.getRaceName() + "' has been updated!");
	}
	
	@Override
	public void onRaceResultsPublished(Race race, RaceResults results) {
		System.out.println("Organizer " + name + " notified: Results for race '" + race.getRaceName() + "' have been published!");
	}
	
	@Override
	public void onRacerRegistered(Race race, Racers racer) {
		System.out.println("Organizer " + name + " notified: Racer " + racer.getName() + " has registered for race '" + race.getRaceName() + "'!");
	}
	
	//getters and setters
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


