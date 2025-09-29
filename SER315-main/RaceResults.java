
import java.util.ArrayList;

//class that holds the race results of each race.
public class RaceResults {
	
	//raceresults attributes
	private ArrayList<Racers> raceResults;
	
	//raceresults constructor
	public RaceResults(ArrayList<Racers> raceResults) {
		this.raceResults = raceResults;
	}
	
	//adds results of a completed race to a racer's profile
	public void addRaceToProfile() {
		
	}
	
	//getter and setter
	public ArrayList<Racers> getRaceResults() {
		return raceResults;
	}
	public void setRaceResults(ArrayList<Racers> raceResults) {
		this.raceResults = raceResults;
	}
}

