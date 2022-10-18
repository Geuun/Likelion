package com.dbexercise.dao;

import com.dbexercise.domain.User;

import java.sql.*;
import java.util.Map;

public class UserDao {
    public User select(String id) throws SQLException {
        Map<String , String > env = System.getenv();
        Connection connection = DriverManager.getConnection(
                env.get("DB_HOST"), env.get("DB_USER"), env.get("DB_PASSWORD")
        );
        PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM users where id = ?");
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));

        rs.close();
        pstmt.close();
        connection.close();

        return user;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao =new UserDao();
        User user = userDao.select("0");
        System.out.println(user.getName());
    }
}
