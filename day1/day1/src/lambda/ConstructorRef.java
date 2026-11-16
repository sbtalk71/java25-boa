package lambda;

public class ConstructorRef {

    static void main() {

        EmpCreator empCreator=(id,name)->new Employee(id,name);

        empCreator.create(100,"Shantanu");

        EmpCreator empCreator1=Employee::new;

        empCreator1.create(100,"Shantanu");
    }
}
