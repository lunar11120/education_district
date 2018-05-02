<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>school detail</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

	<!-- add this for CSS in resources folder -->
	<spring:url value="/resources/theme1/css/detail_page.css" var="mainCss" />	
	<link href="${mainCss}" rel="stylesheet" />
	
</head>
<body>

	<jsp:include page="../fragments/header.jsp"></jsp:include>
	
	<section id="section3">
	
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
			<!--  Index >> add_school_page -->
			<spring:url value="/" var="home"/>
		    <a href="${home }">หน้าแรก</a>   >>  <a href="#">ข้อมูลโรงเรียน</a><br /><br />  	     
    	 </div>  
    	 	
	<div class="container">
		<p id="topicschool"><span>${school.schoolName }</span></p>
	</div>	
	
	
	<div class="container"><!-- show detail -->
		
		<article class="schooldetail">
		
			<div class="schooldetail_part1">
				<p><label id="lable1">รหัสโรงเรียน</label><span id="span1">${school.schoolID }</span></p>
				<p><label id="lable1">ชื่อโรงเรียน</label><span id="span1">${school.schoolName }</span></p>
				<p><label id="lable1">ประเภท</label><span id="span1">${school.schoolType }</span></p>
				<p><label id="lable1">เขตพื้นที่การศึกษา</label><span id="span1">${school.district.districtName }</span></p>
				<p><label id="lable1">ผู้อำนวยการโรงเรียน</label><span id="span1">${school.schoolDirector }</span></p>
				<p><label id="lable1">จำนวนครูและบุคลากร</label><span id="span1">${school.teacher_and_employee }</span></p>
					
				<p><label id="lable1">Website</label>
				<spring:url value="${school.schoolUrl }" var="website_school"/>
				<span id="span1"><a href="${website_school }">${school.schoolUrl }</a></span></p>						
			</div>
		</article>

	</div> <br />	<!-- end show detail -->


	<div class="container">	
		<table id="link_review">			    
		 <tr><td>     
			 <spring:url value="/" var="home"/> 
			 <a href="${home}" >กลับไปหน้าแรก</a>	 	
		 </td></tr>	        	
		</table>				
	</div>	
	
	</section>
		
	
</body>
</html>