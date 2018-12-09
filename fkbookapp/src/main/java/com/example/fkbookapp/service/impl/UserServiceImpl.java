package com.example.fkbookapp.service.impl;

import com.example.fkbookapp.mapper.UserMapper;
import com.example.fkbookapp.model.User;
import com.example.fkbookapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required=true)
    private UserMapper userMapper;
    @Override
    public User login(String loginname, String password) {
         return  userMapper.findWithLoginnameAndPassword(loginname,password) ;
    }
}
