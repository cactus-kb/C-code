<%@ page import="com.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    private int a;
    private int b;

    private void someMethod() {
    }
%>
<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("/login.html");
        return;
    }
%>
<html>
<head>
    <title>发布文章</title>
</head>
<body>
<h1><%= user.getNickname() %></h1>
<form method="post" action="/publish">
    <input type="text" name="title">
    <textarea name="content"></textarea>
</form>
</body>
</html>
