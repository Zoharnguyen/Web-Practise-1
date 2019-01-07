<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<form:form modelAttribute= "uploadForm" action="uploadmultifile" method="post"
		enctype="multipart/form-data">		
		Select file 1: 
		<form:input path="files" type="file"/>
		<br>
		<br>
		Select file 2:
		<form:input path="files" type="file"/>
		<br>
		<br>
		Select file 3:
		<form:input path="files" type="file"/>
		<br>
		<br>
		<input type="submit" name="Submit">
	</form:form>
</body>
</html>