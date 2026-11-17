package streams;

import dataset.Data;
import dataset.Employee;
import org.junit.jupiter.api.Test;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
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

    @Test
    void testCounting(){
        System.out.println(Data.employees.stream().collect(Collectors.groupingBy(emp->emp.department(), Collectors.counting())));
    }


    @Test
    void testJoining(){
        System.out.println(Data.employees.stream().map(emp->emp.name()).collect(Collectors.joining(", ")));
    }

    @Test
    void testPartionBy(){
        Map<Boolean, List<Employee>> partionedData=Data.employees.stream()
                .collect(Collectors.partitioningBy(emp->emp.salary()>75000));
        System.out.println("TRUE -> : "+partionedData.get(true));
        System.out.println("FALSE -> : "+partionedData.get(false));
    }

    @Test
    void testSummerizing(){
     DoubleSummaryStatistics stats= Data.employees.stream().collect(Collectors.summarizingDouble(emp->emp.salary()));
        System.out.println("Total no. of Employees :"+stats.getCount());
        System.out.println("Total salary : "+stats.getSum());
        System.out.println("Average Salary : "+stats.getAverage());
        System.out.println("Min Salary : "+ stats.getMin());
        System.out.println("Max Salary : "+stats.getMax());

   }
}
