<html>
	<body>
		<%= "Welcome " + request.getParameter("username")%><br>	
		<% out.print("Name: "+session.getAttribute("name")); %><br>
		<%= "Pass: "+ pageContext.getAttribute("pass", pageContext.SESSION_SCOPE) %>
		<% 
			this.log("message2 ");
		%>
	</body>
</html>