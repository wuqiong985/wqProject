<%--
  Created by IntelliJ IDEA.
  User: wuqiong6
  Date: 2017/12/1
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% String username =  request.getParameter("username");%>
    Login Successful! <br>
    <%=username%>
</body>
</html>
