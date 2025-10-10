package SER315_GroupProject;

import java.util.ArrayList;

//Class that holds the information of the official races.
public class OfficialRace extends Race{

    //ArrayList that holds all Official Races
    private ArrayList<Race> allOfficialRaces;
	
	//OfficialRace constructor
	public OfficialRace(String raceName, String raceDate, int numMiles, String raceRoute, ArrayList<String> stages) {
		super(raceName, raceDate, numMiles, raceRoute, stages, RaceType.OFFICIAL);
	}

    //Adds an official race to the ArrayList allOfficialRaces
    private void addOfficialRace(Race officialRace){
        allOfficialRaces.add(officialRace);
    }

    //Removes an official race from the ArrayList allOfficialRaces
    private void removeOfficialRace(Race officialRace){
        allOfficialRaces.remove(officialRace);
    }
	
	//Official race specific methods can be added here if needed
	//Common results methods are now inherited from Race class

    //Getters and setters
    public ArrayList<Race> getAllOfficialRaces(){return allOfficialRaces;}
    public void setAllOfficialRaces(ArrayList<Race> allOfficialRaces){this.allOfficialRaces = allOfficialRaces;}
}

