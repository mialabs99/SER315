
import java.util.ArrayList;

//class that holds all of the past races.
public class RaceHistory {
	
	//racehistory attribute
	private ArrayList<Race> raceHistory;
	
	//racehistory constructor
	public RaceHistory(ArrayList<Race> raceHistory) {
		this.raceHistory = raceHistory;
	}
	
	//getter and setter
	public ArrayList<Race> getRaceHistory() {
		return raceHistory;
	}
	public void setRaceHistory(ArrayList<Race> raceHistory) {
		this.raceHistory = raceHistory;
	}
}


