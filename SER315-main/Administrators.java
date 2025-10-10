package SER315_GroupProject;

import java.util.ArrayList;

//Class that holds administrator information.
public class Administrators extends User {

    //ArrayList holding all Administrators currently signed up for the program
    private ArrayList<User> allAdministrators;

    //Administrator attributes
    private ContactInfo contactInfo;

    //Administrator constructor
    public Administrators(int adminID, String name, ContactInfo contactInfo){
        super(adminID, name, Role.ADMIN);
        this.contactInfo = contactInfo;
    }

    //Adds a new Administrator to the ArrayList allAdministrators
    private void addAdministrator(User administrator){
        allAdministrators.add(administrator);
    }

    //Removes an Administrator from the ArrayList allAdministrators
    private void removeAdministrator(User administrator){
        allAdministrators.remove(administrator);
    }

    //Selects a user account to manage
    public void ManageUserAccounts(int id, String managementChoice) {

    }

    //Selects a license to manage
    public void ManageLicenses() {

    }

    //Selects a setting to manage
    public void ManageSystemSettings() {

    }

    //Getters and setters
    public ContactInfo getContactInfo() {return contactInfo;}
    public ArrayList<User> getAllAdministrators(){return allAdministrators;}
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
    public void setAllAdministrators(ArrayList<User> allAdministrators){this.allAdministrators = allAdministrators;}
}




