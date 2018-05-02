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
				<p id="system_topic">ข้อมูลพื้นฐานของหน่วยงาน</p>
			</div>
	    </header>	
	
	<div class="container">
		<article id="arc1">
			<h4>สำนักงานคณะกรรมการการศึกษาขั้นพื้นฐาน</h4>
			<h6>Office of the Basic EducationCommission</h6> <br/>
			
			<p>ที่ทำการ : 319 วังจันทรเกษม ถนนราชดำเนินนอก แขวงดุสิต เขตดุสิต กรุงเทพมหานคร 10300</p>
			<p>วันก่อตั้ง : พ.ศ. 2546</p>
			<p>สืบทอดจาก : กรมสามัญศึกษาสำนักงานคณะกรรมการการประถมศึกษาแห่งชาติ สำนักงานคณะกรรมการการศึกษาเอกชน</p>
			<p>งบประมาณ 	319,321.0495 ล้านบาท (พ.ศ. 2559)</p>
			<p>รัฐมนตรีว่าการ 	ดร.ปิยะบุตร ชลวิจารณ์ , ประธานกรรมการ</p>
			<p>ผู้บริหาร 	ดร.บุญรักษ์ ยอดเพชร , เลขาธิการ ณรงค์ แผ้วพลสง , รองเลขาธิการ สุกัญญา งามบรรจง</p>
			<p>เว็บไซต์  OBEC.go.th</p> 
			<p> <a href="http://www.obec.go.th/"> http://www.obec.go.th </a> </p>
		</article>
	</div> 
	
	<div class="container">
		<article id="arc2">
			<h4>หน่วยงานในสังกัด</h4>
		สำนักงานคณะกรรมการการศึกษาขั้นพื้นฐาน มีหน่วยงานส่วนกลางประจำภูมิภาคต่างทั่วประเทศ ได้แก่ สำนักงานเขตพื้นที่การศึกษาประถมศึกษา
		 จำนวน 183 เขตพื้นที่การศึกษา สำนักงานเขตพื้นที่การศึกษามัธยมศึกษา  จำนวน 42 เขตพื้นที่การศึกษา และหน่วยงานส่วนกลาง จำนวน 16 หน่วยงาน
		<ul>
			<li>	   สำนักอำนวยการ </li>  
			<li>     สำนักการคลังและสินทรัพย์</li>  
			<li>     สำนักติดตามและประเมินผลการจัดการศึกษาขั้นพื้นฐาน</li>  
			<li>     สำนักทดสอบทางการศึกษา</li>  
			<li>     สำนักเทคโนโลยีเพื่อการเรียนการสอน</li>  
			<li>     สำนักนโยบายและแผนการศึกษาขั้นพื้นฐาน</li>  
			<li>     สำนักบริหารงานการศึกษาพิเศษ</li>  
			<li>     สำนักพัฒนานวัตกรรมการจัดการศึกษา</li>  
			<li>     สำนักบริหารงานบุคคลและนิติการ</li>  
			<li>     สำนักพัฒนาครูและบุคลากรการศึกษาขั้นพื้นฐาน</li>  
			<li>     สำนักพัฒนากิจกรรมนักเรียน</li>  
			<li>     สถาบันภาษาอังกฤษ</li>  
			<li>     สำนักพัฒนาการศึกษาเขตพัฒนาเฉพาะกิจจังหวัดชายแดนภาคใต้</li>  
			<li> 	   สำนักบริหารงานการมัธยมศึกษาตอนปลาย</li>  
			<li> 	   กลุ่มพัฒนาระบบบริหาร</li>  
			<li>     หน่วยตรวจสอบภายใน </li>  
		</ul>    
		</article>
	</div>   <br />	  

	
	</section><!-- End section 1 -->
	
	<div id="buttom1">		
		<p>จัดทำโดย สำนักนโยบายและแผนฯ กลุ่มสารสนเทศ สำนักนโยบายและแผนการศึกษาขั้นพื้นฐาน สำนักงานคณะกรรมการการศึกษาขั้นพื้นฐาน</p>	
		<p>Contact Webmaster Email: ifcec@obec.ifec.go.th</p>	
	</div>	

	

	
</body>
</html>