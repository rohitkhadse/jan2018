<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %> 
<%@page import="com.entity.Model"%>
<%@page import="com.entity.User"%>
<%@page import="com.entity.Car"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Cars</title></head>
<body>

<table style = "width:50%" border="1">
<c:forEach var="car" items="${clist}">  
     <tr>
	 <td>${car.getId()}</td>
	 <td>${car.getType()}</td>
	 <td>${car.getYear()}</td>
	 <td>${car.getColor()}</td>
	 <td>${car.model.getModelName()}</td>
	 <td>${car.model.getCompany()}</td>
	 <td>${car.model.getPrice()}</td>
	 </tr>
</c:forEach>  
</table>
 <%
// ArrayList<Car> list = (ArrayList<Car>)request.getAttribute("list");
 ArrayList<Car> list = (ArrayList<Car>)request.getAttribute("clist");
 out.println("Data from Request attribute");
 for(Car car: list){
	 Model m =car.getModel();
 %>
	 <table style = "width:50%" border="1">
	 <tr>
	 <td><%out.print(car.getId());%></td>
	 <td><%out.print(car.getType());%></td>
	 <td><%out.print(car.getYear());%></td>
	 <td><%out.print(car.getColor());%></td>
	 <td><%out.print(m.getModelName());%></td>
	 <td><%out.print(m.getCompany());%></td>
	 <td><%out.print(m.getPrice());%></td>
	 </tr>
	 </table>
<%	 //out.println(car.getId()+" "+car.getType()+""+car.getYear()+""+car.getColor()+""+car.getModelCompany()+""+car.getModelName()+""+car.getModelPrice());
 }
 %>
<a href="B.jsp">Go to B.jsp</a>
</body>
</html>