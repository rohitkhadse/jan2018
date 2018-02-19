<!DOCTYPE html>
<%@page import="com.entity.Model"%>
<%@page import="com.entity.User"%>
<%@page import="com.entity.Car"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Cars</title></head>
<body>
<jsp:useBean id="u" class="com.entity.User" scope="session"></jsp:useBean>
<jsp:getProperty name = "u" property = "username"/>

<%out.println(request.getAttribute("msg")); %>


 <%
 ArrayList<Car> list = (ArrayList<Car>)request.getAttribute("list");
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
 
<%--  ArrayList<Car> sessionlist = (ArrayList<Car>)session.getAttribute("list");
 out.println("Data from Session attribute");
 for(Car car: sessionlist){
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
%> --%>
<a href="B.jsp">Go to B.jsp</a>
</body>
</html>