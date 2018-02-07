<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<html>
<title>Display Page</title>
<body>
	<h2>Home page</h2>
	<%@ page import="com.dealer.connection.*"%>

	<%
		out.print("Welcome " + session.getAttribute("user"));
	
		if (ExcuteQuery.isAdmin((String) session.getAttribute("user"))) {
			out.print("<table width=50% border=1>");
			out.print("<caption>Car</caption>");
			ResultSet rs = null;

			try {
				rs = ExcuteQuery.displayCar();
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnCount = rsmd.getColumnCount();
				out.print("<tr>");
				for (int i = 1; i <= columnCount; i++) {
					out.print("<th>" + rsmd.getColumnName(i) + "</th>");
				}
				out.print("</tr>");
				while (rs.next()) {
					out.println("<tr><td>" + rs.getString(1) + "</td>" + "<td>" + rs.getString(2) + "</td><td>"
							+ rs.getString(3) + "</td><td>" + rs.getString(4) + "</td><td>" + rs.getString(5)
							+ "</td><td>" + rs.getString(6) + "</td>" + "<td><button>Edit</button></td>"
							+"<td><form action=\"delete.jsp\" method=\"post\">"
							+"<input type=\"hidden\" name=\"id\" value=\""+rs.getInt("carID")+"\"/>"
							+"<input type=\"submit\" value=\"Delete\"></td></tr>");

				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			out.print("</table>");
	%>
	<a href="addcar.jsp"><input type="button" value="Add Car"></a>
	<%
		} else {
			out.print("<table width=50% >");
			out.print("<caption>Car</caption>");
			ResultSet rs = null;

			try {
				rs = ExcuteQuery.displayCar();
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnCount = rsmd.getColumnCount();
				out.print("<tr>");
				for (int i = 1; i <= columnCount; i++) {
					out.print("<th>" + rsmd.getColumnName(i) + "</th>");
				}
				out.print("</tr>");
				while (rs.next()) {
					out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>"
							+ rs.getString(3) + "</td><td>" + rs.getString(4) + "</td><td>" + rs.getString(5)
							+ "</td><td>" + rs.getString(6) + "</td></tr>");

				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			out.print("</table>");
		}
	%>
	
	<a href="logout.jsp">Logout</a>

</body>
</html>