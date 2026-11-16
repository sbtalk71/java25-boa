package com.demo.interfaces;

import java.util.Optional;

public class DriverFactory {

    public static Optional<MyDriver> getDriver(String dbType){
        if(dbType.equals("oracle")){
            return Optional.of(new OracleDB());
        }else if (dbType.equals("mysql")){
            return Optional.of(new MySQLDB());
        }else{
            return Optional.empty();
        }
    }
}
