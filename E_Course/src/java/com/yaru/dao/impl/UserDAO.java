/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yaru.dao.impl;

import com.yaru.dao.IUserDAO;
import com.yaru.util.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

/**
 *
 * @author Administrator
 */
public class UserDAO  implements IUserDAO {
     @Autowired
    private JdbcTemplate jdbcTemplate;
     
     
      public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
     public User getUser(String username) {
       
        User user=new User();
        user.setUsername(username);
        return user;
    }
    
   
    public User validate(String username, String password) {
        final List <User> users=new ArrayList<User>();
     String sql="select id,username,password,level from user1 where username=? and password=?";
     
        Object[] paras=new Object[]{username,(password)};
       //  System.out.println(sql);
      jdbcTemplate.query(sql,paras,new RowCallbackHandler()
              {

         @Override
         public void processRow(ResultSet rs) throws SQLException {
             User user=new User();
             user.setId(Integer.parseInt(rs.getString(1)));
             user.setLevel(rs.getInt(4));
             user.setUsername(rs.getString(2));
             user.setPassword(rs.getString(3));
             System.out.println("+++++++++++++"+user.getLevel());
             users.add(user);
         }
                  
              });
      if(users.isEmpty())
          return null;
      else
       return users.get(0);
}

    

    @Override
    public List<User> getUser() {
         final List <User> users=new ArrayList<User>();
     String sql="select id,username,password,level from user1";
     
        Object[] paras=new Object[]{};
       //  System.out.println(sql);
      jdbcTemplate.query(sql,paras,new RowCallbackHandler()
              {

         @Override
         public void processRow(ResultSet rs) throws SQLException {
              User user=new User();
            user.setId(Integer.parseInt(rs.getString(1)));
             user.setLevel(rs.getInt(4));
             user.setUsername(rs.getString(2));
             user.setPassword(rs.getString(3));
             System.out.println("+++++++++++++"+user.getLevel());
             users.add(user);
         }
                  
              });
      if(users.isEmpty())
          return null;
      else
       return users;
    }

    @Override
    public boolean validateUsername(String username) {
          final List <User> users=new ArrayList<User>();
     String sql="select count(*) from user1 where username=? ";
     
        Object[] paras=new Object[]{username};
       //  System.out.println(sql);
      int rs=jdbcTemplate.queryForInt(sql,paras);
      if(rs==1)
          return true;
      else
       return false;
    }
    
}
