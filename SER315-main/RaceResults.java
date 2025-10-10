package SER315_GroupProject;

import java.util.ArrayList;

//Class that holds the race results of each race.
public class RaceResults {
	
	//RaceResults attributes
	private ArrayList<Racers> raceResults;
	
	//RaceResults constructor
	public RaceResults(ArrayList<Racers> raceResults) {
		this.raceResults = raceResults;
	}
	
	//Adds results of a completed race to a racer's profile
	public void addRaceToProfile() {
		
	}
	
	//Getter and setter
	public ArrayList<Racers> getRaceResults() {return raceResults;}
	public void setRaceResults(ArrayList<Racers> raceResults) {this.raceResults = raceResults;}
}

