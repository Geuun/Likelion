package com.hospital.dao;

import com.hospital.domain.User;

import java.sql.*;
import java.util.Map;

public class UserDao {
    AwsConnectionMaker awsConnectionMaker = new AwsConnectionMaker();

    // insert
    public void add(User user) {

        try {
            Connection connection = awsConnectionMaker.makeConnection();

            // Query 문 작성
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO `likelion-db`.users(id, name, password) VALUES (?, ?, ?)");
            pstmt.setString(1, user.getId());
            pstmt.setString(2, user.getName());
            pstmt.setString(3, user.getPassword());

            // Query 문 실행
            pstmt.executeUpdate();

            pstmt.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    //select
    public User findById(String id) {
        try {
            Connection connection = awsConnectionMaker.makeConnection();

            // Query문 작성
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM `likelion-db`.users WHERE id = ?");
            pstmt.setString(1, id);

            // Query문 실행
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            User user = new User(rs.getString("id"), rs.getString("name"),
                    rs.getString("name"));

            rs.close();
            pstmt.close();
            connection.close();

            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();

        userDao.add(new User("7", "geun", "asdf1234"));

        User user = userDao.findById("7");
        System.out.println(user.getName());
    }
}
