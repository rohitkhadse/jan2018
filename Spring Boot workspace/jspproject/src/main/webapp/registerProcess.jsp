<%@ page import="com.dealer.connection.*"%>
<%
String username = request.getParameter("userName");
String password = request.getParameter("password");

if(ExcuteQuery.addUser(username, password)==1)
	out.print("Successfully Register");
%> 
<jsp:include page="login.jsp" />  