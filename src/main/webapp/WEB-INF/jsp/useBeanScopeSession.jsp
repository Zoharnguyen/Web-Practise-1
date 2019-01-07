<html>
	<body>
		<jsp:useBean id="use" class="zohar.spring_mvc.model.User" scope="session"/>		
		Username: <jsp:getProperty property="userName" name="use"/><br>
		Password: <jsp:getProperty property="password" name="use"/>
	</body>
</html>