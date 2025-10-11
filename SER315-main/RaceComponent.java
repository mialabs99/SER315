//file 4: racecomponent.java (new - composite pattern base)

import java.util.ArrayList;
import java.util.List;

//base component for composite pattern
public abstract class RaceComponent {
    protected String name;
    
    public RaceComponent(String name) {
        this.name = name;
    }
    
    public abstract void displayInfo();
    public abstract void add(RaceComponent component);
    public abstract void remove(RaceComponent component);
    public abstract RaceComponent getChild(int index);
    public String getName() { return name; }
}