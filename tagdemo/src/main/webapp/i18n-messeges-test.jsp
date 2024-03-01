<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:set var="theLocale"
value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}"
scope="session"/>

<fmt:setLocale value="${theLocale}"/>
<fmt:setBundle basename="tagdemo.com.i18n.resources.mylabels"/>

<html>
<body>
<a href="i18n-messeges-test.jsp?thelocale=en_US">English (US)</a>
 |
<a href="i18n-messeges-test.jsp?thelocale=es_ES">Spanish (ES)</a>
 |
<a href="i18n-messeges-test.jsp?thelocale=de_DE">German (DE)</a>
<hr>

<fmt:message key="label.greeting"/><br/><br/>
<fmt:message key="label.firstname"/>  <i>Afsar</i>  <br/>
<fmt:message key="label.lastname"/>   <i>Khan</i>   <br/>
<fmt:message key="label.welcome"/>    <br/>
<hr>

Selected locale:${theLocale}
<hr>
</body>
</html>