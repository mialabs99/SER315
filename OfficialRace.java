package SER315_GroupProject;

import java.util.ArrayList;

public class OfficialRace extends Race{
	
	//ArrayList that holds the results of each official race
	private ArrayList<RaceResults> results;
	
	//OfficialRace constructor
	public OfficialRace(String raceName, String raceDate, int numMiles, String raceRoute, ArrayList<String> stages,
			Boolean isOfficial) {
		super(raceName, raceDate, numMiles, raceRoute, stages, true);
		this.results = new ArrayList<>();
	}
	
	//Add new results to an official race
	public void addResults(RaceResults newResults) {
		results.add(newResults);
	}
	
	public RaceResults getOfficialRaceResults(int raceID) {
		return results.get(raceID);
	}
}
