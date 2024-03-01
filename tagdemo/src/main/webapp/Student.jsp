<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import = "java.util.*,tagdemo.com.Student" %>

<%  
List<Student> data = new ArrayList<>();
data.add(new Student("Afsar","Khan",true));
data.add(new Student("Ishtiyaque","Hussain",false));
data.add(new Student("Sahil","Siddique",true));
data.add(new Student("Abrar","Khan",true));

pageContext.setAttribute("Information",data);
%>
<html>
<body>
<table border="10">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Gold Customer</th>
</tr>
<c:forEach var="tempStudent" items="${Information}">
<tr>
		 <td>${tempStudent.firstName}</td>
		 <td>${tempStudent.lastName}</td>
		 <td>${tempStudent.goldCustomer}</td>
</tr>
</c:forEach>
</table>
</body>
</html>