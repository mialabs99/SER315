package SER315_GroupProject;

import java.util.ArrayList;

public class Racers {
	
	//Racers attributes
	private int racerID;
	private String name;
	private CAT currentCAT;
	private ContactInfo contactInfo;
	private ArrayList<Race> upcomingRaces;
	private ArrayList<Race> completedRaces;
	private License license;
	
	//Racers constructor
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
	
	//Racers can sign up for a new race
	public void signUpForRace(int raceID) {
		
	}
	
	//Racers can review a race they have completed
	public void reviewRace(int raceID) {
		
	}
	
	//Returns completed races arraylist
	public ArrayList<Race> viewRaceHistory() {
		return completedRaces;
	}
	
	//Racers can purchase a new license
	public void purchaseLicense() {
		
	}
	
	//Getters and setters
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

