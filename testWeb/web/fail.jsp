<%--
  Created by IntelliJ IDEA.
  User: wuqiong6
  Date: 2017/11/27
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
Login Failed! <br>
    basePath: <%=basePath%>
    path:<%=path%>
</body>
</html>
