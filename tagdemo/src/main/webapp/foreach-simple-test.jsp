<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String[] cities = {"Mumbai","Tashkent","Mosul","Honkong"};
pageContext.setAttribute("MyCities", cities);
%>
<html>
<body>
<c:forEach var="tempCity" items="${MyCities}">
   ${tempCity}<br/> 
   </c:forEach>
</body>
</html>