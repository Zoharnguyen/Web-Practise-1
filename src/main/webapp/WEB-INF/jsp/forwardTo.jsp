<%@page import="java.util.Calendar"%>
<html>
	<body>
		<h2>This is forwardTo page</h2>
		<%= request.getParameter("word") %><br>
		Today is: <%= Calendar.getInstance().getTime()%>
	</body>
</html>