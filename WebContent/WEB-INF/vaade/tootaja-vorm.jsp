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
	Riik: <form:select path="riik">
		<form:options items="${tootaja.riigiValikud}" />
	</form:select>
	
	<br><br>
	Lemmik keel: 
	Java <form:radiobutton path="lemmikKeel" value="Java" />
	C/C++ <form:radiobutton path="lemmikKeel" value="C/C++" />
	TypeScript <form:radiobutton path="lemmikKeel" value="TypeScript" />
	Python <form:radiobutton path="lemmikKeel" value="Python" />
	Kotlin <form:radiobutton path="lemmikKeel" value="Kotlin" />
	
	<br><br>
	Operatsioonisüsteemid:
	Linux <form:checkbox path="opSusteemid" value="Linux" />
	MacOS <form:checkbox path="opSusteemid" value="MacOS" />
	Windows <form:checkbox path="opSusteemid" value="Windows" />

	<input type="submit" value="Submit" />
	</form:form>
</body>
</html>