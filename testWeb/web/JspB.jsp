%--
  Created by IntelliJ IDEA.
  User: wuqiong6
  Date: 2017/12/20
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="myTags" uri="simple6" %>
<html>
<head>
    <title>JspB</title>
</head>
<body>
    This is page B that invokes the tag that throws SkipPageException.
    Invoking the tag now:<br>
    <myTags:simple7/>
    <br> Still in Page B after Exception.
</body>
</html>
