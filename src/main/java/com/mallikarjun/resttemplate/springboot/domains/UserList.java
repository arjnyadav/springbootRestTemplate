package com.mallikarjun.resttemplate.springboot.domains;

import java.io.Serializable;
import java.util.List;

public class UserList{

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
