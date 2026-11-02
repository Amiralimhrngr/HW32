<%--
  Created by IntelliJ IDEA.
  User: 110
  Date: 11/1/2026
  Time: 11:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Books</title>
</head>
<body>
<h1><c:out value="${libraryName}"/></h1>
<h2>Book List</h2>
<c:forEach var="book" items="${books}">
    <h3><c:out value="${book.title}"/></h3>
    <p>Author: <c:out value="${authorNames[book.authorId]}"/></p>
    <p>Pages:<c:out value="${book.pages}"/></p>
    <a href="${pageContext.request.contextPath}/books/detail?id=${book.id}">View Details</a>
    <hr>
</c:forEach>
<br>
<a href="${pageContext.request.contextPath}/books/add">Add New Book</a>
<br><br>
<a href="${pageContext.request.contextPath}/authors">View All Authors</a>
</body>
</html>
