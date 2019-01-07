<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
	<body >
		<form:form action="check" modelAttribute="user">
			Username(*): <form:input path="userName"/>
			<form:errors path="userName" cssClass="error"/><br><br><br>
			Password(*): <form:password path="password"/>						
			<form:errors path="password" cssClass="error"/><br><br><br>		
			Gender: 
			male <form:radiobutton path="gender" value="Male"/>
			famale <form:radiobutton path="gender" value="Famale"/>
			<br><br><br>
			Meals:
			BreakFast<form:checkbox path="food" value="Bread"/>
			Lunch<form:checkbox path="food" value="Rice"/>
			Dinner<form:checkbox path="food" value="Fruit"/>
			<br><br><br>
			From City<form:select path="cityFrom">
				<form:option value="Ha Noi" label="Ha Noi"/>
				<form:option value="Ho Chi Minh" label="Ho Chi Minh"/>
				<form:option value="Ha Long" label="Ha Long"/>
			</form:select>
			Going to City<form:select path="cityTo">
				<form:option value="New York" label="New York"/>
				<form:option value="Lon Don" label="Lon Don"/>
				<form:option value="L.A" label="L.A"/>
			</form:select>
			<br><br><br>
			<input type="submit" name="Submit">
		</form:form>
	</body>
</html>