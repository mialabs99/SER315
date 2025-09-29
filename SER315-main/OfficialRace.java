
import java.util.ArrayList;

//class that holds the information of the official races.
public class OfficialRace extends Race{
	
	//arraylist that holds the results of each official race
	private ArrayList<RaceResults> results;
	
	//officialrace constructor
	public OfficialRace(String raceName, String raceDate, int numMiles, String raceRoute, ArrayList<String> stages,
			Boolean isOfficial) {
		super(raceName, raceDate, numMiles, raceRoute, stages, true);
		this.results = new ArrayList<>();
	}
	
	//add new results to an official race
	public void addResults(RaceResults newResults) {
		results.add(newResults);
	}
	
	public RaceResults getOfficialRaceResults(int raceID) {
		return results.get(raceID);
	}
}
