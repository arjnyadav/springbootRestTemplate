package com.mallikarjun.resttemplate.springboot.controllers;

import com.mallikarjun.resttemplate.springboot.domains.User;
import com.mallikarjun.resttemplate.springboot.domains.UserList;
import com.mallikarjun.resttemplate.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("mallik")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
