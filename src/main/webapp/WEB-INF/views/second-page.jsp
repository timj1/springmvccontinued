<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
<style><%@include file="/WEB-INF/views/css/myStyle.css"%></style>
</head>

<body>
<c:set var="rootContext" value="${pageContext.request.contextPath}/"/>

<h1>${msg}</h1>
<p>Hello again</p>
<p id="p1">Hello css id</p>

<c:out value="${varModel}"/> <br/>
<a href="${rootContext}">front-page</a>

<form:form method="POST" action="${rootContext}">
    <input name="request"/>
    <input type="submit" value="submit value"/>
</form:form>

<table>
    <tr>
        <td>Element 1</td>
        <td>Element 2</td>
    </tr>
    <tr>
        <td>Element 3</td>
        <td>Element 4</td>
    </tr>
</table>

</body>

</html>
