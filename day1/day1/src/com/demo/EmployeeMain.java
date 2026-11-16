package com.demo;

public class EmployeeMain {

    static void main() {

        Employee emp=new Employee(100,"Shantanu","Hyderabad",67000);
        Employee emp1=new Employee(100,"Shantanu","Hyderabad",67000);

        System.out.println(emp);

        System.out.println(emp==emp1);

        System.out.println(emp.hashCode()==emp1.hashCode());
    }
}
