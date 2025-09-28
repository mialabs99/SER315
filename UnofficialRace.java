package SER315_GroupProject;

import java.util.ArrayList;

//Class that holds the information of the unofficial races
public class UnofficialRace extends Race{
	//ArrayList that holds the results of each official race
	private ArrayList<RaceResults> results;
	
	//OfficialRace constructor
	public UnofficialRace(String raceName, String raceDate, int numMiles, String raceRoute, ArrayList<String> stages,
			Boolean isOfficial) {
		super(raceName, raceDate, numMiles, raceRoute, stages, false);
		this.results = new ArrayList<>();
	}
	
	//Add new results to an official race
	public void addResults(RaceResults newResults) {
		results.add(newResults);
	}
	
	public RaceResults getUnofficialRaceResults(int raceID) {
		return results.get(raceID);
	}
}

