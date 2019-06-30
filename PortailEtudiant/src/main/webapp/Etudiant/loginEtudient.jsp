<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html  xmlns:th="http://www.thymeleaf.org" 
xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout" 
xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity4" 
layout:decorator="template1" >   <!--  ceci est obligatoire dans la balise html -->
<head>
<meta charset="utf-8"/>   
<title>Votre page</title>
</head>
<body>
	<div layout:fragment="content">
		<div class="col-md-6"> <!--  càd , la moitier -->
		
			<div >
				<div > Consultation d'une des notes</div>
				<div >
						
						<form th:action="@{/ConsoltationNMSMI}" methode="get">
							<div>
								<label> CNE: </label>
								<input type="text" name="cne" th:value="${cne}"/>
								<button type="submit" class="btn btn-primary">Ok</button>
							</div>
						</form>
						<div th:if="${exception}"  th:text="${exception.message}" ></div>
				 </div>
			</div>

</body>
</html>