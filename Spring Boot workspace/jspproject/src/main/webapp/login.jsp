<html>
  <title>Login</title>
  <body>
  <%out.print("Login Page");%>  
  <form name="MY Form" action="welcome.jsp" method="post">
  Username : <input type="text" name="userName"><br>
  Password : <input type="password" name="password"><br>
      
  <input type="submit" name="submitButton" value="login">
  </form>
  <%= request.getParameter("name") %>
  </body>
</html>