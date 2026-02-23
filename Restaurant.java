public class Restaurant {

    // Properties
    private String restaurantName;
    private int waitTime;
    private double rating;
    private double avgPrice;
    private double distance;
    private String hoursOpen;

    // Constructor

    public Restaurant() {}

    public Restaurant(String restaurantName, int waitTime, double rating, double avgPrice, double distance, String hoursOpen) {
        this.restaurantName = restaurantName;
        this.waitTime = waitTime;
        this.rating = rating;
        this.avgPrice = avgPrice;
        this.distance = distance;
        this.hoursOpen = hoursOpen;


    }

    //Getters & Setters
    // Accessors & Mutators

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getHoursOpen() {
        return hoursOpen;
    }

    public void setHoursOpen(String hoursOpen) {
        this.hoursOpen = hoursOpen;
    }

    public String toString(){
        return "Restaurant Name: " + restaurantName +
                "\nWait time in minuets: " + waitTime +
                "\nRating: " + rating +
                "\nAverage Price: $" + avgPrice +
                "\nDistance: " + distance + "mi." +
                "\nHours of Operations: " + hoursOpen;

    }

}
