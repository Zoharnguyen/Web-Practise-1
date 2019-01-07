<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<html>
<body>
	<h1>File upload Success</h1>
	<ul>
		<c:forEach var="file" items="${uploadSucess}">
		<li>${file}</li>
		</c:forEach>
	</ul>
	<h1>File upload fail</h1>
	<ul>
		<c:forEach var="file" items="${uploadfail}">
		<li>${file}</li>
		</c:forEach>
	</ul>
</body>
</html>