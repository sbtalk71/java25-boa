package com.demo.interfaces;

public class DriverMain {
    static void main() {

        MyDriver driver= new OracleDB();
        System.out.println(driver.getConnection());
        System.out.println(driver.getDbVersion());
        System.out.println(driver.isClusterSupported());
    }
}
