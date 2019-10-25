package com.ccb.mapper;

import com.ccb.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    void insert(User user);

    void deleteUserById(Long id);

    void updateUserById(User user);

    User selectUserById(Long id);
}
