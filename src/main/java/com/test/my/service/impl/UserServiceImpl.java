package com.test.my.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.my.dao.UserDAO;
import com.test.my.model.User;
import com.test.my.service.UserService;

@Service
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDAO userDAO;
     
    public int insertUser(User user) {
        return userDAO.insertUser(user);
    }
 
}
