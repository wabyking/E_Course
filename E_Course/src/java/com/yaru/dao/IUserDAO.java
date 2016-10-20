/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yaru.dao;

import com.yaru.util.User;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface IUserDAO {
    
    public User validate(String username ,String password);
    public List<User> getUser();

    public boolean validateUsername(String username);
   
}
