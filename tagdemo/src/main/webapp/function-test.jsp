<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<body>
<c:set var="data" value="AfsarSoft Solution"/>
Length of the String<b>${data}</b>: ${fn:length(data)}
<br/><br/>
UpperCase version of the String<b>${data}</b>:${fn:toUpperCase(data)}
<br/><br/>
Does the String<b>${data}</b>is Starts with<b>Afsar</b>?: ${fn:startsWith(data,"Afsar")}

</body>
</html>