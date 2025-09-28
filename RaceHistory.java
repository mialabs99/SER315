package SER315_GroupProject;

import java.util.ArrayList;

public class RaceHistory {
	
	//RaceHistory attribute
	private ArrayList<Race> raceHistory;
	
	//RaceHistory constructor
	public RaceHistory(ArrayList<Race> raceHistory) {
		this.raceHistory = raceHistory;
	}
	
	//Getter and setter
	public ArrayList<Race> getRaceHistory() {
		return raceHistory;
	}
	public void setRaceHistory(ArrayList<Race> raceHistory) {
		this.raceHistory = raceHistory;
	}
}
