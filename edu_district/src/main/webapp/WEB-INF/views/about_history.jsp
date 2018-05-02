<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OBEC:IFEC</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

	<!-- add this for CSS in resources folder -->
	<spring:url value="/resources/theme1/css/home.css" var="mainCss" />	
	<link href="${mainCss}" rel="stylesheet" />
	
</head>
<body>

	<jsp:include page="../views/fragments/header_normal.jsp"></jsp:include>
	
	<section id="section3"><!-- section 1 -->
	
		<header id="header1">
			<div class="img_logo">
				<spring:url value="/resources/images/banner_logo_p1.jpg" var="image_logo1" />	
				<img src="${image_logo1 }" />
			</div>
		
			<div class="container">
				<p id="system_topic">ประวัติของหน่วยงาน</p>
			</div>
	    </header>	
	

	<div class="container">
		<article id="arc1">
			<h4>สำนักงานคณะกรรมการการศึกษาขั้นพื้นฐาน</h4>
			<h6>Office of the Basic EducationCommission</h6> <br/>
	
	รัฐธรรมนูญแห่งราชอาณาจักรไทย พุทธศักราช 2540 มาตรา 43 ได้บัญญัติสิทธิและเสรีภาพด้านการศึกษาของปวงชนชาวไทยไว้ว่า 
	" บุคคลย่อมมีสิทธิเสมอกันในการรับการศึกษาขั้นพื้นฐานไม่น้อยกว่าสิบสองปีที่รัฐจะต้องจัดให้อย่างทั่วถึงและมีคุณภาพโดยไม่เก็บค่าใช้จ่าย" 
	และในบทเฉพาะกาลมาตรา 335 (3) ได้กำหนดให้รัฐธรรมนูญประกาศใช้ ดังนั้น รัฐจะต้องดำเนินการตามที่รัฐธรรมนูญบัญญัติไว้และต้องเตรียมการให้พร้อมที่จะจัดการศึกษาขั้นพื้นฐาน 12 ปี 
	อย่างทั่วถึง มีคุณภาพ โดยไม่เก็บค่าใช้จ่าย
		</article>
	</div>  <br />

	<div class="container">
		<article id="arc1">

	พระราชบัญญัติการศึกษาแห่งชาติ พ.ศ. 2542 ซึ่งถือเป็นกฎหมายการศึกษาฉบับแรกของไทยที่กำหนดแนวทางการจัดการศึกษาขั้นพื้นฐานให้แก่ประชาชนชาวไทยให้สอดคล้องกับรัฐธรรมนูญกล่าวคือ มาตรา 10 ระบุว่า " 
	การจัดการศึกษาต้องจัดให้บุคคลมีสิทธิและโอกาสเสมอกันในการรับการศึกษาขั้นพื้นฐานไม่น้อยกว่า 12 ปี ต้องจัดให้ทั่วถึงและมีคุณภาพโดยไม่เก็บค่าใช้จ่าย"
	เพื่อเป็นการตอบสนองตามเจตนารมณ์ของรัฐธรรมนูญแห่งราชอาณาจักรไทย พุทธศักราช 2540 และพระราชบัญญัติการศึกษาแห่งชาติ พ.ศ. 2542 สำนักงานคณะกรรมการการประถมศึกษาแห่งชาติ กรมสามัญศึกษา และกรมวิชาการ
	 จึงเป็นหน่วยงานที่จะต้องมารวมกันเป็นสำนักงานคณะกรรมการการศึกษาขั้นพื้นฐาน มีหน้าที่จัดการศึกษาขั้นพื้นฐาน 12 ปี
	พระราชบัญญัติการศึกษาแห่งชาติ พ.ศ. 2542 ซึ่งถือเป็นกฎหมายการศึกษาฉบับแรกของไทยที่กำหนดแนวทางการจัดการศึกษาขั้นพื้นฐานให้แก่ประชาชนชาวไทยให้สอดคล้องกับรัฐธรรมนูญ

		</article>
	</div> <br />

	
	</section><!-- End section 1 -->
	
	<div id="buttom1">		
		<p>จัดทำโดย สำนักนโยบายและแผนฯ กลุ่มสารสนเทศ สำนักนโยบายและแผนการศึกษาขั้นพื้นฐาน สำนักงานคณะกรรมการการศึกษาขั้นพื้นฐาน</p>	
		<p>Contact Webmaster Email: ifcec@obec.ifec.go.th</p>	
	</div>	

	

	
</body>
</html>