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

    //Manages a user account
    public void ManageUserAccounts(int id, AccountManagement choice) {
        int index = User.findUser(id);
        if(choice == AccountManagement.DELETE && index != -1){
            User.removeUser(index);
        }
    }

    //Manages a license
    public void ManageLicenses(String ownerName, LicenseManagement choice) {
        int index = License.findLicense(ownerName);
        if(choice == LicenseManagement.DELETE && index != -1){
            License.removeLicense(index);
        }
    }

    //Manages system settings
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





