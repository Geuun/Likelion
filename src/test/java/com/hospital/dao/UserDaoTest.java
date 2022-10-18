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
        AWSUserDaoImpl userDao = new AWSUserDaoImpl()

        //id가 중복이되어서 vairable로 뺌
        String id = "2";

        User user = new User(id, "geun", "asdf1234");

        //insert
        userDao.add(user);
        // select
        User selectedUser = userDao.findById(id);
        Assertions.assertEquals("geun", selectedUser.getName());
    }
}