/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yaru.service.impl;

import com.yaru.dao.ITeacherDAO;
import com.yaru.service.ITeacherService;
import com.yaru.util.Teacher;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Administrator
 */
public class TeacherService implements ITeacherService{
     @Autowired
     public ITeacherDAO teacherDAO;
    
    
    @Override
    public List<Teacher> getTeachers() {
        System.out.println(teacherDAO.getTeachers().size());
       return teacherDAO.getTeachers();
    }
    
}
