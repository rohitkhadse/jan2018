<!DOCTYPE html>
<%@page import="com.entity.Car"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Cars</title></head>
<body>
<h2>Welcome :</h2>

<%
//  ArrayList<Car> list = (ArrayList<Car>)request.getAttribute("list");
//  System.out.print(list);
//  for(Car car: list){
// 	 out.println(car.getId()+" "+car.getType()+""+car.getYear()+""+car.getColor()+""+car.getModelCompany()+""+car.getModelName()+""+car.getModelPrice());
//  }
 
 ArrayList<Car> sessionlist = (ArrayList<Car>)session.getAttribute("list");
 System.out.print(sessionlist);
 for(Car car: sessionlist){
	 out.println(car.getId()+" "+car.getType()+""+car.getYear()+""+car.getColor()+""+car.getModelCompany()+""+car.getModelName()+""+car.getModelPrice());
 }
%>

</body>
</html>