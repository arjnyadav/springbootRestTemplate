package com.mallikarjun.resttemplate.springboot.services;

import com.mallikarjun.resttemplate.springboot.domains.User;
import com.mallikarjun.resttemplate.springboot.domains.UserList;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private RestTemplate restTemplate;

    public UserServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers() {

        User[] forNow = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", User[].class);

        List<User> users = Arrays.asList(forNow);
        return users;

    }
}
