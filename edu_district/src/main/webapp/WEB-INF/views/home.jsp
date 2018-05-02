<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ระบบบริการข้อมูลสำนักงานเขตพื้นที่การศึกษา</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

	<!-- add this for CSS in resources folder -->
	<spring:url value="/resources/theme1/css/home.css" var="mainCss" />	
	<link href="${mainCss}" rel="stylesheet" />
	
</head>
<body>

	<jsp:include page="../views/fragments/header_search.jsp"></jsp:include>
	
	<section id="section1"><!-- section 1 -->
	
		<header id="header1">
			<div class="img_logo">
				<spring:url value="/resources/images/banner_logo_p1.jpg" var="image_logo1" />	
				<img src="${image_logo1 }" />
			</div>
		
			<div class="container">
				<p id="system_topic">ระบบบริการข้อมูลสำนักงานเขตพื้นที่การศึกษา</p>
			</div>
	    </header>	
	
	<div class="container">
		<spring:url value="/school/list_primaryschool" var="list_primaryschool"/>
	    <a class="btn btn-primary" href="${list_primaryschool }">   
      	    เขตพื้นที่การศึกษาประถมศึกษา »
        </a>  
        <spring:url value="/school/list_highschool" var="list_highschool"/>     
        <a class="btn btn-primary" href="${list_highschool }">
 	             เขตพื้นที่การศึกษามัธยมศึกษา »
        </a>
     </div>	    
	
	
	<div class="container" id="newstopic">
		  <a href="#" class="list-group-item list-group-item-success">
		   <label> ข่าวกลุ่มงานสารสนเทศ สำนักนโยบายและแผนฯ</label>
		  </a>
		 <c:forEach items="${news_objects }" var="news_objects">
  			<li class="list-group-item">News Topic :
  			<spring:url value="/newstopic/${news_objects.nid}" var="topicId" />
  			<a href="${topicId }"><span>${news_objects.topic }</span></a> วันที่ <span>${news_objects.topicDate }</span></li>
		</c:forEach>
	</div>

		
	<div class="container">
		<article id="newstopic_button">
			<a href="#">ดูข่าวทั้งหมด</a>
		</article>
	</div>
	
	<div id="section_footer">		
		<jsp:include page="../views/fragments/obec_department.jsp"></jsp:include>	
	</div>		
	
	
	
	</section><!-- End section 1 -->
	
	<div id="buttom1">		
		<p>จัดทำโดย สำนักนโยบายและแผนฯ กลุ่มสารสนเทศ สำนักนโยบายและแผนการศึกษาขั้นพื้นฐาน สำนักงานคณะกรรมการการศึกษาขั้นพื้นฐาน</p>	
		<p>Contact Webmaster Email: ifcec@obec.ifec.go.th</p>	
	</div>	

	

	
</body>
</html>