<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<body>
	<form:form modelAttribute= "uploadForm" action= "uploadonefile" method= "post" enctype="multipart/form-data">
		<form:input path= "files" type= "file"/><br><br>
		<input type= "submit" name="Submit"><br><br>
	</form:form>>
	</body>
</html>