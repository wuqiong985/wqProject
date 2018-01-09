<%--
  Created by IntelliJ IDEA.
  User: wuqiong6
  Date: 2017/12/20
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JspA</title>
</head>
<body>
    this is jspA that includes another jsp B<br>
    Doing the include now:<br>
    <jsp:include page="JspB.jsp"/>
    <br> back in page A after the include.
</body>
</html>
