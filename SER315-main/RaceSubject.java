import java.util.ArrayList;
import java.util.List;

/**
 * observer pattern implementation
 * subject class that manages observers and notifies them of race events
 */
public class RaceSubject {
    
    private List<RaceObserver> observers;
    
    public RaceSubject() {
        this.observers = new ArrayList<>();
    }
    
    /**
     * adds an observer to the notification list
     * @param observer The observer to add
     */
    public void addObserver(RaceObserver observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }
    
    /**
     * removes an observer from the notification list
     * @param observer The observer to remove
     */
    public void removeObserver(RaceObserver observer) {
        observers.remove(observer);
    }
    
    /**
     * notifies all observers that a race was created
     * @param race The race that was created
     */
    public void notifyRaceCreated(Race race) {
        for (RaceObserver observer : observers) {
            observer.onRaceCreated(race);
        }
    }
    
    /**
     * notifies all observers that a race was updated
     * @param race The race that was updated
     */
    public void notifyRaceUpdated(Race race) {
        for (RaceObserver observer : observers) {
            observer.onRaceUpdated(race);
        }
    }
    
    /**
     * notifies all observers that race results were published
     * @param race The race with results
     * @param results The race results
     */
    public void notifyRaceResultsPublished(Race race, RaceResults results) {
        for (RaceObserver observer : observers) {
            observer.onRaceResultsPublished(race, results);
        }
    }
    
    /**
     * notifies all observers that a racer registered for a race
     * @param race The race being registered for
     * @param racer The racer registering
     */
    public void notifyRacerRegistered(Race race, Racers racer) {
        for (RaceObserver observer : observers) {
            observer.onRacerRegistered(race, racer);
        }
    }
}
