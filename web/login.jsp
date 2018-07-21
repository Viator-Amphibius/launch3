<%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 21-Jul-18
  Time: 06:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1 align="center"> Hello, Please Login:</h1>
    <form action="/login" method="post">
        username: <input type="text" name="loginname" width="30">
        password: <input type="password" name="loginpassword" width="10">
        <input type="submit" value="login">
    </form>
    <p style="color: red">${errorMessage}</p>
</body>
</html>
