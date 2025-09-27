package SER315_GroupProject;

import java.util.ArrayList;

public class Racers {
	
	//Racers attributes
	int racerID;
	String name;
	CAT currentCAT;
	ContactInfo contactInfo;
	ArrayList<Race> upcomingRaces;
	ArrayList<Race> completedRaces;
	License license;
	
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
}
