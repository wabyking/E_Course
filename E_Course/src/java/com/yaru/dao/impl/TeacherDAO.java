/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yaru.dao.impl;

import com.yaru.dao.ITeacherDAO;
import com.yaru.util.Teacher;
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
public class TeacherDAO implements ITeacherDAO{

    
      @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
      
      
    @Override
    public List<Teacher> getTeachers() {
     final List <Teacher> teachers=new ArrayList<Teacher>();
     String sql="select teachername,introduction,master from teacher";
     Object[] paras=new Object[]{};
  
      jdbcTemplate.query(sql,paras,new RowCallbackHandler()
              {

         @Override
         public void processRow(ResultSet rs) throws SQLException {
              Teacher teacher=new Teacher();
            teacher.setName(rs.getString(1));
             teacher.setIntroduction(rs.getString(2));
             teacher.setIsMaster(rs.getInt(3));
             System.out.println(rs.getInt(3)+"lalala");
            System.out.println(teacher.getName());
             teachers.add(teacher);
         }
                  
              });
      
       return teachers;
    }
    public static void main(String args[])
    {
        TeacherDAO dao=new TeacherDAO();
        dao.getTeachers();
    }
    
}
