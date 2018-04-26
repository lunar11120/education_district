<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

	<!-- add this for CSS in resources folder -->
	<spring:url value="/resources/theme1/css/home.css" var="mainCss" />	
	<link href="${mainCss}" rel="stylesheet" />
	
</head>
<body>

	<jsp:include page="../fragments/header.jsp"></jsp:include>
	
	<section id="section1"><!-- section 1 -->
	
		<header id="header1">
			<div class="img_logo">
				<spring:url value="/resources/images/banner_logo_p2.jpg" var="image_logo2" />	
				<img src="${image_logo2 }" />
			</div>
		
			<div class="container">
				<p id="system_topic">ระบบบริการข้อมูลสำนักงานเขตพื้นที่การศึกษา</p>
			</div>
	    </header>	
	
	<div class="container">
		<h5>บันทึกข้อมูลเสร็จสิ้น [โรงเรียน :<span>${school.schoolName }</span>]</h5>
	</div>	
	    
	<div class="container">
		
		<h2>School</h2>
		<ul class="list-group">
  			<li class="list-group-item"><label>รหัสโรงเรียน :</label><span>${school.schoolID }</span></li>
  			<li class="list-group-item"><label>โรงเรียน :</label><span>${school.schoolName }</span></li>
  			<li class="list-group-item"><label>ปรเภท :</label><span>${school.schoolType }</span></li>
  			<li class="list-group-item"><label>URL :</label><span>${school.schoolUrl }</span></li>
		</ul>
		
	</div>
	


	<div class="container">	
		<table id="link_review">	
		
		 <tr><td>   <spring:url value="/list_highschool" var="list1"/> 
		    <a href="${list1}" >รายชื่อสถานศึกษา:เขตพื้นที่การศึกษามัธยมศึกษา</a>	</td></tr>
		    
		 <tr><td>     <spring:url value="/list_primaryschool" var="list2"/>
		    <a href="${list2}" >รายชื่อสถานศึกษา:เขตพื้นที่การศึกษาประถมศึกษา</a>	</td></tr>
		    
		 <tr><td>     <spring:url value="/" var="home"/>
		    <a href="${home}" >กลับไปหน้าแรก</a>	 	</td></tr>	        	

		</table>				
	</div>	

	
	</section><!-- End section 1 -->
		
	
</body>
</html>