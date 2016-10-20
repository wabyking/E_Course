/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yaru.service;

import com.yaru.util.User;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface IUserService {
    public User ValidateUser(String username,String password);
    public List<User> getUsers();

    public boolean ValidateUsername(String username);
    
}
