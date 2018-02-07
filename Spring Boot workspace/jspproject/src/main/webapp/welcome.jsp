<html>
<title>Welcome Page</title>
<body>
	
	<%@ page import="com.dealer.connection.*"
		import="org.apache.logging.log4j.LogManager"
		import="org.apache.logging.log4j.Logger"%>
	<%!final static Logger logger = LogManager.getLogger("welcome.jsp");%>
	<%
		String username = request.getParameter("userName");
		String password = request.getParameter("password");

		if (ExcuteQuery.validate(username, password)) {
			session.setAttribute("user", username);
			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);
			
		} else {
			
			logger.error("Username " + username + " or passwoord " + password + " is wrong");
			
			//response.sendRedirect("login.jsp");
			//RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			//rd.include(request, response);
			%>
			<jsp:forward page="login.jsp">
				<jsp:param name="name" value="Sorry UserName or Password Error!"/>
			</jsp:forward>
			<%
		}
	%>

</body>
</html>