<html>
<head><title>Confirmation Page</title></head>
<!--comment-->

<%
           //read form data
String favlang = request.getParameter("favoritelanguage");

          //create cookie data
Cookie ck = new Cookie("myApp.favoritelanguage",favlang);
          
          //set life life span....... total number of seconds(yuk!)
ck.setMaxAge(60*60*24*365);
          
          //send cookies to browser
response.addCookie(ck);
%>

<body>
Thanks! we set your favorite programming language: ${param.favoritelanguage}
<br/><br/>

<a href="cookies-hamepage.jsp"> Return to home page. </a>

</body>

</html>