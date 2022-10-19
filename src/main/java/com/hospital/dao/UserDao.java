package com.hospital.dao;

import com.hospital.domain.User;

import java.sql.*;
import java.util.Map;

public class UserDao {
    private ConnectionMaker connectionMaker;

    public UserDao() {
        this.connectionMaker = new AWSConnectionMaker();
    }

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    // insert
    public void add(User user) throws SQLException, ClassNotFoundException {


        Connection connection = connectionMaker.makeConnection();

        // Query 문 작성
        PreparedStatement pstmt = connection.prepareStatement("INSERT INTO `likelion-db`.users(id, name, password) VALUES (?, ?, ?)");
        pstmt.setString(1, user.getId());
        pstmt.setString(2, user.getName());
        pstmt.setString(3, user.getPassword());

        // Query 문 실행
        pstmt.executeUpdate();

        pstmt.close();
        connection.close();
    }

    //select
    public User findById(String id) throws SQLException, ClassNotFoundException {
        Connection connection = connectionMaker.makeConnection();

        // Query문 작성
        PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM `likelion-db`.users WHERE id = ?");
        pstmt.setString(1, id);

        // Query문 실행
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        User user = new User(rs.getString("id"), rs.getString("name"),
                rs.getString("password"));

        rs.close();
        pstmt.close();
        connection.close();

        return user;
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();

        String id = "11";
        userDao.add(new User(id, "geun", "asdf1234"));

        User user = userDao.findById(id);
        System.out.println(user.getName());
    }
}
