package SER315_GroupProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Abstract class that holds race information.
public abstract class Race implements RaceSubject {

    // ArrayList holding all races
    private static ArrayList<Race> allRaces = new ArrayList<>();

    // Observer pattern implementation
    private List<RaceObserver> observers = new ArrayList<>();

    // Race attributes
    private String raceName;
    private String raceDate;
    private int numMiles;
    private String raceRoute;
    private ArrayList<String> stages;
    private RaceType raceType;

    // Common results functionality moved from concrete classes
    protected ArrayList<RaceResults> results;

    // Race constructor
    public Race(String raceName, String raceDate, int numMiles, String raceRoute,
                ArrayList<String> stages, RaceType raceType) {
        this.raceName = raceName;
        this.raceDate = raceDate;
        this.numMiles = numMiles;
        this.raceRoute = raceRoute;
        this.stages = stages;
        this.raceType = raceType;
        this.results = new ArrayList<>();
    }

    // Adds a race to the allRaces ArrayList
    private void addRace(Race newRace) {
        allRaces.add(newRace);
    }

    // Observer pattern methods
    @Override
    public void addObserver(RaceObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(RaceObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (RaceObserver observer : observers) {
            try {
                observer.update(this);
            } catch (RuntimeException ex) {
                // log and continue; replace with real logger if available
                System.err.println("Observer update failed: " + ex.getMessage());
            }
        }
    }

    // Centralized notifier for state changes
    private void changed() {
        notifyObservers();
    }

    // Method to trigger state change and notify observers
    public void updateRaceState() {
        changed();
    }

    // Common results methods moved from concrete classes
    public void addResults(RaceResults newResults) {
        results.add(newResults);
        // Notify observers when results are added
        changed();
    }

    public RaceResults getRaceResults(int raceID) {
        if (raceID < results.size()) {
            return results.get(raceID);
        }
        return null;
    }

    public boolean hasResults() {
        return results != null && !results.isEmpty();
    }

    // Getters and setters
    public String getRaceName() { return raceName; }
    public String getRaceDate() { return raceDate; }
    public int getNumMiles() { return numMiles; }
    public String getRaceRoute() { return raceRoute; }
    public ArrayList<String> getStages() { return stages; }
    public RaceType getRaceType() { return raceType; }

    public static ArrayList<Race> getAllRaces() { return allRaces; }

    // Read-only version to prevent external modification
    public static List<Race> getAllRacesReadOnly() {
        return Collections.unmodifiableList(allRaces);
    }

    public void setRaceName(String raceName) { this.raceName = raceName; }
    public void setRaceDate(String raceDate) { this.raceDate = raceDate; }
    public void setNumMiles(int numMiles) { this.numMiles = numMiles; }
    public void setRaceRoute(String raceRoute) { this.raceRoute = raceRoute; }
    public void setStages(ArrayList<String> stages) { this.stages = stages; }
    public void setRaceType(RaceType raceType) { this.raceType = raceType; }
}
