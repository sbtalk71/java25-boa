package com.demo.interfaces;

public class MySQLDB implements MyDriver{
    @Override
    public String getConnection() {
        return "MySQL DB Connected";
    }

    @Override
    public String getDbVersion() {
        return "MySQL DB 9.0.1";
    }
}
