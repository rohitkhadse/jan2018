<%@page import="com.dealer.connection.ExcuteQuery"%>
<%
ExcuteQuery.delete(Integer.parseInt(request.getParameter("id")));
response.sendRedirect("display.jsp");
%>