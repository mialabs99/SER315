package SER315_GroupProject;

//Class that holds the information for the racers' categories.
public class CAT {

    //Enumeration for the different categories
    public enum Categories{
        one, two, three, four, five
    }

    //CAT attributes
    private int levelUpStatus;
    private Categories currentCAT;

    //CAT constructor
    public CAT(int levelUpStatus, Categories currentCAT) {
        this.levelUpStatus = levelUpStatus;
        this.currentCAT = currentCAT;
    }

    //Getters and setters
    public int getLevelUpStatus() {
        return levelUpStatus;
    }
    public Categories getCurrentCAT() {
        return currentCAT;
    }
    public void setLevelUpStatus(int levelUpStatus) {
        this.levelUpStatus = levelUpStatus;
    }
    public void setCurrentCAT(Categories currentCAT) {
        this.currentCAT = currentCAT;
    }

}



