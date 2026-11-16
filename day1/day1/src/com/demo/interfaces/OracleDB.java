package com.demo.interfaces;

public class OracleDB implements MyDriver{
    @Override
    public String getConnection() {
        return "Oracle DB Connected";
    }

    @Override
    public String getDbVersion() {
        return "Oracle DB 11g";
    }
}
