<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ค้นหาโรงเรียน</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

	<!-- add this for CSS in resources folder -->
	<spring:url value="/resources/theme1/css/list_school.css" var="listCss" />	
	<link href="${listCss }" rel="stylesheet" />
</head>
<body>

	<jsp:include page="../views/fragments/header_search.jsp"></jsp:include>	
	
	<section id="sectionlist"><!-- section list school -->
	
	<div class="sec_lst">
		
		<header id="header1">
			<div class="img_logo">
				<spring:url value="/resources/images/banner_logo_p2.jpg" var="image_logo2" />	
				<img src="${image_logo2 }" />
			</div><br />
		
			<div class="container">
				<p id="system_topic">ระบบบริการข้อมูลสำนักงานเขตพื้นที่การศึกษา : ค้นหาสถานศึกษาในระบบ</p>
			</div>
	    </header><br/>
	
		 <div class="container">
			<!--  Index >> add_school_page -->
			<spring:url value="/" var="home"/>
			<spring:url value="/school/list_highschool" var="listschool"/>
		    <a href="${home }">หน้าแรก</a>   >>    <a href="#">ค้นหาสถานศึกษาในระบบ</a> <br /><br />  	     
    	 </div>    
	
		<div class="container">		
			<p class="line1"></p>

			<table class="table table-bordered" id="table_list">
				<tbody>
					<tr class="tr_table"> <th>รหัสโรงเรียน</th> <th>โรงเรียน</th> <th>ประเภท</th> <th>เขตพื้นที่การศึกษา</th> <th>ประเภทเขตพื้นที่การศึกษา</th> </tr>
				<c:forEach items="${find_school_list }" var="sc">		
							<tr>
								<td>${sc.schoolID }</td>
								
								<spring:url value="/school/detail/${sc.id}" var="school_id"/>	
								<td><a href="${school_id }" >${sc.schoolName }</a></td>	
																
								<td>${sc.schoolType }</td>
								<td>${sc.district.districtName }</td>	
								<td>
								<c:choose>
								   <c:when test="${sc.districtType }" >
									เขตพื้นที่การศึกษามัธยมศึกษา
								   </c:when> 
						
								   <c:otherwise>
									เขตพื้นที่การศึกษาประถมศึกษา
								   </c:otherwise>    
							   </c:choose>	
							   </td>				
							</tr>
				</c:forEach>				
				</tbody>
			</table> <br />				
		</div>
		
	</div>
	</section>


</body>
</html>