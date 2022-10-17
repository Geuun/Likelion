package com.hospital.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class HospitalDao {

    public void add() throws ClassNotFoundException, SQLException {
        Map<String, String > env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbHost, dbUser, dbPassword);
        PreparedStatement ps = connection.prepareStatement("INSERT INTO seoul_hospital(id, address, district, category, emergency_room, name, subdivision) VALUES(?, ?, ?, ?, ?, ?, ?)");
        ps.setString(1, "Z1234567");
        ps.setString(2, "서울특별시 송파구 석촌호수로 152 N층");
        ps.setString(3, "서울특별시 송파구");
        ps.setString(4, "C");
        ps.setString(5, "2");
        ps.setString(6, "내가만든의원");
        ps.setString(7, "종합의원");
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

    }
}
