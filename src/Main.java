import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<Customer, Vehicle> rentedVehicles = new HashMap<>();

        // Create customers.
        Customer customer1 = new Customer("customer1", "Kampala", 21);
        Customer customer2 = new Customer("customer2", "Torino", 23);
        Customer customer3 = new Customer("customer3", "Roma", 24);
        Customer customer4 = new Customer("customer4", "Kyegegwa", 26);
        Customer customer5 = new Customer("customer5", "Gulu", 29);
        Customer customer6 = new Customer("customer6", "Fort", 31);


        //Create cars
        Car car1 = new Car("y-01", "Red", 200);
        Car car2 = new Car("y-02", "Green", 100);
        Car car3 = new Car("y-03", "Orange", 400);
        Car car4 = new Car("y-04", "Black", 300);


        //Create trucks
        Car truck1 = new Car("T-01", "Red", 200);
        Car truck2 = new Car("T-02", "Green", 100);
        Car truck3 = new Car("T-03", "Orange", 400);
        Car truck4 = new Car("T-04", "Black", 300);

        // Customer1 renting Car1
        car1.setIsrented(true);
        rentedVehicles.put(customer1, car1);

        // Customer2 renting Car4
        car4.setIsrented(true);
        rentedVehicles.put(customer2, car4);

        // Customer3 renting Car3
        car3.setIsrented(true);
        rentedVehicles.put(customer3, car3);

        // Customer4 renting Car3
        car3.setIsrented(true);
        rentedVehicles.put(customer4, car3);

        // Customer5 renting truck4
        truck4.setIsrented(true);
        rentedVehicles.put(customer5, truck4);

        // Checking if the truck4 is free or not
        boolean isRented = truck4.isIsrented();
        System.out.println("Truck4 is rented: "+isRented);
    }
}