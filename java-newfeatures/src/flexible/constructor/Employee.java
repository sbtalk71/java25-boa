package flexible.constructor;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printProfile(){
        System.out.println(id+" "+name);
    }
}
