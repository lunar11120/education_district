<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ระบบบริการข้อมูลสำนักงานเขตพื้นที่การศึกษา:เพิ่มสถานศึกษา</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<link rel="stylesheet" href="<spring:url value="/resources/css/bootstrap-select.min.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<script src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>
	
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
				<p id="system_topic">ระบบบริการข้อมูลสำนักงานเขตพื้นที่การศึกษา : เพิ่มสถานศึกษาในสังกัด</p>
			</div>
	    </header><br/>
	
	 <div class="container">
		<!--  Index >> add_school_page -->
		<spring:url value="/" var="home"/>
		<spring:url value="/school/add" var="addschool"/>
	    <a href="${home }">หน้าแรก</a>   >>    <a href="${addschool }">เพิ่มสถานศึกษาในสังกัด</a> <br /><br />  	     
     </div>
   
	
	 <div class="container">      
        <spring:url value="/school/add_highschool" var="add_highschool"/>     
        <a class="btn btn-default" href="${add_highschool }">
 	             เพิ่มสถานศึกษา : เขตพื้นที่การศึกษามัธยมศึกษา »
        </a>    <br /><br />  
        <spring:url value="/school/add_primaryschool" var="add_primaryschool"/>
	    <a class="btn btn-default" href="${add_primaryschool }">   
      	  เพิ่มสถานศึกษา : เขตพื้นที่การศึกษาประถมศึกษา »
        </a> 	  
     </div>
	    
	</section>
	
</body>	
</html>