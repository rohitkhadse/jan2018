<!DOCTYPE html>
<%@page import="com.entity.User"%>
<%@page import="com.entity.Car"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Cars</title></head>
<body>
<h2>Welcome :<% User u=(User)session.getAttribute("u");%>
<%= u.getUsername() %>
</h2>

<%
 ArrayList<Car> list = (ArrayList<Car>)request.getAttribute("list");
 out.println("request");
 for(Car car: list){
	 out.println(car.getId()+" "+car.getType()+""+car.getYear()+""+car.getColor()+""+car.getModelCompany()+""+car.getModelName()+""+car.getModelPrice());
 }
 
 ArrayList<Car> sessionlist = (ArrayList<Car>)session.getAttribute("list");
 out.println("Session");
 for(Car car: sessionlist){
	 out.println(car.getId()+" "+car.getType()+""+car.getYear()+""+car.getColor()+""+car.getModelCompany()+""+car.getModelName()+""+car.getModelPrice());
 }
%>
<a href="B.jsp">Click here</a>
</body>
</html>