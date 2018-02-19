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
</body>
</html>