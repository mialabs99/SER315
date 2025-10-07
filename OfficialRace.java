package SER315_GroupProject;

import java.util.ArrayList;

//Class that holds the information of the official races.
public class OfficialRace extends Race{

    //ArrayList that holds all Official Races
    private ArrayList<Race> allOfficialRaces;
	
	//ArrayList that holds the results of each official race
	private ArrayList<RaceResults> results;
	
	//OfficialRace constructor
	public OfficialRace(String raceName, String raceDate, int numMiles, String raceRoute, ArrayList<String> stages,
			Boolean isOfficial) {
		super(raceName, raceDate, numMiles, raceRoute, stages, true);
		this.results = new ArrayList<>();
	}

    //Adds an official race to the ArrayList allOfficialRaces
    private void addOfficialRace(Race officialRace){
        allOfficialRaces.add(officialRace);
    }

    //Removes an official race from the ArrayList allOfficialRaces
    private void removeOfficialRace(Race officialRace){
        allOfficialRaces.remove(officialRace);
    }
	
	//Add new results to an official race
	public void addResults(RaceResults newResults) {
		results.add(newResults);
	}

	//Gets the results of an official race
	public RaceResults getOfficialRaceResults(int raceID) {
		return results.get(raceID);
	}

    //Getters and setters
    public ArrayList<Race> getAllOfficialRaces(){return allOfficialRaces;}
    public void setAllOfficialRaces(ArrayList<Race> allOfficialRaces){this.allOfficialRaces = allOfficialRaces;}
}

