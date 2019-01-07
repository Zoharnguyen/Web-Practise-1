<html>
	<body>
		<h2>This is page includeJsp</h2>
		<jsp:include page="includeJsp2.jsp">
			<jsp:param value="That's value of param" name="value"/>
		</jsp:include>
		<h2>The end.</h2>
	</body>
</html>