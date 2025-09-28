package SER315_GroupProject;

import java.util.ArrayList;

public class RaceRegistration {
	
	//RaceRegistration attributes
	private String registrationDate;
	private ArrayList<Racers> racersParticipating;
	private int maxParticipants;
	private CAT requiredCAT;
	
	//RaceRegistration constructor
	public RaceRegistration(String registrationDate, ArrayList<Racers> racersParticipating, 
			int maxParticipants, CAT requiredCAT) {
		this.registrationDate = registrationDate;
		this.racersParticipating = racersParticipating;
		this.maxParticipants = maxParticipants;
		this.requiredCAT = requiredCAT;
	}
	
	//Getters and setters
	public String getRegistrationDate() {
		return registrationDate;
	}
	public ArrayList<Racers> getRacersParticipating(){
		return racersParticipating;
	}
	public int getMaxParticipants() {
		return maxParticipants;
	}
	public CAT getRequiredCAT() {
		return requiredCAT;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public void setRacersParticipating(ArrayList<Racers> racersParticipating) {
		this.racersParticipating = racersParticipating;
	}
	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}
	public void setRequiredCAT(CAT requiredCAT) {
		this.requiredCAT = requiredCAT;
	}
}
