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
	
 	<section id="section3_addschool"><!-- section 1 -->	
 	
		<header id="header1">
			<div class="img_logo">
				<spring:url value="/resources/images/banner_logo_p2.jpg" var="image_logo2" />	
				<img src="${image_logo2 }" />
			</div>
		
			<div class="container">
				<p id="system_topic">ระบบบริการข้อมูลสำนักงานเขตพื้นที่การศึกษา : เพิ่มสถานศึกษาในสังกัด</p>
			</div>
	    </header>	
	
	 <div class="container">
		<!--  Index >> add_school_page -->
		<spring:url value="/" var="home"/>
		<spring:url value="/school/add" var="addschool"/>
	    <a href="${home }">หน้าแรก</a>   >>    <a href="${addschool }">เพิ่มสถานศึกษาในสังกัด</a> <br /><br />  	     
     </div>
    	
	<div class="container">	
		<div class="row">
			<spring:url value="/school/add_primaryschool" var="formUrl"/>
			<form:form modelAttribute="school" action="${formUrl }" method="post" cssClass="col-md-8 col-md-offset-2">

				<div class="form-group">
					<label for="districtType">เขตพื้นที่การศึกษา : เขตพื้นที่การศึกษาประถามศึกษา</label>	
				</div>
							
				<div class="form-group">
					<label for="school-name">โรงเรียน</label>
					<form:input id="school-name" cssClass="form-control" path="schoolName"/>
				</div>
				
				<div class="form-group">
					<label for="school-id">รหัสโรงเรียน</label>
					<form:input type="number" id="school-id" cssClass="form-control" path="schoolID"/>
				</div>				

				<div class="form-group">
					<label for="school-type">ประเภท</label>
					<form:select path="schoolType" cssClass="selectpicker" items="${typeOptions_ps}"></form:select>
				</div>
				
				<div class="form-group">
					<label for="school-director">ผู้บริหาร</label>
					<form:input id="school-director" cssClass="form-control" path="schoolDirector"/>
				</div>
				
				<div class="form-group">
					<label for="school-staff">จำนวนบุคลากร(ครู/บุคลากร)</label>
					<form:input type="number" id="school-staff" cssClass="form-control" path="teacher_and_employee"/>
				</div>										
				
				<div class="form-group">
					<label for="school-url">School URL</label>
					<form:input id="school-url" cssClass="form-control" path="schoolUrl"/>
				</div>
			
				<button type="submit" class="btn btn-default">Submit</button>
	
			</form:form>		
		</div>
	</div>
	
	</section>
	
</body>
</html>