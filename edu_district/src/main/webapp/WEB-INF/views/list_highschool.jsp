<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List HighSchool</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

	<!-- add this for CSS in resources folder -->
	<spring:url value="/resources/theme1/css/home.css" var="mainCss" />	
	<link href="${mainCss}" rel="stylesheet" />
</head>
<body>
		<jsp:include page="../views/fragments/header.jsp"></jsp:include>
	
	<section id="section1"><!-- section 1 -->
	
	<div class="container">
		
		<h2>High School List</h2>
		<table class="table table-hover">
			<tbody>
				<tr>
					<th>School ID</th> <th>School name</th> <th>ประเภทโรงเรียน</th>
				</tr>
				<c:forEach items="${schools }" var="schools">
					<tr>
						<!-- List of HighSchool-->
						<td>${schools.id}</td>						
						<td>${schools.schoolName }</td>
						<td>${schools.schoolType }</td>
					</tr>	
				</c:forEach>
			</tbody>
		</table>		
	</div>	
	
	</section>

<!--  
<table><tr>
<td><a href="<c:url value='/edit/${person.id}' />" >Edit</a></td>
<td><a href="<c:url value='/remove/${person.id}' />" >Delete</a></td>  </tr>
</table>
-->

</body>
</html>