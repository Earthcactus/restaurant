import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Instantiate an ArrayList to hold Restaurant Objects
        ArrayList<Restaurant> restaurantList = new ArrayList<>();

        // Take user input using JOptionPane and store variables
        String restaurantName = JOptionPane.showInputDialog("What would you like to name your Restaurant? ");
        int waitTime = Integer.parseInt(JOptionPane.showInputDialog("Enter Restaurant Wait Time in Minutes: "));
        double rating = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant Rating (0.0 - 5.0): "));
        double avgPrice = Double.parseDouble(JOptionPane.showInputDialog("What is the Average Price of your Restaurant? (Ex. 12.50) "));
        double distance = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant Distance In Miles (Ex. 6.7): "));
        String hoursOpen = JOptionPane.showInputDialog("Enter the Hours of Operation (Ex. 6:00am - 9:00pm): ");


        // Instantiate Restaurant object with those variables
        Restaurant userRestaurant = new Restaurant(restaurantName, waitTime, rating, avgPrice, distance, hoursOpen);
        System.out.println(userRestaurant);

        // Add User's Restaurant object to the ArrayList
        restaurantList.add(userRestaurant);

    }
}