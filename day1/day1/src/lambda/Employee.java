package lambda;

public class Employee {

    private int empId;
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }


    public void profileInfo(){
        System.out.println(empId+" "+name);
    }
}
