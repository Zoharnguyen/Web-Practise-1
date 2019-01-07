<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<html>
	<body>
	<h1>Hello </h1>
	<h1> UserName= ${user.userName}</h1>
	<h1> Password= ${user.password}</h1>
	<h1> Gender= ${user.gender}</h1>
	<h1> Meals:</h1>
	<ul>
		<c:forEach var="meal" items="${user.food}">
		<li>${meal}</li>
		</c:forEach>
	</ul>
	<h1>From City ${user.cityFrom}</h1>
	<h1>Going to City ${user.cityTo}</h1>
	<h1>Welcome to Page</h1>
	<a href= "page1">View page1</a> 
	<br><br>
	<a href= "imageVideo">View page image video</a>
	</body>
</html>