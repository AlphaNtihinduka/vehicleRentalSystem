public class Vehicle {
    private String licensePlate;
    private String colour;
    private double price_per_day;
    private boolean isrented;

    //Creat a constructor for the Vehicle
    public Vehicle(String licensePlate, String colour, double price_per_day) {
        this.licensePlate = licensePlate;
        this.colour = colour;
        this.price_per_day = price_per_day;
        this.isrented = false;
    }


    // Implement getters and setters
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice_per_day() {
        return price_per_day;
    }

    public void setPrice_per_day(double price_per_day) {
        this.price_per_day = price_per_day;
    }

    public boolean isIsrented() {
        return isrented;
    }

    public void setIsrented(boolean isrented) {
        this.isrented = isrented;
    }


    // Print the vehicle information
    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", colour='" + colour + '\'' +
                ", price_per_day=" + price_per_day +
                ", isrented=" + isrented +
                '}';
    }
}
//    Vehicle information:
//    license plate
//    colour
//    price per day