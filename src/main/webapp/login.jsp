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

<form method="post">
    Login: <input type="text" name="username"> <br/>
    Password: <input type="text" name="password"> <br/>
    <input type="hidden" name="action" value="login">
    <input type="submit" value="Log in">
</form>
<br/>

<c:if test="${requestScope.error}">
    <h1 class="error-message">Dane niepoprawne!</h1>
</c:if>

</body>
</html>
