package SER315_GroupProject;

import java.util.ArrayList;

public abstract class RaceFactory {
    public abstract Race createRace(String raceName, String raceDate, int numMiles, 
                                   String raceRoute, ArrayList<String> stages);
}
