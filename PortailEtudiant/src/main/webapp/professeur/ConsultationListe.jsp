<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8">
<link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
<h3>liste des etudiants</h3>
<div class="container">

<table class="table" >
<thead>
<tr><th>CNE</th><th>NOM</th><th>PRENOM</th></tr>
</thead>
<tbody>
<tr><td>12345</td><td>Ahmed</td><td>Ali</td></tr>
<tr><td>45678</td><td>Ben Ali</td><td>Ayoub</td></tr>
<tr><td>98765</td><td>Tahiri</td><td>Mohemed</td></tr>
<tr th:each="p:${listesEdudiants}">
<td th:text="${p.cne}"></td>
<td th:text="${p.nom}"></td>
<td th:text="${p.prenom}"></td></tr>
</tbody>
</table>
</div>
</body>
</html>