/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yaru.web;

import com.yaru.service.ITeacherService;
import com.yaru.util.Teacher;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Administrator
 */


@Controller
@RequestMapping(value = "/teacher")
public class TeacherController {
     @Autowired
     public ITeacherService teacherService;
    @RequestMapping(value = "/viewTeacher")
     public ModelAndView viewTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //return new ModelAndView("index");
         List<Teacher> teachers=teacherService.getTeachers();
         ModelAndView mav= new ModelAndView("teacher");
         mav.addObject("teachers",teachers);
         mav.addObject("sb","sb");
        return mav;
    }
    
}
