package com.demo.interfaces;

public class PostgreSQL implements MyDriver{
    @Override
    public String getConnection() {
        return "PostgreSQL DB Connected";
    }

    @Override
    public String getDbVersion() {
        return "PostgreSQL DB 9.0.1";
    }

    @Override
    public boolean isClusterSupported() {
        return true;
    }
}
