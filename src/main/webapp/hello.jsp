<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form:form method="POST" action="addUser" modelAttribute="user">
        <form:label path="name">
            user name
        </form:label>
        <form:input path="name"/>
        <input type="submit" name="submit" value="GO!">
    </form:form>
    <c:forEach var="user" items="${users}">
        ${user.name}
        <br>
    </c:forEach>
</body>
</html>