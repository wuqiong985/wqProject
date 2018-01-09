<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: wuqiong6
  Date: 2017/12/1
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>beer Result</title>
</head>
<body>
    <h1 align="center"> Beer Recommendations JSP</h1>
    <p>
    <%
    List styles = (List) request.getAttribute("styles");
    Iterator iterator = styles.iterator();
    while(iterator.hasNext()){
        out.print("<br>try: "+ iterator.next());
    }
%>
</body>
</html>
