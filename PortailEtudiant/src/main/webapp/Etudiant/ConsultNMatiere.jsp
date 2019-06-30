<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Moyenne des modules</title>
</head>
<%--  <body>
<table border="2">
<tr><th>Etudiant</th><th>Module</th><th>Moyenne</th></tr>
<tr><td></td><td bgcolor="aqua">Algebre1</td><td>12</td></tr>
<tr><td></td><td bgcolor="aqua">Mecanique de point</td><td>14</td></tr>
<tr><td></td><td bgcolor="aqua">Analyse</td><td>7</td></tr>
<tr><td></td><td bgcolor="aqua">informatique</td><td>16</td></tr>
<tr><td></td><td bgcolor="aqua">thermodynamique</td><td>13</td></tr>
<tr><td></td><td bgcolor="aqua">LTI</td><td>11</td></tr>
</table>
</body>
--%>


      
 <table class="table" border="2">

<tr><th  bgcolor="aqua" >Etudiant</th><th  bgcolor="aqua">Module</th><th  bgcolor="aqua">Moyenne</th></tr>
<tr th:each="p:${listesMatieres}">
<td th:text="${p.etudiant}"></td>
<td th:text="${p.module}"></td>
<td th:text="${p.moyenne}"></td>
</tr>
</table>


</html>