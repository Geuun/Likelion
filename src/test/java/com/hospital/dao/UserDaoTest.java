package com.hospital.dao;

import com.hospital.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;

    @Test
    @DisplayName("DAO가 잘 되는지 테스트")
    void addAndGet() throws SQLException, ClassNotFoundException {
        User user1 = new User("1", "geun", "1123");

        UserDao userDao = context.getBean("awsUserDao", UserDao.class);

        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        // insert
        userDao.add(user1);
        assertEquals(1,userDao.getCount());

        // select
        User user = userDao.findById(user1.getId());
        assertEquals(user1.getName(), user.getName());
        assertEquals(user1.getPassword(), user.getPassword());
    }

    @Test
    void count() throws SQLException, ClassNotFoundException {

        User user1 = new User("1", "geun", "1123");
        User user2 = new User("2", "gana", "2223");
        User user3 = new User("3", "dara", "3323");

        UserDao userDao = context.getBean("awsUserDao", UserDao.class);

        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        userDao.add(user1);
        assertEquals(1, userDao.getCount());
        userDao.add(user2);
        assertEquals(2, userDao.getCount());
        userDao.add(user3);
        assertEquals(3, userDao.getCount());
    }

    @Test
    void findById() throws SQLException, ClassNotFoundException {
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        userDao.findById("1");
    }
}