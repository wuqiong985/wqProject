<%--
  Created by IntelliJ IDEA.
  User: wuqiong6
  Date: 2017/12/7
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title1</title>
</head>
<body>
    <jsp:useBean id="person" type="UseBeanTest.Employee" scope="request">
        <%--<jsp:setProperty name="person" property="name" value="Fred"/>--%>
    </jsp:useBean>

    name is :<jsp:getProperty name="person" property="name"/>
</body>
</html>
