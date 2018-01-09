<%@ page import="student.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: wuqiong6
  Date: 2018/1/8
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        System.out.println(request.getAttribute("students"));
    %>
    <%
        List<Student> students = (List<Student>) request.getAttribute("students");
    %>

    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <th>FlowId</th>
            <th>Type</th>
            <th>IdCard</th>
            <th>ExamCard</th>
            <th>StudentName</th>
            <th>Location</th>
            <th>Grade</th>
            <th>Delete</th>
        </tr>
        <% for(Student student:students){
        %>
            <tr>
                <td><%=student.getFlowId() %></td>
                <td><%=student.getType() %></td>
                <td><%=student.getIdCard() %></td>
                <td><%=student.getExamCard() %></td>
                <td><%=student.getStudentName() %></td>
                <td><%=student.getLocation() %></td>
                <td><%=student.getGrade() %></td>
                <td><a href="deleteServlet?flowId=<%=student.getFlowId()%>">Delete</a> </td>
            </tr>
        <%
        }
        %>
    </table>

</body>
</html>
