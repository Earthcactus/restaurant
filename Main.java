import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        ArrayList<Restaurant> restaurants = new ArrayList<>();
        Random randal = new Random();
        File file = new File("src/restaurant.txt");
        Scanner scan = new Scanner(file);
        scan.useDelimiter(",");

        while (scan.hasNext()) {
            String name = scan.next();
            int waitTime = scan.nextInt();
            double rating = scan.nextDouble();
            double avgPrice = scan.nextDouble();
            double distance = scan.nextDouble();
            String hoursOpen = scan.next();

            Restaurant restaurant = new Restaurant(name, waitTime, rating, avgPrice, distance, hoursOpen);

            restaurants.add(restaurant);
        }

        int numRestaurants = restaurants.size();
        int randInt = randal.nextInt(numRestaurants - 1);
        System.out.println(restaurants.get(randInt));
    }
}