/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yaru.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Administrator
 */
public class test {
     @Autowired
    private JdbcTemplate jdbcTemplate;
      public String getNamebyID(String id) {
        String sql="select userid from user1 where username= "+id;
        return (String)jdbcTemplate.queryForObject(sql,String.class);
        //jdbcTemplate.q
    }
      public static void main(String args[])
      {
          test t=new test();
          System.out.println(t.getNamebyID("waby"));
      }
     
}
