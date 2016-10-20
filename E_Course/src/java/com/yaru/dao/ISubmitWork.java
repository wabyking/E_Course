/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yaru.dao;

import com.yaru.util.User;

/**
 *
 * @author Administrator
 */
public interface ISubmitWork {
    void insert(String title,String content);
    void getSubmitWork(User user);
    
}
