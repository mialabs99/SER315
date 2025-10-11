package SER315_GroupProject;

import java.util.ArrayList;

//Class that holds the information for a racer's license.
public class License {

    private static ArrayList<License> allLicenses;

    //License attributes
    private String purchaseDate;
    private String expiryDate;
    private String ownerName;
    private CAT currentCAT;

    //License constructor
    public License(String purchaseDate, String expiryDate, String ownerName, CAT currentCAT) {
        this.purchaseDate = purchaseDate;
        this.expiryDate = expiryDate;
        this.ownerName = ownerName;
        this.currentCAT = currentCAT;
    }

    public static int findLicense(String ownerName){
        for(int i = 0; i < allLicenses.size(); i++){
            if(allLicenses.get(i).getOwnerName().equalsIgnoreCase(ownerName)){
                return i;
            }
        }
        return -1;
    }

    //Adds a license to the arraylist
    public static void addLicense(License license){
        allLicenses.add(license);
    }

    //Removes a license from the arraylist
    public static void removeLicense(int index){
        allLicenses.remove(index);
    }

    //Getters and setters
    public String getPurchaseDate() {return purchaseDate;}
    public String getExpiryDate() {return expiryDate;}
    public String getOwnerName() {return ownerName;}
    public CAT getCurrentCAT() {return currentCAT;}
}



