package com.hospital.dao;

import com.hospital.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;

import javax.sql.DataSource;
import java.sql.*;
import java.util.EmptyStackException;

public class UserDao {

    private DataSource dataSource; // DataSource 를 의존하도록 변경

    public UserDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private ConnectionMaker connectionMaker;

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public void jdbcContextWithStatementStrategy(StatementStrategy stmt) throws SQLException {
        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            connection = dataSource.getConnection(); // DataSource를 사용하도록 변경
            pstmt = stmt.makePreparedStatement(connection);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {

                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {

                }
            }
        }
    }

    // insert
    public void add(User user) throws SQLException {

        PreparedStatement pstmt = null;
        Connection connection = null;

        try {
            // DB접속 (ex mysql workbench 실행)
            connection = dataSource.getConnection();

            // Query 문 작성
            pstmt = connection.prepareStatement("INSERT INTO `likelion-db`.users(id, name, password) VALUES (?, ?, ?)");
            pstmt.setString(1, user.getId());
            pstmt.setString(2, user.getName());
            pstmt.setString(3, user.getPassword());

            // Query 문 실행
            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {

                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    //select
    public User findById(String id) throws SQLException {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        User user = null;
        try {
            connection = dataSource.getConnection();

            // Query문 작성
            pstmt = connection.prepareStatement("SELECT * FROM `likelion-db`.users WHERE id = ?");
            pstmt.setString(1, id);

            // Query문 실행
            rs = pstmt.executeQuery();
            user = null;

            if (rs.next()) {
                user = new User(rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("password"));
            }
            if (user == null) {
                throw new EmptyStackException();
            }

            return user;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {

                }
            }

            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {

                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {

                }
            }
        }
    }

    public void deleteAll() throws SQLException {
        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            connection = dataSource.getConnection();
            pstmt = new DeleteAllStrategy().makePreparedStatement(connection);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally { // error 가 나도 실행되는 블럭
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {

                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {

                }
            }
        }
    }

    public int getCount() throws SQLException {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            connection = dataSource.getConnection();
            pstmt = connection.prepareStatement("SELECT  COUNT(*) from `likelion-db`.users");
            rs = pstmt.executeQuery();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) throws SQLException {
//        AWSConnectionMaker awsConnectionMaker = new AWSConnectionMaker();
//        UserDao userDao = new UserDao(awsConnectionMaker);
//
//        String id = "12";
//        userDao.add(new User(id, "geun", "asdf1234"));
//
//        User user = userDao.findById(id);
//        System.out.println(user.getName());

        // test Ccode로 실행
    }
}
