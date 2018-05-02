<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ระบบบริการข้อมูลสำนักงานเขตพื้นที่การศึกษา:แก้ไขข้อมูลเขตพื้นที่การศึกษา</title>

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
	
 	<section id="section2_District"><!-- section 2 -->	
 	
	<header id="header1">
		<div class="img_logo">
				<spring:url value="/resources/images/banner_logo_p2.jpg" var="image_logo2" />	
				<img src="${image_logo2 }" />
			</div>
		
			<div class="container">
				<p id="system_topic">ระบบบริการข้อมูลสำนักงานเขตพื้นที่การศึกษา : เพิ่มเขตพื้นที่การศึกษา</p>
		</div>
	 </header><br/>
	    		
	<div class="container">
			<!--  Index >> add_school_page -->
			<spring:url value="/" var="home"/>
			<spring:url value="/editData_district" var="listschool"/>
		    <a href="${home }">หน้าแรก</a>   >>    <a href="${listschool }">แก้ไขข้อมูลเขตพื้นที่การศึกษา</a> <br /><br />  	     
    </div>
    	
	<div class="container">	
		<div class="row">
			<spring:url value="/district/add" var="formUrl"/>
			<form:form modelAttribute="district" action="${formUrl }" method="post" cssClass="col-md-8 col-md-offset-2">
			
				<div class="container">
					<div class="form-group">
						<label for="unit">เลือกเขตพื้นที่การศึกษา</label> 
						<ul>
							<li><form:radiobutton path="isDistrictHighschool" value="True"/>เขตพื้นที่การศึกษามัธยมศึกษา </li>
							<li><form:radiobutton path="isDistrictHighschool" value="False"/>เขตพื้นที่การศึกษาประถมศึกษา </li>
						</ul>
					</div>
				</div>

							
				<div class="form-group">
					<label for="d-name">ชื่อเขตพื้นที่การศึกษา</label>
					<form:input id="d-name" cssClass="form-control" path="districtFullName"/>
				</div>
				
				<div class="form-group">
					<label for="d-shortname">ชื่อย่อเขตพื้นที่การศึกษา</label>
					<form:input id="d-shortname" cssClass="form-control" path="districtName"/>
				</div>				

				<div class="form-group">
					<label for="notes">ที่อยู่</label> 
					<form:textarea id="notes" path="districtAddress" cssClass="form-control" rows="3" />					
				</div>
				
				<!-- Telephone Field List<String> -->
				<div class="form-group">
					<label for="poc">หมายเลขโทรศัพท์(1)</label>
					<form:input id="poc" 
							cssClass="form-control" path="telePhone[0]"/>
				</div>
				
				<div class="form-group">
					<label for="poc2">หมายเลขโทรศัพท์(2)</label>
					<form:input id="poc2" 
							cssClass="form-control" path="telePhone[1]"/>
				</div>
				
					
				<div class="form-group">
					<label for="d-fax">FAX : โทรสาร</label>
					<form:input id="d-fax" cssClass="form-control" path="fax"/>
				</div>	
				
				<div class="form-group">
					<label for="d-url">URL</label>
					<form:input id="d-url" cssClass="form-control" path="districtUrl"/>
				</div>	
								
				<form:input type="hidden" id="district-ID" cssClass="form-control" path="did" hidden="true" />
						
				<button type="submit" class="btn btn-default">Submit</button>
	
			</form:form>		
		</div>
	</div>
	
	</section>
	
</body>
</html>