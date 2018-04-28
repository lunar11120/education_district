<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List HighSchool</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

	<!-- add this for CSS in resources folder -->
	<spring:url value="/resources/theme1/css/list_school.css" var="listCss" />	
	<link href="${listCss }" rel="stylesheet" />
</head>
<body>
		<jsp:include page="../views/fragments/header.jsp"></jsp:include>
	
	<section id="sectionlist"><!-- section list school -->
	
	<div class="sec_lst">
		
		<header id="header1">
			<div class="img_logo">
				<spring:url value="/resources/images/banner_logo_p2.jpg" var="image_logo2" />	
				<img src="${image_logo2 }" />
			</div><br />
		
			<div class="container">
				<p id="system_topic">ระบบบริการข้อมูลสำนักงานเขตพื้นที่การศึกษา : สถานศึกษาในเขตพื้นที่การศึกษามัธยมศึกษา</p>
			</div>
	    </header><br/>
	
		 <div class="container">
			<!--  Index >> add_school_page -->
			<spring:url value="/" var="home"/>
			<spring:url value="/school/list_highschool" var="listschool"/>
		    <a href="${home }">หน้าแรก</a>   >>    <a href="${listschool }">สถานศึกษาในเขตพื้นที่การศึกษามัธยมศึกษา</a> <br /><br />  	     
    	 </div>    
	
		<div class="container">		
			<p class="line1"></p>
			<c:forEach items="${district_highschool }" var="dt">
			<p class="topic_district">เขตพื้นที่การศึกษา : <span>${dt.districtFullName }</span>  :  <span> ${dt.districtName }</span></p>
			<table class="table table-bordered" id="table_list">
				<tbody>
					<tr class="tr_table">
						<th>รหัสโรงเรียน</th> <th>โรงเรียน</th> <th>ประเภท</th> <th>ผู้บริหาร</th> <th>บุคลากรและครู</th>
					</tr>
					<c:forEach items="${dt.schools }" var="school">
						<tr>
							<!-- List of HighSchool-->
							<td>${school.schoolID }</td>	
							<td>${school.schoolName }</td>									
							<td>${school.schoolType }</td>	
							<td>${school.schoolDirector }</td>			
							<td>${school.teacher_and_employee }</td>							
						</tr>	
					</c:forEach>
				</tbody>
			</table>
			</c:forEach> <br />				
		</div>
		
	</div>
	</section>
	
<!--  
<table><tr>
<td><a href="<c:url value='/edit/${person.id}' />" >Edit</a></td>
<td><a href="<c:url value='/remove/${person.id}' />" >Delete</a></td>  </tr>
</table>
-->

</body>
</html>