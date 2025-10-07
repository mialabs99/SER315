package SER315_GroupProject;

import java.util.ArrayList;

//Class that holds the information of the unofficial races
public class UnofficialRace extends Race{

    //ArrayList that holds all Unofficial Races
    private ArrayList<Race> allUnofficialRaces;

	//ArrayList that holds the results of each official race
	private ArrayList<RaceResults> results;
	
	//OfficialRace constructor
	public UnofficialRace(String raceName, String raceDate, int numMiles, String raceRoute, ArrayList<String> stages,
			Boolean isOfficial) {
		super(raceName, raceDate, numMiles, raceRoute, stages, false);
		this.results = new ArrayList<>();
	}

    //Adds an unofficial race to the ArrayList allUnofficialRaces
    private void addUnofficialRace(Race unofficialRace){
        allUnofficialRaces.add(unofficialRace);
    }

    //Removes an unofficial race from the ArrayList allUnofficialRaces
    private void removeUnofficialRace(Race unofficialRace){
        allUnofficialRaces.remove(unofficialRace);
    }
	
	//Add new results to an official race
	public void addResults(RaceResults newResults) {
		results.add(newResults);
	}
	
	public RaceResults getUnofficialRaceResults(int raceID) {
		return results.get(raceID);
	}

    //Getters and setters
    public ArrayList<Race> getAllUnofficialRaces(){return allUnofficialRaces;}
    public void setAllUnofficialRaces(ArrayList<Race> allUnofficialRaces){this.allUnofficialRaces = allUnofficialRaces;}
}


