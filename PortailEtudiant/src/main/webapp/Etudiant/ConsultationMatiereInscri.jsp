
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form      th:action="@{/ConsultNMatiere}"    methode="get"/ class="table"></br>
CNE:<input type="text" id="cne" name="cne" required="true"/></br>
Email:<input type="email" id="email" name="email" required="true"/></br>
Filiere:<input type="text" id="filiere" name="filiere" required="true"/></br>
<input type="submit"  value="valider" />
</form>

</body>
</html>