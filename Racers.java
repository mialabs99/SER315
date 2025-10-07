package SER315_GroupProject;

import java.util.ArrayList;

//Class that holds the racer's information.
public class Racers extends User{

    //ArrayList holding all Racers currently signed up for the program
    private ArrayList<User> allRacers;

	//Racers attributes
	private CAT currentCAT;
	private ContactInfo contactInfo;
	private ArrayList<Race> upcomingRaces;
	private ArrayList<Race> completedRaces;
	private License license;
	
	//Racers constructor
	public Racers(int racerID, String name, CAT currentCAT, ContactInfo contactInfo, 
			ArrayList<Race> upcomingRaces, ArrayList<Race> completedRaces, License license) {
        super(racerID, name, Role.RACER);
		this.currentCAT = currentCAT;
		this.contactInfo = contactInfo;
		this.upcomingRaces = upcomingRaces;
		this.completedRaces = completedRaces;
		this.license = license;
	}

    //Adds a new Racer to the allRacers ArrayList
    private void addRacer(User racer){
        allRacers.add(racer);
    }

    //Removes a Racer from the allRacers ArrayList
    private void removeRacer(User racer){
        allRacers.remove(racer);
    }
	
	//Racers can sign up for a new race
	public void signUpForRace(RaceRegistration raceRegistration, int racerID) {

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
	public CAT getCurrentCAT() {return currentCAT;}
	public ContactInfo getContactInfo() {return contactInfo;}
	public ArrayList<Race> getUpcomingRaces() {return upcomingRaces;}
	public ArrayList<Race> getCompletedRaces() {return completedRaces;}
	public License getLicense() {return license;}
    public ArrayList<User> getAllRacers(){return allRacers;}
	public void setCurrentCAT(CAT currentCAT) {this.currentCAT = currentCAT;}
	public void setContactInfo(ContactInfo contactInfo) {this.contactInfo = contactInfo;}
	public void setUpcomingRaces(ArrayList<Race> upcomingRaces) {this.upcomingRaces = upcomingRaces;}
	public void setCompletedRaces(ArrayList<Race> completedRaces) {this.completedRaces = completedRaces;}
    public void setAllRacers(ArrayList<User> allRacers){this.allRacers = allRacers;}
}




