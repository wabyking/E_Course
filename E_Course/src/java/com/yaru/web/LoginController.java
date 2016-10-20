/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yaru.web;

import com.yaru.beans.RandomValiateCode;
import com.yaru.service.IUserService;
import com.yaru.util.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    IUserService userService;

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/loginout")
    public ModelAndView loginout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //return new ModelAndView("index");

        HttpSession session = request.getSession();
        if (session.getAttribute("user") != null) {
            session.removeAttribute("user");

        }

        return new ModelAndView(new RedirectView(request.getContextPath() + "/index.jsp"));

    }

    @RequestMapping("/loginCheck")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, User user1) throws ServletException, IOException {
        //return new ModelAndView("index");

        HttpSession session = request.getSession();
        String error =null;
        String randomCode=(String) session.getAttribute("valiatecode");
        
        if (!user1.getRandomCode().toUpperCase().equals(randomCode) ) {
            error =new String( "验证码错误");
            
            return new ModelAndView(new RedirectView(request.getContextPath() + "/index.jsp?error=1"));
        } 
        else 
        {
            User user = userService.ValidateUser(user1.getUsername(), user1.getPassword());
             System.out.println("query");
            if (user == null) {
                session.removeAttribute("user");
                error = "用户名或者密码错误";
                 System.out.println(error);
                return new ModelAndView(new RedirectView(request.getContextPath() + "/login.jsp?error=2"));

            }
            else {
                session.setAttribute("user", user);
                 System.out.println("ok");
                return new ModelAndView(new RedirectView(request.getContextPath() + "/jsp/index.jsp"));
            }
        }

    }

    @RequestMapping("/ImageServlet")
    public void loadImage(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
        response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        RandomValiateCode randomValidateCode = new RandomValiateCode();
        try {
            randomValidateCode.getRandcode(request, response);//输出图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
     @RequestMapping("/checkUser")
    public void checkUsername(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String username=request.getParameter("username");
        boolean flag=userService.ValidateUsername(username);
        System.out.println(flag);
        out.print(flag == false ? "false" : "true");
        out.close();

    }
    
     @RequestMapping("/checkPSW")
    public void checkPSW(HttpServletRequest request, HttpServletResponse response,User user) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        User validateduser = userService.ValidateUser(user.getUsername(), user.getPassword());
        boolean flag=(user!=null);
        System.out.println(flag);
        out.print(flag == false ? "false" : "true");
        out.close();

    }
    
    
     @RequestMapping("/checkCode")
    public void checkCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
       request.setCharacterEncoding("UTF-8");
        response.setContentType("text/json;charset=UTF-8");
         String inputcode=request.getParameter("randomCode");
        HttpSession session=request.getSession();
        String valiatecode=(String) session.getAttribute("valiatecode");
        PrintWriter out = response.getWriter();
        boolean flag = valiatecode.toLowerCase().equals(inputcode.toLowerCase());
        System.out.println(flag);
        out.print(flag == false ? "false" : "true");
        out.close();

    }

}

