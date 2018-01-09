<%--
  Created by IntelliJ IDEA.
  User: wuqiong6
  Date: 2017/12/18
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="mine" uri="randomThings" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Advisor Page<br>

<%--<mine:advice user="${username}"/>--%>

<%--<mine:advice user="<%=request.getAttribute("username")%>"/>--%>

<mine:advice >
    <jsp:attribute name="user">
            wqqqq <%-- ${username} --%>
    </jsp:attribute>
</mine:advice>
</html>
