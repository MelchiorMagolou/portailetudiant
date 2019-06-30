<!DOCTYPE html>
<html  xmlns:th="http://www.thymeleaf.org"  >
<head>
<meta charset="UTF-8"/>
<title>saisies des dates d’examen pour toutes les matières</title>
</head>
<body>
<div>
<form  th:action="@{/}" methode="get">
<label for="matiere"> Matieres</label>
<input type="text"  id="dat" /><br>
<label for="dat">Date d'examen</label>
<input type="date"  id="dat" />
<button type="submit">valider</button>
</form>
</div>
</body>
</html>