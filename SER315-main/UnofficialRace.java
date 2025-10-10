package SER315_GroupProject;

import java.util.ArrayList;

//Class that holds the information of the unofficial races
public class UnofficialRace extends Race{

    //ArrayList that holds all Unofficial Races
    private ArrayList<Race> allUnofficialRaces;
	
	//UnofficialRace constructor
	public UnofficialRace(String raceName, String raceDate, int numMiles, String raceRoute, ArrayList<String> stages) {
		super(raceName, raceDate, numMiles, raceRoute, stages, RaceType.UNOFFICIAL);
	}

    //Adds an unofficial race to the ArrayList allUnofficialRaces
    private void addUnofficialRace(Race unofficialRace){
        allUnofficialRaces.add(unofficialRace);
    }

    //Removes an unofficial race from the ArrayList allUnofficialRaces
    private void removeUnofficialRace(Race unofficialRace){
        allUnofficialRaces.remove(unofficialRace);
    }
	
	//Unofficial race specific methods can be added here if needed
	//Common results methods are now inherited from Race class

    //Getters and setters
    public ArrayList<Race> getAllUnofficialRaces(){return allUnofficialRaces;}
    public void setAllUnofficialRaces(ArrayList<Race> allUnofficialRaces){this.allUnofficialRaces = allUnofficialRaces;}
}


