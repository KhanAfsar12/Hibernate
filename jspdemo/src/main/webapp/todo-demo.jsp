<%@ page import="java.util.*" %>
<html>
<body>
<form action="todo-demo.jsp">
Add new item:<input type="text" name="TheItem"/>
             <input type="submit" name="submit"/>
</form>
<br>
Item entered: <%=request.getParameter("TheItem") %>

<% 
// get the To Do item from the session.
List<String> items =(List<String>) session.getAttribute("MyToDoList");

// if the To Do items doesn't exist, then create a new one.
if(items == null){
	items = new ArrayList<String>();
	session.setAttribute("MyToDoList",items);
}

// see if there is form data to add
String TheItem = request.getParameter("TheItem");
if(TheItem != null){
	items.add(TheItem);
}
%>

<hr>
<br> To list item:<br/><br/>
<ol>
<% 
  for(String Temp : items){
  out.println("<li>"+ Temp + "</li>");
  }
%>
</ol>
</body>
</html>