<%-- 
    Document   : headerjsp
    Created on : 2014-9-13, 20:38:28
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

    <link rel="stylesheet" href="../styles/layout.css" type="text/css" />
    <!-- Homepage Specific Elements -->
    <style>


    </style>
    <script type="text/javascript" src="../js/jquery.js"></script>
        <script type="text/javascript" src="../scripts/jquery-1.4.1.min.js"></script>
        <script type="text/javascript" src="../scripts/jquery.easing.1.3.js"></script>
        <script type="text/javascript" src="../scripts/jquery.timers.1.2.js"></script>
        <script type="text/javascript" src="../scripts/jquery.galleryview.2.1.1.min.js"></script>
        <script type="text/javascript" src="../scripts/jquery.galleryview.setup.js"></script>
    <script type="text/javascript">
//        $(document).ready(function() {
//            $(".nav a").each(function() {
//                $(this).click(function() {
//                    $(".nav .active").removeClass("active");
//                    $(this).addClass("active");
//                    return false;//防止页面跳转  
//                });
//            });
//        });
//$(document).ready(function(){  
//    $(".nav a").each(function(){  
//        $this = $(this);  
//        if($this[0].href==String(window.location)){  
//            $this.addClass("hover");  
//        }  
//    });  
//});  
    </script>
<link rel="stylesheet" href="../styles/layout.css" type="text/css" />

    <div class="wrapper row1">
        <div align="center"><a href="index.html"><img src="../images/title.jpg" width="960" height="165" /></a></div>
        
        <div id="header" class="clear">
            <div id="topnav"  class="nav">
                <ul id="navul">
                    <li ><a href="<%= request.getContextPath()%>/index/index"  class="active">首  页</a></li>
                    <!--        class="active"-->
                    <li><a href="<%= request.getContextPath()%>/jsp/annouce.jsp">教学公告</a></li>
                    <li><a href="<%= request.getContextPath()%>/jsp/introduction.jsp">课程简介</a></li>
                    <li><a href="<%= request.getContextPath()%>/teacher/viewTeacher">师资力量</a></li>
                    <li><a href="<%= request.getContextPath()%>/jsp/teach.jsp">教学内容</a></li>
                    <li><a href="<%= request.getContextPath()%>/jsp/material.jsp">教学资料</a></li>
                    <li><a href="<%= request.getContextPath()%>/jsp/apply.jsp">申报材料</a></li>
                    <li><a href="<%= request.getContextPath()%>/jsp/homework.jsp">作业管理</a></li>
                    <li><a href="<%= request.getContextPath()%>/jsp/vedio.jsp">教学录像</a></li>
                    <li class="last"><a href="#">在线交流</a></li>
                </ul>
            </div>
        </div>
    </div>

