<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>Kliendi kinnitus</title>
</head>

<body>
Klient on kinnitatud: ${klient.eesNimi} ${klient.pereNimi}, ${klient.vanus}-aastane
<br><br>
postiindeks: ${klient.postiIndeks}, esindusekood: ${klient.esinduseKood}
</body>
</html>