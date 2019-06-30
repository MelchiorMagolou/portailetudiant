<!DOCTYPE html>
<html  xmlns:th="http://www.thymeleaf.org" 
xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout" 
xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity4" 
layout:decorator="template1" >   <!--  ceci est obligatoire dans la balise html -->
<head>
<meta charset="utf-8"/>   
<title>Votre palaning</title>
</head>
<body>
<center><h2><i><u>le palaning </u></i></h2>
<table border="2"  cellpadding="10" bordercolor="black">
  <thead>
  <tr>
  <th>heure</th><th>cours</th><th>TD/TP</th><th>salle</th> </tr> 
  <tr th:each="p:${planing}">
<td th:text="${p.heure}"></td>
<td th:text="${p.cours}"></td>
<td th:text="${p.td}${p.tp}"></td>
<td th:text="${p.salle}"></td>
</tr>
  </thead>
  <tbody>
    
    </tbody>
    </center>
</body>
</html>