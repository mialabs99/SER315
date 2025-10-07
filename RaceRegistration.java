package SER315_GroupProject;

import java.util.ArrayList;

//Class that hold registration info for each race.
public class RaceRegistration {
	
	//RaceRegistration attributes
    private int raceID;
	private String registrationDate;
	private ArrayList<Racers> racersParticipating;
	private int maxParticipants;
	private CAT requiredCAT;
	
	//RaceRegistration constructor
	public RaceRegistration(int raceID, String registrationDate,
                            ArrayList<Racers> racersParticipating, int maxParticipants,
                            CAT requiredCAT) {
        this.raceID = raceID;
		this.registrationDate = registrationDate;
		this.racersParticipating = racersParticipating;
		this.maxParticipants = maxParticipants;
		this.requiredCAT = requiredCAT;
	}

    //Adds a racer to a given race registration
    private void addRacer(RaceRegistration raceRegistration, Racers racer){
        ArrayList<Racers> newParticipation = raceRegistration.getRacersParticipating();
        newParticipation.add(racer);
        raceRegistration.setRacersParticipating(newParticipation);
    }
	
	//Getters and setters
    public int getRaceID(){return raceID;}
	public String getRegistrationDate() {return registrationDate;}
	public ArrayList<Racers> getRacersParticipating(){return racersParticipating;}
	public int getMaxParticipants() {return maxParticipants;}
	public CAT getRequiredCAT() {return requiredCAT;}
    public void setRaceID(int raceID){this.raceID = raceID;}
	public void setRegistrationDate(String registrationDate) {this.registrationDate = registrationDate;}
	public void setRacersParticipating(ArrayList<Racers> racersParticipating) {this.racersParticipating = racersParticipating;}
	public void setMaxParticipants(int maxParticipants) {this.maxParticipants = maxParticipants;}
	public void setRequiredCAT(CAT requiredCAT) {this.requiredCAT = requiredCAT;}
}




