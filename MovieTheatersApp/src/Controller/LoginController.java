package Controller;

import Model.User;
import View.AdminGUI;
import View.LoginGUI;
import View.UserGUI;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LoginController {
    
    private LoginGUI loginGUI;
    private ArrayList<User> userList;

    public LoginController(LoginGUI loginGUI) {
        this.loginGUI = loginGUI;
        this.userList = initializeList();
    }
    
    public void login(JTextField textField, JPasswordField passwordField) {
        String username = textField.getText();
        String password = new String(passwordField.getPassword());
        
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        
        if (username.equals("admin") && password.equals("password")) {
            AdminGUI adminGUI = new AdminGUI();
            loginGUI.setVisible(false);
            adminGUI.start();
            //return;
        } else {
            for (User user : userList) {
                String name = user.getUsername();
                String ps = user.getPassword();
                if (username.equals(name) && password.equals(ps)) {
                    UserGUI userGUI = new UserGUI(name);
                    loginGUI.setVisible(false);
                    userGUI.start();
                    return;
                }
            }
        }
        
        // pop up window that says username and password does not exist

    }
    
    public void reset(JTextField textField, JPasswordField passwordField) {
        textField.setText("");
        passwordField.setText("");
    }
    
    public void exit() {
        System.exit(0);
    }
    
    private ArrayList<User> initializeList() {
        ArrayList<User> list = new ArrayList<User>();
        list.add(new User("bobs", "burgers"));
        list.add(new User("movie", "app"));
        list.add(new User("poland", "spring"));
        return list;
    }
    
}
