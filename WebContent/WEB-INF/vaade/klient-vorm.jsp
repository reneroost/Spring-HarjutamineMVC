<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<title>Kliendi registreerimisvorm</title>
	
	<style>
		.error {color: red}
	</style>
</head>

<body>
Täida vorm. Tärniga (*) väljad on kohustuslikud.
<br>
<br>
	<form:form action="tootleVormiKlient" modelAttribute="klient">
		 Eesnimi: <form:input path="eesNimi" />
		 <br><br>
		 Perekonnanimi (*): <form:input path="pereNimi" cssClass="error" />
		 <form:errors path="pereNimi" cssClass="error" />
		 <br><br>
		 <input type="submit" value="Submit" />
	</form:form>
</body>
</html>