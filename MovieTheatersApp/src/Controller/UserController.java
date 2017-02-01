package Controller;

import View.LoginGUI;
import View.MovieSeatsGUI;
import View.UserGUI;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class UserController {
    
    private UserGUI userGUI;
    private double totalPrice;
    private DecimalFormat df;
    
    private JComboBox<String> adultCount;
    private JComboBox<String> childCount;
    private JComboBox<String> seniorCount;
    private JComboBox<String> studentCount;
    private JComboBox<String> militaryCount;
    
    private int adultPrevious = 0;
    private int childPrevious = 0;
    private int seniorPrevious = 0;
    private int studentPrevious = 0;
    private int militaryPrevious = 0;
    
    private final double adultPrice = 10.69;
    private final double childPrice = 7.39;
    private final double seniorPrice = 8.89;
    private final double studentPrice = 8.89;
    private final double militaryPrice = 9.89;
    
    public UserController(UserGUI userGUI) {
        this.userGUI = userGUI;
        this.totalPrice = 0;
        
        adultCount = userGUI.getAdultQuantity();
        childCount = userGUI.getChildQuantity();
        seniorCount = userGUI.getSeniorQuantity();
        studentCount = userGUI.getStudentQuantity();
        militaryCount = userGUI.getMilitaryQuantity();

        df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.CEILING);
    }
    
    public void calculateAdultPrice() {
        int quantity = Integer.parseInt((String) adultCount.getSelectedItem());
        
        if (quantity == adultPrevious) {
            return;
        }
        
        int tickets = quantity - adultPrevious;
        adultPrevious = quantity;
        totalPrice += adultPrice * tickets;
        
        double price = adultPrice * quantity;        
        JLabel adultLabel = userGUI.getAdultLabel();
        adultLabel.setText("$" + df.format(price));
        calculateTotalPrice(); 
    }
    
    public void calculateChildPrice() {
        int quantity = Integer.parseInt((String) childCount.getSelectedItem());
        
        if (quantity == childPrevious) {
            return;
        }
        
        int tickets = quantity - childPrevious;
        childPrevious = quantity;        
        totalPrice += childPrice * tickets;
        
        double price = childPrice * quantity;
        JLabel childLabel = userGUI.getChildLabel();
        childLabel.setText("$" + df.format(price));
        calculateTotalPrice();
    }
    
    public void calculateSeniorPrice() {
        int quantity = Integer.parseInt((String) seniorCount.getSelectedItem());
        
        if (quantity == seniorPrevious) {
            return;
        }
        
        int tickets = quantity - seniorPrevious;
        seniorPrevious = quantity;
        totalPrice += seniorPrice * tickets;
                
        double price = seniorPrice * quantity;
        JLabel seniorLabel = userGUI.getSeniorLabel();
        seniorLabel.setText("$" + df.format(price));
        calculateTotalPrice();   
    }
    
    public void calculateMilitaryPrice() {
        int quantity = Integer.parseInt((String) militaryCount.getSelectedItem());
        
        if (quantity == militaryPrevious) {
            return;
        }
        
        int tickets = quantity - militaryPrevious;
        militaryPrevious = quantity;
        totalPrice += militaryPrice * tickets;
                
        double price = militaryPrice * quantity;
        JLabel militaryLabel = userGUI.getMilitaryLabel();
        militaryLabel.setText("$" + df.format(price));
        calculateTotalPrice();       
    }
    
    public void calculateStudentPrice() {
        int quantity = Integer.parseInt((String) studentCount.getSelectedItem());
        
        if (quantity == studentPrevious) {
            return;
        }
        
        int tickets = quantity - studentPrevious;
        studentPrevious = quantity;
        totalPrice += studentPrice * tickets;
                
        double price = studentPrice * quantity;
        JLabel studentLabel = userGUI.getStudentLabel();
        studentLabel.setText("$" + df.format(price));
        calculateTotalPrice();      
    }
    
    public void calculateTotalPrice() {
        double tax = totalPrice * 0.07;
        System.out.println(tax);
        double totalPriceWithTax = totalPrice + tax;
        JLabel taxLabel = userGUI.getTaxLabel();
        taxLabel.setText("$" + df.format(Math.abs(tax)));
        JLabel totalPriceLabel = userGUI.getTotalPriceLabel();
        totalPriceLabel.setText("$" + df.format(Math.abs(totalPriceWithTax)));
    }
    
    public void next() {
        MovieSeatsGUI movieSeatsGUI = new MovieSeatsGUI();
        userGUI.setVisible(false);
        movieSeatsGUI.start();
    }
    
    public void logout() {
        LoginGUI loginGUI = new LoginGUI();
        loginGUI.setVisible(true);
        userGUI.setVisible(false);
    }
    
}
