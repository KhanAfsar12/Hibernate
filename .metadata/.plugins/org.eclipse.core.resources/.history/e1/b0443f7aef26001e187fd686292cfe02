<html>
<head><title>Student confirmation title</title></head>

<body>
The student is confirmed:<%=request.getParameter("first_name") %>
<%= request.getParameter("last_name") %>
<br/><br/>

The favorite Programming Language is:<br/>
<ul>
<%
String[] args = request.getParameterValues("favoritelanguage");

for(String all : args){
	out.println("<li>"+ all + "</li>");
}

%>

</ul>
</body>

</html>