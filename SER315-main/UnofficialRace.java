
import java.util.ArrayList;

//class that holds the information of the unofficial races
public class UnofficialRace extends Race{
	//arraylist that holds the results of each official race
	private ArrayList<RaceResults> results;
	
	//unofficialrace constructor
	public UnofficialRace(String raceName, String raceDate, int numMiles, String raceRoute, ArrayList<String> stages,
			Boolean isOfficial) {
		super(raceName, raceDate, numMiles, raceRoute, stages, false);
		this.results = new ArrayList<>();
	}
	
	//add new results to an unofficial race
	public void addResults(RaceResults newResults) {
		results.add(newResults);
	}
	
	public RaceResults getUnofficialRaceResults(int raceID) {
		return results.get(raceID);
	}
}

