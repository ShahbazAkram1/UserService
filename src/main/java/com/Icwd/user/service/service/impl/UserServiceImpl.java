package com.Icwd.user.service.service.impl;

import com.Icwd.user.service.entity.User;
import com.Icwd.user.service.exceptions.ResourceNotFoundException;
import com.Icwd.user.service.repository.UserRespository;
import com.Icwd.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRespository userRespository;

    @Override
    public User saveUser(User user) {
        return userRespository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRespository.findAll();
    }

    @Override
    public User getUser(String id) {
        return userRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server " + id));
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(String id) {

    }
}
