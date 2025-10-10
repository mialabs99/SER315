package SER315_GroupProject;

import java.util.ArrayList;

public class OfficialRaceFactory extends RaceFactory {
    @Override
    public Race createRace(String raceName, String raceDate, int numMiles, 
                          String raceRoute, ArrayList<String> stages) {
        return new OfficialRace(raceName, raceDate, numMiles, raceRoute, stages);
    }
}
