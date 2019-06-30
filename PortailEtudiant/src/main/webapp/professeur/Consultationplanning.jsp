<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<center>
<h1> La saisie des informations necessaires au PLANNING</h1>
	<form action="" method="post">
		<fieldset style="width:300px">
			<legend>Information planning</legend>
			<table>
				<tr>
					<td> Day :</td>
					<td><input type="text" name="date" value="" ></td>
				</tr>
				<tr>
					<td>Time:</td>
					<td><input type="text" name="time" value="" /></td>
				</tr>
			</table>
			<hr />

			<table>
				<tr>
					<td>Room :</td>
					<td><input type="text" name="room" value="" /></td>
				</tr>
				<tr>
					<td>TD :</td>
					<td><input type="text" name="td" value="" /></td>
				</tr>
				<tr>
					<td>TP :</td>
					<td><input type="text" name="tp" value="" /></td>
				</tr>
				<tr>
					<td>COURSE:</td>
					<td><input type="text" name="course" value="" /></td>
				</tr>
				<tr>
					<td>PROJECT :</td>
					<td><input type="text" name="project" value="" /></td>
				</tr>
				<tr>
					<td>EXAM :</td>
					<td><input type="text" name="exam" value="" /></td>
				</tr>
				<tr>
					<td>PROF :</td>
					<td><input type="text" name="prof" value="" /></td>
				</tr>
				<tr>
					<td>MODULE :</td>
					<td><input type="text" name="module" value="" /></td>
				</tr>
				</table>
				<input type="submit" value="Valider"/>
				</fieldset>
				
	</form>
		</center>		
</body>
</html>