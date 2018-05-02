<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>District review</title>

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
	    </header>	
	
	<div class="container">
		<h4>บันทึกข้อมูลเสร็จสิ้น [เขตพื้นที่การศึกษา :<span>${district.districtFullName }</span>]</h4>
	</div>	
	    
	<div class="container"><!-- show district review -->
		
		<h2>District</h2>
		<ul class="list-group">
  			<li class="list-group-item"><label>อักษรย่อ :</label><span>${district.districtName }</span></li>
  			<li class="list-group-item"><label>เขตพื้นที่การศึกษา :</label><span>${district.districtFullName }</span></li>

  		    <c:choose>
			   <c:when test="${district.isDistrictHighschool }">
			   <li class="list-group-item"><label>ปรเภท :</label>เขตพื้นที่การศึกษามัธยมศึกษา</li>
			   </c:when> 
	
			   <c:otherwise>
			   <li class="list-group-item"><label>ปรเภท :</label>เขตพื้นที่การศึกษาประถมศึกษา</li>
			   </c:otherwise>    
		   </c:choose>
		
		</ul>
		
	</div>
	


	<div class="container">	
		<table id="link_review">	
		 <tr><td> 		
            <spring:url value="/editData_district" var="editData1" /> 
            <a href="${editData1 }">แก้ไขข้อมูลเขตพื้นที่การศึกษา</a>
         </td></tr>
         <tr><td> 
            <spring:url value="/editData_Highschool" var="editData2" /> 
            <a href="${editData2 }">แก้ไขข้อมูลสถานศึกษา</a>
          </td></tr>		    
		 <tr><td>     
			 <spring:url value="/" var="home"/> 
			 <a href="${home}" >กลับไปหน้าแรก</a>	 	
		 </td></tr>	        	
		</table>				
	</div>	

	
	</section><!-- End section 1 -->
		
	
</body>
</html>