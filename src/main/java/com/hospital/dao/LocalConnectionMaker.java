package com.hospital.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class LocalConnectionMaker implements ConnectionMaker {

    @Override
    public Connection makeConnection() throws SQLException {
        // DB접속
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/likelion-db",
                "root",
                "12345678");
        return connection;
    }
}
