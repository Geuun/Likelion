package com.hospital.dao;

import com.hospital.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    @DisplayName("DAO가 잘 되는지 테스트")
    void addAndSelect() {
        UserDao userDao = new UserDao();
        User user = new User("7", "geun", "asdf1234");

        User selectedUser = userDao.findById("7");
        Assertions.assertEquals("geun", selectedUser.getName());
    }
}