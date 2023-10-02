package com.Icwd.user.service.service;

import com.Icwd.user.service.entity.User;

import java.util.List;

public interface UserService {

    // create user
    User saveUser(User user);

    // get all users
    List<User> getAllUser();

    // get single user of given userid

    User getUser(String id);

    // update user
    User updateUser(User user);


    // delete user
    void deleteUser(String id);

}
