
import java.util.ArrayList;

//class that holds the racer's information.
public class Racers implements RaceObserver {
	
	//racers attributes
	private int racerID;
	private String name;
	private CAT currentCAT;
	private ContactInfo contactInfo;
	private ArrayList<Race> upcomingRaces;
	private ArrayList<Race> completedRaces;
	private License license;
	
	//racers constructor
	public Racers(int racerID, String name, CAT currentCAT, ContactInfo contactInfo, 
			ArrayList<Race> upcomingRaces, ArrayList<Race> completedRaces, License license) {
		this.racerID = racerID;
		this.name = name;
		this.currentCAT = currentCAT;
		this.contactInfo = contactInfo;
		this.upcomingRaces = upcomingRaces;
		this.completedRaces = completedRaces;
		this.license = license;
	}
	
	//racers can sign up for a new race
	public void signUpForRace(int raceID) {
		
	}
	
	//racers can review a race they have completed
	public void reviewRace(int raceID) {
		
	}
	
	//returns completed races arraylist
	public ArrayList<Race> viewRaceHistory() {
		return completedRaces;
	}
	
	//racers can purchase a new license
	public void purchaseLicense() {
		
	}
	
	//observer pattern implementation
	@Override
	public void onRaceCreated(Race race) {
		System.out.println("Racer " + name + " notified: New race '" + race.getRaceName() + "' has been created!");
	}
	
	@Override
	public void onRaceUpdated(Race race) {
		System.out.println("Racer " + name + " notified: Race '" + race.getRaceName() + "' has been updated!");
	}
	
	@Override
	public void onRaceResultsPublished(Race race, RaceResults results) {
		System.out.println("Racer " + name + " notified: Results for race '" + race.getRaceName() + "' have been published!");
	}
	
	@Override
	public void onRacerRegistered(Race race, Racers racer) {
		if (this.racerID == racer.getRacerID()) {
			System.out.println("Racer " + name + " confirmed: You have been registered for race '" + race.getRaceName() + "'!");
		} else {
			System.out.println("Racer " + name + " notified: Another racer has registered for race '" + race.getRaceName() + "'!");
		}
	}
	
	//getters and setters
	public int getRacerID() {
		return racerID;
	}
	public String getName() {
		return name;
	}
	public CAT getCurrentCAT() {
		return currentCAT;
	}
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public ArrayList<Race> getUpcomingRaces() {
		return upcomingRaces;
	}
	public ArrayList<Race> getCompletedRaces() {
		return completedRaces;
	}
	public License getLicense() {
		return license;
	}
	public void setRacerID(int racerID) {
		this.racerID = racerID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCurrentCAT(CAT currentCAT) {
		this.currentCAT = currentCAT;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
	public void setUpcomingRaces(ArrayList<Race> upcomingRaces) {
		this.upcomingRaces = upcomingRaces;
	}
	public void setCompletedRaces(ArrayList<Race> completedRaces) {
		this.completedRaces = completedRaces;
	}
}


