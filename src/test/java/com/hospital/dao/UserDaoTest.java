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

        String id = "9";

        User user = new User(id, "geun", "asdf1234");

        User selectedUser = userDao.findById(id);
        Assertions.assertEquals("geun", selectedUser.getName());
    }
}