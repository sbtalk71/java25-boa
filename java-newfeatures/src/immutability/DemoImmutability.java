package immutability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoImmutability {
    static void main() {

        List<String> skills=new ArrayList<>();
        skills.add("Java");
        skills.add("Spring");
        skills.add("Hibernate");

        Employee emp= new Employee(100,"Shantanu", skills );

        System.out.println(emp);
        emp.getSkills().add("Python");

        System.out.println(emp);

    }
}
