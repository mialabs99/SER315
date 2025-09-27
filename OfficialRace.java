package SER315_GroupProject;

import java.util.ArrayList;

public class OfficialRace {
	
	//ArrayList that holds the results of each official race
	ArrayList<RaceResults> results;
	
	//OfficialRace constructor
	public OfficialRace(ArrayList<RaceResults> results) {
		this.results = results;
	}
	
	//Add new results to an official race
	public void addResults(RaceResults newResults) {
		results.add(newResults);
	}
	
	public RaceResults getOfficialRaceResults(int raceID) {
		return results.get(raceID);
	}
}
