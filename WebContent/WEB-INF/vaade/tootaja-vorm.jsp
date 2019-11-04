<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Töötaja registreerimisvorm</title>
</head>

<body>
	<form:form action="tootleVormi" modelAttribute="tootaja">
	Eesnimi: <form:input path="eesNimi" />
	<br><br>
	Perenimi: <form:input path="pereNimi" />
	<br><br>
	
	<input type="submit" value="Submit" />
	</form:form>
</body>
</html>