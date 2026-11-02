<%--
  Created by IntelliJ IDEA.
  User: 110
  Date: 11/2/2026
  Time: 12:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Authors</title>
</head>
<body>
<h1>All Authors</h1>
<ul>
    <c:forEach var="author" items="${authors}">
        <li>
            ID: <c:out value="${author.id}"/>
            -
            Name: <c:out value="${author.name}"/>
        </li>
    </c:forEach>
</ul>
<a href="${pageContext.request.contextPath}/books">Back to Books</a>
</body>
</html>
