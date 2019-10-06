<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Expression language jest włączony--%>
<%@ page isELIgnored="false" %>
<%--JSTL jest włączony--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
</head>
<body>

<table>
    <tr>
        <td>Id</td>
        <td>Tool name</td>
        <td>Tool type</td>
        <td>Availability</td>
        <td>Toggle</td>
    </tr>
    <c:forEach items="${requestScope.tools}" var="tool">
        <tr>
            <td>${tool.id}</td>
            <td>${tool.name}</td>
            <td>${tool.type}</td>
            <td class="${tool.available ? 'green' : 'red'}"></td>
            <td>
                <form method="post">
                    <input type="hidden" name="toolAvailability" value="${!tool.available}">
                    <input type="hidden" name="toolId" value="${tool.id}">
                    <input type="submit" value="Toggle">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
