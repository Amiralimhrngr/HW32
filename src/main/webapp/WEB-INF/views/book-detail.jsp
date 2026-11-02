<%--
  Created by IntelliJ IDEA.
  User: 110
  Date: 11/1/2026
  Time: 11:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
  <head>
    <title>Book Detail</title>
  </head>
  <body>
  <h1>Book Detail</h1>
  <p>Title: <c:out value="${book.title}"/></p>
  <p>Author Name: <c:out value="${author.name}"/></p>
  <p>Page Count: <c:out value="${book.pages}"/></p>
  <a href="${pageContext.request.contextPath}/books">View All Books</a>
  </body>
</html>