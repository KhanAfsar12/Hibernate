<%@page import="java.util.Date"%>
<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<html>
<body>
<h2> This is a first program of JSP</h2>

<%= "Welcome"+request.getParameter("Asfar") %>

<form action="welcome.jsp">
<input type="Text" name="Username"/><br/>
<input type="Submit" value="go"/>
</form>
</body>


</html>