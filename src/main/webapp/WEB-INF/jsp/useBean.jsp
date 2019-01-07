<html>
	<body>
		<jsp:useBean id="use" class="zohar.spring_mvc.model.User" scope="session">			
		</jsp:useBean>
		<jsp:setProperty property="userName" name="use" value="Demo"/>
		<jsp:setProperty property="password" name="use" value="I don't know"/>
		<a href="useBeanScopeSession">Forward to page2</a>
	</body>
</html>