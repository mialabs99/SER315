import java.util.ArrayList;

/**
 * factory pattern implementation
 * creates different types of races based on the race type
 */
public class RaceFactory {
    
    /**
     * creates a race based on the specified type
     * @param raceType The type of race to create ("official" or "unofficial")
     * @param raceName Name of the race
     * @param raceDate Date of the race
     * @param numMiles Number of miles
     * @param raceRoute Route of the race
     * @param stages List of race stages
     * @return The appropriate Race object
     */
    public static Race createRace(String raceType, String raceName, String raceDate, 
                                 int numMiles, String raceRoute, ArrayList<String> stages) {
        
        if (raceType == null) {
            throw new IllegalArgumentException("Race type cannot be null");
        }
        
        switch (raceType.toLowerCase()) {
            case "official":
                return new OfficialRace(raceName, raceDate, numMiles, raceRoute, stages, true);
            case "unofficial":
                return new UnofficialRace(raceName, raceDate, numMiles, raceRoute, stages, false);
            default:
                throw new IllegalArgumentException("Invalid race type: " + raceType + 
                    ". Must be 'official' or 'unofficial'");
        }
    }
    
    /**
     * creates a race with default parameters
     * @param raceType The type of race to create
     * @param raceName Name of the race
     * @return The appropriate Race object
     */
    public static Race createRace(String raceType, String raceName) {
        return createRace(raceType, raceName, "TBD", 0, "TBD", new ArrayList<String>());
    }
}
