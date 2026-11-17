package streams;

import dataset.Data;
import org.junit.jupiter.api.Test;

public class TestStreamMethods {
    @Test
    void testMapOnEmployees(){
        Data.employees.stream().filter(e->e.city().equalsIgnoreCase("hyderabad")).forEach(System.out::println);
    }

    @Test
    void testFindFirstFromHyderabad(){
        Data.employees.stream()
                .filter(e->e.city().equalsIgnoreCase("hyderabad"))
                .findFirst()
                .ifPresent(System.out::println);
    }

    @Test
    void testFindLastFromHyderabad(){
        Data.employees.stream()
                .filter(e->e.city().equalsIgnoreCase("hyderabad"))
                .reduce((e1,e2)->e2)
                .ifPresent(System.out::println);
    }

    @Test
    void testTotalSalaryOfITDept(){
        Data.employees.stream()
                .filter(e->e.department().equalsIgnoreCase("IT"))
                .mapToDouble(e->e.salary())
                .reduce((s1,s2)->s1+s2)
                .ifPresent(System.out::println);
    }

    @Test
    void testEmpWithSalaryMoreThan85K(){
        if(Data.employees.stream().anyMatch(e->e.salary()>85000)) {
            System.out.println("processing...");
            Data.employees.stream().filter(e -> e.salary() > 85000).forEach(System.out::println);
        }
    }
}
