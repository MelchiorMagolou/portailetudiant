<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  xmlns:th="http://www.thymeleaf.org"  >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>saisie des informations des étudiants</title>

</head>
<fieldset>
<form  th:action="" method="get">
<table classe="table">
     <tr> <td> Nom  </td><td><input type="text" name="nom" placeholder="First Name"  required></td> </tr>
     <tr> <td>  Prenom  </td><td><input type="text" name="prenom" placeholder="Last Name" required></td></tr> 
     <tr> <td> <abbr title="Code d'Etudiant NationaL"> CNE </td><td></abbr>  <input type="number" name="cne" required ></td></tr> 
     <tr> <td> <abbr title=" Code d'Identite National">CIN </td><td></abbr>  <input type="text" name="cin" required > </td></tr>
     <tr> <td> Date de Naissance </td><td> <input type="date" name="date" required> </td></tr>
     <tr> <td>  E-mail </td><td> <input type="email" name="email" placeholder="Pseudo@hotmail.com" required></td></tr> 
     <tr> <td>  Votre Ville :</td><td> <input list="ville" type="text" id="choix-ville"> <br> 
                       <datalist id="ville">
                        <option value="Ouarzazate"> </option>
                        <option value="Casa"> </option>
                        <option value="Fes"> </option>
                        <option value="Meknes"> </option>
                        <option value="Rabat"> </option>
                        <option value="Tanger"> </option>
                        <option value="Tinghir"> </option>
                       </datalist> </td></tr>
         <tr> <td>    Filiere : </td><td><input type="text" name="filiere"   required> </td></tr>
        <tr> <td>  <input type="submit" value="Enregistrer"></tr> </td> 
         </table>    
      </form>
      </fieldset>
<body>

</body>
</html>