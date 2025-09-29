
/**
 * observer pattern implementation
 * interface for objects that need to be notified of race events
 */
public interface RaceObserver {
    
    /**
     * called when a race is created
     * @param race The race that was created
     */
    void onRaceCreated(Race race);
    
    /**
     * called when a race is updated
     * @param race The race that was updated
     */
    void onRaceUpdated(Race race);
    
    /**
     * called when race results are published
     * @param race The race with results
     * @param results The race results
     */
    void onRaceResultsPublished(Race race, RaceResults results);
    
    /**
     * called when a racer registers for a race
     * @param race The race being registered for
     * @param racer The racer registering
     */
    void onRacerRegistered(Race race, Racers racer);
}
