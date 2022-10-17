package com.dbexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class UserDao {
    public void add() throws SQLException, ClassNotFoundException {
        Map<String , String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbHost, dbUser, dbPassword);
        PreparedStatement ps = connection.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
        ps.setString(1, "1");
        ps.setString(2, "Jaeguen");
        ps.setString(3, "1123");

        ps.executeUpdate(); // ctrl +enter
        ps.close();
        connection.close();

        System.out.println("DB Insert가 완료되었습니다.");
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao =new UserDao();
        userDao.add();
    }
}
