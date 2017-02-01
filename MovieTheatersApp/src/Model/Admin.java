package Model;

import java.util.ArrayList;

public class Admin {
    
    private final ArrayList<User> cashiers;
    
    /* Singleton */
    
    private static final Admin instance = new Admin();
    
    private Admin() {
        cashiers = new ArrayList<User>();
    }
    
    public static Admin getInstance() {
        return instance;
    }
    
    /* End Singleton */
    
    public ArrayList<User> getUsers() {
        return cashiers;
    }

}
