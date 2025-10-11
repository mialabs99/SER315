package SER315_GroupProject;

import java.util.ArrayList;

public class UnofficialRaceFactory extends RaceFactory {
    @Override
    public Race createRace(String raceName, String raceDate, int numMiles, 
                          String raceRoute, ArrayList<String> stages) {
        return new UnofficialRace(raceName, raceDate, numMiles, raceRoute, stages);
    }
}
