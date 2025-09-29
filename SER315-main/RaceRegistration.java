
import java.util.ArrayList;

//class that hold registration info for each race.
public class RaceRegistration {
	
	//raceregistration attributes
	private String registrationDate;
	private ArrayList<Racers> racersParticipating;
	private int maxParticipants;
	private CAT requiredCAT;
	
	//raceregistration constructor
	public RaceRegistration(String registrationDate, ArrayList<Racers> racersParticipating, 
			int maxParticipants, CAT requiredCAT) {
		this.registrationDate = registrationDate;
		this.racersParticipating = racersParticipating;
		this.maxParticipants = maxParticipants;
		this.requiredCAT = requiredCAT;
	}
	
	//getters and setters
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


