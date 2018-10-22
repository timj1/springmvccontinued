<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style><%@include file="/WEB-INF/views/css/myStyle.css"%></style>
</head>

<body>

<div class="header">
  <h2>Header</h2>
</div>




<div class="row">
  <div class="column side" style="background-color:#aaa;">Column</div>

  <div class="column middle" style="background-color:#bbb;">
        <c:set var="rootContext" value="${pageContext.request.contextPath}/"/>

        <p><c:out value="${webBeans}"/></p>
        <br/>
        <a href="${rootContext}second-page">second-page</a>
  </div>

  <div class="column side" style="background-color:#ccc;">Column</div>

</div>

<div class="footer">
  <p>Footer</p>
</div>

</body>

</html>