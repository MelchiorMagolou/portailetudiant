<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Emploi De Temps des examens</title>
</head>
<body>
<center><h2><i><u>Emploi De Temps des examens </u></i></h2>
<table border="2"  cellpadding="10" bordercolor="black" class="table">

    <tr  bgcolor="aqua">
        <th>HEURE</th><th>Date</th><th>MATIERE</th><th>Salle</th>
    </tr> 
   <tr th:each="p:${Emplois}">
<td th:text="${p.heure}"></td>
<td th:text="${p.date}"></td>
<td th:text="${p.matiere}"></td>
<td th:text="${p.salle}"></td>
</tr>
 
</html>