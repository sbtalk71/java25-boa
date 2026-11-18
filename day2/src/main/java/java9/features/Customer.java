package java9.features;

public class Customer {
    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    static void main() {
        var c= new Customer(1,"a");
    }
}
