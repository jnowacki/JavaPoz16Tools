<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Expression language jest włączony--%>
<%@ page isELIgnored="false" %>
<%--JSTL jest włączony--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<style>
    table, th, td {
        border: 1px solid black;
    }
</style>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
</head>
<body>

<table>
    <tr>
        <td>Id</td>
        <td>Tool name</td>
        <td>Tool type</td>
    </tr>
    <c:forEach items="${requestScope.tools}" var="tool">
        <tr>
            <td>${tool.id}</td>
            <td>${tool.name}</td>
            <td>${tool.type}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
