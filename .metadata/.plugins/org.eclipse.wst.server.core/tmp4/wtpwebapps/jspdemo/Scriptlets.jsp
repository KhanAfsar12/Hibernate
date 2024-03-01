<html>
<body>
 <%
for(int i=0; i<10; i++){
	out.println("<br/>I realy love code: "+ i);
}
%>
<%!
String name(String data){
	return data.toLowerCase();
}
%>
<br><br>
Lower case for "AFSAR"  :<%= name("Afsar") %>
<br/>

</body>

</html>