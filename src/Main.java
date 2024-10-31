//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create customers.
        Customer customer1 = new Customer("customer1", "Kampala", 21);
        Customer customer2 = new Customer("customer1", "Kampala", 21);


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
    }
}