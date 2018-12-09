package com.example.fkbookapp.service;

import com.example.fkbookapp.model.User;

public interface UserService {
    User login(String loginname,String  password);
}
