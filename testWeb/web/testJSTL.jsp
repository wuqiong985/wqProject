
<%--
  Created by IntelliJ IDEA.
  User: wuqiong6
  Date: 2017/12/11
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<%--%>
        <%--String currentTip = request.getParameter("currentTip");--%>
    <%--%>--%>

    <div>
        <b>Tip of the Day:</b> <br/> <br/>
        <%--${pageContext.currentTip}--%>
        <%--<%=currentTip%>--%>
        <c:out value="<b></b> hello" escapeXml="true" />
    </div>
</body>
</html>
