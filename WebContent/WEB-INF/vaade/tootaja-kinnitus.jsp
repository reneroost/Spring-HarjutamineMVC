<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>Töötaja kinnitus</title>
</head>

<body>
Töötaja on kinnitatud: ${tootaja.eesNimi} ${tootaja.pereNimi}
<br><br>
Riigikood: ${tootaja.riik}
<br><br>
Lemmikkeel: ${tootaja.lemmikKeel}
<br><br>
Operatsioonisüsteemid:
<ul>
	<c:forEach var="ajutine" items="${tootaja.opSusteemid}">
		<li>${ajutine }</li>
	</c:forEach>
</ul>
</body>
</html>