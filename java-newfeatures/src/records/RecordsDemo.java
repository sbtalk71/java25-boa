package records;

public class RecordsDemo {
    static void main() {
        Employee emp=new Employee(100,"Shantanu","Hyderabad",60000);
        Employee emp1=new Employee(100,"Shantanu","Hyderabad",60000);

        System.out.println(emp);

        System.out.println(emp.equals(emp1));

        System.out.println(emp.name()+" "+emp.salary());
    }
}
