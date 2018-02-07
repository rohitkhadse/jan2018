<html>
  <title>Add car</title>
  <body>
  <%out.print("Add car to database");%>  
  <form name="addcarform" action="MainServlet" method="post">
  <input type="hidden" name="login" value="loginform">
  Car ID : <input type="number" name="carid"><br>
  Color : <input type="text" name="color"><br>
  Year : <input type="number" name="year"><br>
  Type : <input type="text" name="type"><br>
  Model id :<input type="number" name="modelid"><br> 
      
  <input type="submit" name="submitButton" value="submit">
  </form>
  </body>
</html>