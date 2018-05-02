<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>District Edit</title>

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
				<p id="system_topic">ระบบบริการข้อมูลสำนักงานเขตพื้นที่การศึกษา : แก้ไขข้อมูลสถานศึกษา</p>
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

			<table class="table table-bordered" id="table_list">
				<tbody>
					<tr class="tr_table"> <th>Edit</th> <th>Delete</th> <th>โรงเรียน</th> <th>ประเภท</th> <th>เขตพื้นที่การศึกษา</th> </tr>
				<c:forEach items="${SchoolList }" var="sc">		
							<tr>
								<spring:url value="/school/edit/${sc.id}" var="school_id"/>
								<td><a href="${school_id }" >Edit</a></td>
								<spring:url value="/school/delete/${sc.id}" var="school_id"/>
								<td><a href="${school_id }" >Delete</a></td>	
								<td>${sc.schoolName }</td>									
								<td>${sc.schoolType }</td>
								<td>${sc.district.districtName }</td>					
							</tr>
				</c:forEach>				
				</tbody>
			</table>
 		<br />				
		</div>
		
	</div>
	</section>


</body>
</html>