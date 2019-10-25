package com.ccb.service;

import com.ccb.mapper.UserMapper;
import com.ccb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public void insert(User user) {
        userMapper.insert(user);
    }

    /*public void test(User user) {
        insert(user);
        int i = 1 / 0;
    }*/

    public void deleteUserById(Long id) {
        userMapper.deleteUserById(id);
    }

    public void updateUserById(User user) {
        userMapper.updateUserById(user);
    }

    public User selectUserById(Long id) {
        return userMapper.selectUserById(id);
    }
}
