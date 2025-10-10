package SER315_GroupProject;

public class RaceResultsObserver implements RaceObserver {
    private String observerName;
    
    public RaceResultsObserver(String observerName) {
        this.observerName = observerName;
    }
    
    @Override
    public void update(Race race) {
        // Observer interprets the race data internally to determine what action to take
        // This demonstrates the proper observer pattern with internal logic
        
        // Check if race has results (internal logic to determine state)
        boolean hasResults = race.hasResults();
        
        if (hasResults) {
            // Process completed race results
            System.out.println(observerName + " processing results for completed race: " + race.getRaceName());
            // Here you could update databases, send notifications, etc.
        } else if (race.getRaceType() == RaceType.OFFICIAL) {
            // Handle official race updates
            System.out.println(observerName + " notified: Official race '" + race.getRaceName() + "' has been updated");
            // Could trigger different logic for official vs unofficial races
        } else {
            // Handle unofficial race updates
            System.out.println(observerName + " notified: Unofficial race '" + race.getRaceName() + "' has been updated");
            // Could have different handling for unofficial races
        }
    }
}
