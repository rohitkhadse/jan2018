<jsp:useBean id="u" class="com.entity.User" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<jsp:forward page="MainServlet"></jsp:forward>