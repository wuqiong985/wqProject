<%--
  Created by IntelliJ IDEA.
  User: wuqiong6
  Date: 2017/11/27
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="check.AccountBean"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
        AccountBean account = (AccountBean) session.getAttribute("account");
    %>
    username:<%= account.getUsername()%>
    <br>
    password:<%= account.getPassword() %>

    basePath: <%=basePath%>
    path:<%=path%>
</body>
</html>
