import java.util.ArrayList;

/**
 * simple demonstration of factory and observer patterns
 */
public class PatternDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Design Pattern Demonstration ===\n");
        
        // Create observers
        ContactInfo adminContact = new ContactInfo("555-0001", "Admin St", "admin@racing.com");
        Administrators admin = new Administrators(1, "John Admin", adminContact);
        
        ContactInfo organizerContact = new ContactInfo("555-0002", "Organizer Ave", "organizer@racing.com");
        Organizers organizer = new Organizers(1, "Jane Organizer", organizerContact);
        
        ContactInfo racerContact = new ContactInfo("555-0003", "Racer Blvd", "racer@racing.com");
        CAT racerCAT = new CAT(0, CAT.Categories.three);
        License racerLicense = new License("2024-01-01", "2024-12-31", "Bob Racer", racerCAT);
        Racers racer = new Racers(1, "Bob Racer", racerCAT, racerContact, 
                                 new ArrayList<Race>(), new ArrayList<Race>(), racerLicense);
        
        // Create subject for observer pattern
        RaceSubject raceSubject = new RaceSubject();
        raceSubject.addObserver(admin);
        raceSubject.addObserver(organizer);
        raceSubject.addObserver(racer);
        
        System.out.println("1. FACTORY PATTERN DEMONSTRATION");
        System.out.println("==================================");
        
        // Create race stages
        ArrayList<String> stages = new ArrayList<>();
        stages.add("Stage 1: Sprint");
        stages.add("Stage 2: Climb");
        stages.add("Stage 3: Descent");
        
        // Use Factory Pattern to create different types of races
        Race officialRace = RaceFactory.createRace("official", "Tour de France", "2024-07-01", 
                                                  100, "France Route", stages);
        Race unofficialRace = RaceFactory.createRace("unofficial", "Local Fun Race", "2024-06-15", 
                                                    25, "Local Park", new ArrayList<String>());
        
        System.out.println("Created Official Race: " + officialRace.getRaceName() + 
                          " (Official: " + officialRace.getIsOfficial() + ")");
        System.out.println("Created Unofficial Race: " + unofficialRace.getRaceName() + 
                          " (Official: " + unofficialRace.getIsOfficial() + ")");
        
        // Demonstrate error handling in Factory Pattern
        try {
            Race invalidRace = RaceFactory.createRace("invalid", "Invalid Race", "2024-01-01", 0, "Nowhere", new ArrayList<String>());
        } catch (IllegalArgumentException e) {
            System.out.println("Factory Pattern Error Handling: " + e.getMessage());
        }
        
        System.out.println("\n2. OBSERVER PATTERN DEMONSTRATION");
        System.out.println("==================================");
        
        // Notify observers about race creation
        System.out.println("\nNotifying observers about race creation:");
        raceSubject.notifyRaceCreated(officialRace);
        
        System.out.println("\nNotifying observers about race updates:");
        raceSubject.notifyRaceUpdated(officialRace);
        
        System.out.println("\nNotifying observers about racer registration:");
        raceSubject.notifyRacerRegistered(officialRace, racer);
        
        // Create and publish race results
        ArrayList<Racers> raceResults = new ArrayList<>();
        raceResults.add(racer);
        RaceResults results = new RaceResults(raceResults);
        
        System.out.println("\nNotifying observers about race results:");
        raceSubject.notifyRaceResultsPublished(officialRace, results);
        
        System.out.println("\n3. INTEGRATED PATTERN DEMONSTRATION");
        System.out.println("====================================");
        
        // Show how Organizers can use Factory Pattern
        System.out.println("\nOrganizer creating races using Factory Pattern:");
        Race organizerCreatedRace = organizer.createRace("official", "Organizer's Championship", 
                                                       "2024-08-01", 50, "Championship Route", stages);
        
        // Notify about the organizer-created race
        raceSubject.notifyRaceCreated(organizerCreatedRace);
        
        System.out.println("\n=== Design Pattern Demonstration Complete ===");
    }
}
