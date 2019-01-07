<html>
	<body>
		<form action="welcome">
			Username: <input type="text" name="username"><br/>
			<input type="submit" name="Submit">
			<a href="welcome.jsp">welcome</a>
		</form>		
		<%session.setAttribute("name", "Nguyen"); %>
		<%pageContext.setAttribute("pass", "I don't no", pageContext.SESSION_SCOPE);%>
	</body>
</html>