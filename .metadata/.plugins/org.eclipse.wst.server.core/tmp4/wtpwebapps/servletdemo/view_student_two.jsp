<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

<h2>Student Table Demo</h2>
<hr>
<br/>

<table border="10">

<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email Address</th>
</tr>

<c:forEach var="address" items=${student_list}>
<tr>
<td>${address.firstName}</td>
<td>${address.lastName}</td>
<td>${address.Email}</td>
</tr>

</c:forEach>



</table>

</body>
</html>