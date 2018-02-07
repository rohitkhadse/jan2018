<jsp:useBean id="u" class="com.entity.User" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>


<jsp:getProperty property="username" name="u"/><br> 
<jsp:getProperty property="password" name="u"/><br>
<jsp:forward page="MainServlet"></jsp:forward>>    