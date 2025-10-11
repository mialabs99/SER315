package SER315_GroupProject;

import java.util.ArrayList;

public class User implements IUser {

    private final int id;
    private String name;
    private Role role;
    private ArrayList<User> allUsers;

    protected User(int id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
    
    public User findUser(int userID){
        for(int i = 0; i < allUsers.size(); i++){
            if(allUsers.get(i).getId() == userID){
                return allUsers.get(i);
            }
        }
        System.out.println("Sorry, the user could not be found. Please try again.");
        return null;
    }
    
    @Override public int getId()   {
        return id;
    }
    @Override public String getName() { return name; }
    @Override public Role getRole()   { return role; }

    @Override
    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
