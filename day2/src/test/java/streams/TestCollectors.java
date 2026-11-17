package streams;

import dataset.Data;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;


public class TestCollectors {
   @Test
    void testGroupingBy(){
        Data.employees.stream()
                .collect(Collectors.groupingBy(emp->emp.department(),Collectors.toList()))
                .forEach((k,v)-> System.out.println(k+" ....."+v));
    }

    @Test
    void testGroupingByAndMapping(){
        Data.employees.stream()
                .collect(Collectors.groupingBy(emp->emp.department(),Collectors.mapping(emp->emp.name(), Collectors.toList())))
                        .forEach((dept,list)-> System.out.println(dept+" ....."+list));
    }
}
