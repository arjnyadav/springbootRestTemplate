package com.mallikarjun.resttemplate.springboot.services;

import com.mallikarjun.resttemplate.springboot.domains.User;
import com.mallikarjun.resttemplate.springboot.domains.UserList;

import java.util.List;

public interface UserService {
    List<User> getUsers();
}
