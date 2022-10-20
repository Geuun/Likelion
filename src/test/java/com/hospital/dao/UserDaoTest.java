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
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);

        //id가 중복이되어서 vairable로 뺌
        String id = "13";

        //insert
        userDao.add(new User(id, "geun", "asdf1234"));

        // select
        User user = userDao.findById(id);
        assertEquals("geun", user.getName());
        assertEquals("asdf1234", user.getPassword());
    }
}