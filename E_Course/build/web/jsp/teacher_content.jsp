<%-- 
    Document   : teacher_content
    Created on : 2014-9-16, 17:34:41
    Author     : Administrator
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="../styles/layout.css" type="text/css" />
<div class="wrapper row3">
     
        <div id="table" style="width: 400px;padding-left: 30%">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <th>序号</th>
                    <th>职工用户名</th>
                    <th>密码</th>
                   
                   
                </tr>
                   <c:forEach var="teacher" items="${teachers}" varStatus="status">
                        <tr class="con">
                        <td >${status.count}</td>
                        <td >${teacher.name}</td>
                        <td>
                            ${teacher.introduction}
                        </td>
                        
                        
                        
                       </tr> 
                </c:forEach>

            </table>

        </div>
</div>

