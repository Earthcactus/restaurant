public class Restaurant {
    // Properties
     int waitTime;
     double rating;
     double avgPrice;
     double dist;
     String hoursOpen;

    // Constructor
    public Restaurant() {}

        public Restaurant(int waitTime, double rating, double avgPrice, double dist, String hoursOpen){
        this.waitTime = waitTime;
        this.rating = rating;
        this.avgPrice = avgPrice;
        this.dist = dist;
        this.hoursOpen = hoursOpen;
    }
}
