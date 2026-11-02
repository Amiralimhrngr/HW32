<%--
  Created by IntelliJ IDEA.
  User: 110
  Date: 11/2/2026
  Time: 12:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Add Book</title>
</head>
<body>
<h1>Add New Book</h1>
<form method="post" action="${pageContext.request.contextPath}/books/add">
    <label>Title:</label>
    <input type="text" name="title" required>
    <br><br>
    <label>Pages:</label>
    <input type="number" name="pages" min="1" required>
    <br><br>
    <label>Author:</label>
    <select name="authorId" required>
        <c:forEach var="author" items="${authors}">
            <option value="${author.id}"><c:out value="${author.name}"/></option>
        </c:forEach>
    </select>
    <br><br>
    <button type="submit">Submit</button>
</form>
<br>
<a href="${pageContext.request.contextPath}/books">Back to Books</a>
</body>
</html>