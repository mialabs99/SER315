package SER315_GroupProject;

import java.util.ArrayList;

public class PatternDemo {
    public static void main(String[] args) {
        // Demonstrate Factory Pattern
        RaceFactory officialFactory = new OfficialRaceFactory();
        RaceFactory unofficialFactory = new UnofficialRaceFactory();
        
        // Create races using factories
        ArrayList<String> stages = new ArrayList<>();
        stages.add("Stage 1");
        stages.add("Stage 2");
        
        Race officialRace = officialFactory.createRace("Marathon 2024", "2024-06-15", 26, "City Route", stages);
        Race unofficialRace = unofficialFactory.createRace("Fun Run", "2024-07-20", 5, "Park Route", stages);
        
        // Demonstrate Observer Pattern
        RaceObserver resultsObserver = new RaceResultsObserver("Results Manager");
        RaceObserver notificationObserver = new RaceResultsObserver("Notification Service");
        
        // Add observers to races
        officialRace.addObserver(resultsObserver);
        officialRace.addObserver(notificationObserver);
        unofficialRace.addObserver(resultsObserver);
        
        // Trigger state changes and notify observers
        System.out.println("=== Observer Pattern Demo ===");
        officialRace.updateRaceState();
        unofficialRace.updateRaceState();
        
        // Demonstrate observer pattern with results
        System.out.println("\n=== Adding Results Demo ===");
        ArrayList<Racers> raceResults = new ArrayList<>(); // Empty for demo
        RaceResults results = new RaceResults(raceResults);
        officialRace.addResults(results); // This will trigger observer notifications
        
        System.out.println("\n=== Factory Pattern Demo ===");
        System.out.println("Created " + officialRace.getRaceType() + " race: " + officialRace.getRaceName());
        System.out.println("Created " + unofficialRace.getRaceType() + " race: " + unofficialRace.getRaceName());
    }
}
