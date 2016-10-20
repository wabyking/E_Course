/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yaru.web;

import com.yaru.util.Teacher;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping(value = "/index")
public class RedirectController {
    
     @RequestMapping(value = "/index")
     public ModelAndView viewTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //return new ModelAndView("index");
        System.out.println("sb");
        return new ModelAndView("mainframe");
    }
    
}
