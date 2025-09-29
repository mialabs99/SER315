
import java.util.ArrayList;

//class that holds race information.
public class Race {
	
	//race attributes
	private String raceName;
	private String raceDate;
	private int numMiles;
	private String raceRoute;
	private ArrayList<String> stages;
	private Boolean isOfficial;
	
	//race constructor
	public Race(String raceName, String raceDate, int numMiles, String raceRoute, ArrayList<String> stages,
			Boolean isOfficial) {
		this.raceName = raceName;
		this.numMiles = numMiles;
		this.raceRoute = raceRoute;
		this.stages = stages;
		this.isOfficial = isOfficial;
	}
	
	//getters and setters
	public String getRaceName() {
		return raceName;
	}
	public String getRaceDate() {
		return raceDate;
	}
	public int getNumMiles() {
		return numMiles;
	}
	public String getRaceRoute() {
		return raceRoute;
	}
	public ArrayList<String> getStages() {
		return stages;
	}
	public Boolean getIsOfficial() {
		return isOfficial;
	}
	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}
	public void setRaceDate(String raceDate) {
		this.raceDate = raceDate;
	}
	public void setNumMiles(int numMiles) {
		this.numMiles = numMiles;
	}
	public void setRaceRoute(String raceRoute) {
		this.raceRoute = raceRoute;
	}
	public void setStages(ArrayList<String> stages) {
		this.stages = stages;
	}
	public void setIsOfficial(Boolean isOfficial) {
		this.isOfficial = isOfficial;
	}
}



