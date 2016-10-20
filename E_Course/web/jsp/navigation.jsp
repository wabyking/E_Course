<%-- 
    Document   : navigation
    Created on : 2014-9-14, 14:56:28
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .active{
                padding: 10px,10px,10px,10px;
                color: red;
            }
        </style>>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $(".nav a").each(function() {
                    $(this).click(function() {
                        $(".nav .active").removeClass("active");
                        $(this).addClass("active");
                        return false;//防止页面跳转  
                    });
                });
            });
//$(document).ready(function(){  
//    $(".nav a").each(function(){  
//        $this = $(this);  
//        if($this[0].href==String(window.location)){  
//            $this.addClass("hover");  
//        }  
//    });  
//});  
        </script>

    </head>
    <body>
        <div id="topnav"  class="nav">
            <ul id="navul">
                <li ><a href="main.jsp"  class="active">首  页</a></li>
                <!--        class="active"-->
                <li><a href="#">教学公告</a></li>
                <li><a href="#">课程简介</a></li>
                <li><a href="#">师资力量</a></li>
                <li><a href="#">教学内容</a></li>
                <li><a href="#">教学资料</a></li>
                <li><a href="#">申报材料</a></li>
                <li><a href="#.html">作业管理</a></li>
                <li><a href="vedio.jsp">教学录像</a></li>
                <li class="last"><a href="#">在线交流</a></li>
            </ul>
        </div>
    </body>
</html>
