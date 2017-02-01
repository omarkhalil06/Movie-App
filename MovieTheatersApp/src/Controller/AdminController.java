package Controller;

import Model.Movie;
import View.AdminGUI;
import View.LoginGUI;
import java.util.ArrayList;
import javax.swing.JTable;

public class AdminController {
    
    private AdminGUI adminGUI;
    private JTable movieTable;
    private ArrayList<Movie> movieList;
    
    public AdminController(AdminGUI adminGUI) {
        this.adminGUI = adminGUI;
        this.movieTable = adminGUI.getMovieList();
    }
    
    public void add() {
        
    }
    
    public void edit() {
        
    }
    
    public void delete() {
        
    }
    
    public void logout() {
        LoginGUI loginGUI = new LoginGUI();
        // save movies later
        adminGUI.setVisible(false);
        loginGUI.setVisible(true);
    }
    
    public ArrayList<Movie> initializeMovieList() {
        ArrayList<Movie> list = new ArrayList<Movie>();
        
        return list;
    }
    
}
