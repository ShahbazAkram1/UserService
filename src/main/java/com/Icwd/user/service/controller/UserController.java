package com.Icwd.user.service.controller;

import com.Icwd.user.service.entity.User;
import com.Icwd.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {


    @Autowired
    private UserService userService;


    // create
    public ResponseEntity<User> createUser(@RequestBody User user) {

        User saveUser = userService.saveUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    // single get user


    // get all users

}
