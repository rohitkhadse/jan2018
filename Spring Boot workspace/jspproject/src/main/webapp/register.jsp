<html>
<title>Register</title>
<body>
	<h2>Register</h2>
	<%
		out.print("Be a part of us");
	%>
	<form name="myform" action="registerProcess.jsp" method="post">
  	Username : <input type="text" name="userName"><br>
  	Password :<input type="password" name="password"><br>
      
  <input type="submit" name="submitButton" value="Register">
  </form>
</body>
</html>