package SER315_GroupProject;

import java.util.ArrayList;

public class User implements IUser {

    private final int id;
    private String name;
    private Role role;

    protected User(int id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
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
