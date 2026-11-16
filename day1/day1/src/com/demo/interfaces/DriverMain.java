package com.demo.interfaces;

import java.util.Optional;

public class DriverMain {
    static void main() {

        Optional<MyDriver> driverOp= DriverFactory.getDriver("mysql");

        if(driverOp.isPresent()) {
            MyDriver driver=driverOp.get();
            System.out.println(driver.getConnection());
            System.out.println(driver.getDbVersion());
            System.out.println(driver.isClusterSupported());
        }else {
            System.out.println("Driver not supported");
        }
    }
}
