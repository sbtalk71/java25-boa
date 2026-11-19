package com.demo.patterns;

import com.demo.patterns.records.Employee;

public class RecordPatternInSwitch {
    static void main() {
        Employee emp=new Employee(100,"Shantanu",85000);

        String category=switch (emp){
            case Employee(int id, String name, double salary) when salary>100000->"Senior Executive";
            case Employee(int id, String name, double salary) when salary>80000 && salary<100000->"Senior Executive";
            case Employee(int id, String name, double salary) when salary<75000 ->"executive";
            default -> throw new IllegalArgumentException("Salary not within range");

        };

        System.out.println("The category : "+category);
    }
}
