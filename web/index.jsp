<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: khale
  Date: 21-Jul-18
  Time: 06:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Trials</title>
  </head>
  <body>
    <h1>HELLO!</h1>
    <p>Some random text</p>
  <%
      Date d1 = new Date();
      out.print("<p>" + d1.toString() +"</p>");
  %>

  </body>
</html>
