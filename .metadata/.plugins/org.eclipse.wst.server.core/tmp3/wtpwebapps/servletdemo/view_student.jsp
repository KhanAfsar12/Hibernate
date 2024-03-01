<%@page import="com.luv2code.servletdemo.Sahil"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>

<c:forEach var="tempStudent" items="${student_list}">
    ${tempStudent} <br/>
</c:forEach>

<% Sahil sahil =(Sahil)request.getAttribute("object");%>

<h1><%=sahil.getId()%></h1>
<h1><%=sahil.getName()%></h1>
<h1><%=sahil.getEmail()%></h1>

</body>
</html>