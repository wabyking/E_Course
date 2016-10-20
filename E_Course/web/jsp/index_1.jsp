<%@page import="com.yaru.util.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>在线学习交流系统</title>
        <link href="../images/login.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../js/jquery.js" ></script>
        <script type="text/javascript" src="../js/jquery.validate.js" ></script>
        <script type="text/javascript" src="../s/myValidate.js" charset="utf-8"></ ></script>
	
    </head>
    <body>

        <div id="login">

            <div id="top">
                <div id="top_left"><img src="images/login_03.gif" /></div>
                <div id="top_center"></div>
            </div>
            <form action="<%= request.getContextPath()%>/login/loginCheck" method="post">
                <!--                <div id="center">
                                    <div id="center_left"></div>
                                    <div id="center_middle">
                                        <div id="user">用户名
                                            <input type="text"  id="username" name="username"  />
                                        </div>
                                        <div id="password">密  码<input type="password"  id="password" name="password" />
                                        </div>
                                        <div id="btn">
                                            <input type="submit"  value="登录" />
                                        </div>
                
                                    </div>
                                    <div id="center_right"></div>		 
                                </div>-->

                <div id="center" >
                    <div id="center_left"></div>
                    <div id="center_middle">
                       
                            <label type="text"  >&nbsp用户名  </label>
                            <input type="text" id="username" name="username" value="waby"/>
                           
                        <br/><br/>
                       
                            <label type="text"  >&nbsp密&nbsp&nbsp码    </label>
                            <input type="password" id="password" name="password" value="waby"/>
                        <br/><br/>

                        
                            <label>&nbsp验证码</label> 
                            <input type="text" name="randomCode"  id="randomCode"  />
                        <br/><br/>
                        

                            <img title="看不清，换一个" onclick="javascript:window.top.location.reload()" name="randomCodeImage"  id="randomCodeImage" src="<%= request.getContextPath()%>/login/ImageServlet">
                        <br/><br/>
                        
                            <input type="submit" value="登录">
                                <input type="reset" value="重置"/>
                                <br/><div align="center">
                                 <label color="red"><%= request.getParameter("error")==null?"":(request.getParameter("error").equals("1")?"验证码错误":"用户名或者密码错误")%></label>
                                   
                                 </div><br/>
                                   
                                    </div>
                                    <div id="center_right"></div>
                                    </div>

                                    </form>
                                    <div id="down">
                                        <div id="down_left">
                                            <div id="inf">
                                                <span class="inf_text">Welcome</span>
                                                <span class="copyright">精品课网站 v1.0</span>
                                            </div>
                                        </div>
                                        <div id="down_center"></div>		 
                                    </div>

                                    </div>
                                    </body>
                                    </html>
