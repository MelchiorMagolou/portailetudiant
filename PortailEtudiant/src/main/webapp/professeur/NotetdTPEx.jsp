<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  xmlns:th="http://www.thymeleaf.org"  >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>saisie des notes</title>
</head>
<body>
<center>
<form  th:action="fichier.php" method="get">
<table>
     <tr> <td> Nom et Prenom </td><td><input type="text" name="nom" placeholder="First Name & Last Name"  required></td> </tr>
      <tr> <td> <abbr title="Code d'Etudiant NationaL"> CNE </td><td></abbr>  <input type="number" id="cne" required ></td></tr> 
      <tr> <td> Note TD   </td><td><input type="number" id="td"  required></td></tr>
      <tr> <td> Note TP   </td><td><input type="number" id="tp"  required></td></tr>
      <tr> <td> Note d'examen   </td><td><input type="number" id="td"  required></td></tr>
      <tr> <td> Note de projet   </td><td><input type="number" id="td"  required></td></tr>
      <tr> <td>  <input type="submit" value="Enregistrer"></tr> </td> 
</center>
</table>
</body>
</html>