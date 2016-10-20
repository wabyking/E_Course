/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yaru.service.impl;

import com.yaru.dao.IUserDAO;
import com.yaru.service.IUserService;
import com.yaru.util.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Administrator
 */
public class UserService implements IUserService{
     @Autowired
    IUserDAO userDAO;

    @Override
    public User ValidateUser(String username, String password) {
        return userDAO.validate(username, password);
    }

    public IUserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUser();
    }

    @Override
    public boolean ValidateUsername(String username) {
        return userDAO.validateUsername(username);
    }
    
}
