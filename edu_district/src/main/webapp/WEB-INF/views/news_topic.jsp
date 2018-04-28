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

	<jsp:include page="../views/fragments/header.jsp"></jsp:include>
	
	<section id="section1"><!-- section 1 -->
	
		<header id="header1">
			<div class="img_logo">
				<spring:url value="/resources/images/banner_logo_p1.jpg" var="image_logo2" />	
				<img src="${image_logo2 }" />
			</div>
		
			<div class="container">
				<p id="system_topic">ระบบบริการข้อมูลสำนักงานเขตพื้นที่การศึกษา</p>
			</div>
	    </header>	
	
	 <div class="container">
		<!--  Index >> add_school_page -->
		<spring:url value="/" var="home"/>
		<spring:url value="/school/add" var="addschool"/>
	    <a href="${home }">หน้าแรก</a>   >>    ข่าวกลุ่มงานสารสนเทศ สำนักนโยบายและแผนฯ   <br /><br />  	     
     </div>
	    
	<div class="container">		
		<h2>News</h2>
		<ul class="list-group">
			<li class="list-group-item"><label>หัวข้อข่าว :</label><span>${news_topic.topic }</span></li>
  			<li class="list-group-item"><label>วันที่:</label><span>${news_topic.topicDate }</span></li>
  			<li class="list-group-item"><label>เนื้อหาข่าว :</label><span>${news_topic.newsDetail }</span></li>
		</ul>		
	</div>
	
	<div class="container">			    
	        <spring:url value="/" var="home"/>
		    <a href="${home}" >กลับไปหน้าแรก</a>	 	
	</div>	

	
	</section><!-- End section 1 -->
	
	<div id="buttom1">		
		<p>จัดทำโดย สำนักนโยบายและแผนฯ กลุ่มสารสนเทศ สำนักนโยบายและแผนการศึกษาขั้นพื้นฐาน สำนักงานคณะกรรมการการศึกษาขั้นพื้นฐาน</p>	
		<p>Contact Webmaster Email: ifcec@obec.ifec.go.th</p>	
	</div>	

	
	
</body>
</html>