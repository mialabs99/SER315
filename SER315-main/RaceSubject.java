package SER315_GroupProject;

public interface RaceSubject {
    void addObserver(RaceObserver observer);
    void removeObserver(RaceObserver observer);
    void notifyObservers();
}
