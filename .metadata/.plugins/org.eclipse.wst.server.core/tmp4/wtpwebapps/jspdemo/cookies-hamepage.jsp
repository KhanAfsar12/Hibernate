<html>
<body>
 <h3>Training Portal</h3>
   <!--  read the favorite programming language cookies-->
  <%
       //The default if there are no cookies
    String favlang = "Java";
 
      // Get the cookies from the browser request
   Cookie[] thecookies = request.getCookies();
      
      // find the our favorite language coockie
   if(thecookies != null){
	   for(Cookie ck : thecookies){
		   if("myApp.favoritelanguage".equals(ck.getName()));
		   favlang = ck.getValue();
		   break;
	   }
   }
  %>
  
  <!-- now show apersonalized page... use the  "favlang" variable-->
  <!-- show new books for this favlang -->
  <h4>new book for<%= favlang %></h4>
  <ul>
  <li>how how how</li>
  <li>how how how</li>
  </ul>
  
    <h4>new topics for<%= favlang %></h4>
  <ul>
  <li>how how how</li>
  <li>how how how</li>
  </ul>
  
    <h4>new language for<%= favlang %></h4>
  <ul>
  <li>how how how</li>
  <li>how how how</li>
  </ul>
  
  <hr>
  <a href="coockies-personalize-form.html">Personalize this page</a>
</body>
</html>