
//Create a Customer class
public class Customer {
    private String name;
    private String address;
    private int age;

    // Implement a customer constructor
    public Customer(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }


    // Implement setters and getters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // Display customer information
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
