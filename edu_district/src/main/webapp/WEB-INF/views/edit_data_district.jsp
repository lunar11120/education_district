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
				<p id="system_topic">ระบบบริการข้อมูลสำนักงานเขตพื้นที่การศึกษา : แก้ไขข้อมูลเขตพื้นที่การศึกษา</p>
			</div>
	    </header><br/>
	
		 <div class="container">
			<!--  Index >> add_school_page -->
			<spring:url value="/" var="home"/>
			<spring:url value="/editData_district" var="listschool"/>
		    <a href="${home }">หน้าแรก</a>   >>    <a href="${listschool }">แก้ไขข้อมูลเขตพื้นที่การศึกษา</a> <br /><br />  	     
    	 </div>    
	
		<div class="container">		
			<p class="line1"></p>

			<table class="table table-bordered" id="table_list">
				<tbody>
					<tr class="tr_table"> <th>Edit</th> <th>Delete</th> <th>เขตพื้นที่การศึกษา</th> 
					<th>สำนักงานเขตพื้นที่การศึกษา</th> <th>ประเภท</th> </tr>
				<c:forEach items="${districtList }" var="dt">		
							<tr>
								<spring:url value="/district/edit/${dt.did}" var="district_id"/>
								<td><a href="${district_id }" >Edit</a></td>
								<spring:url value="/district/delete/${dt.did}" var="district_id"/>
								<td><a href="${district_id }" >Delete</a></td>	
								<td>${dt.districtName }</td>									
								<td>${dt.districtFullName }</td>
								<td>
							    <c:choose>
								   <c:when test="${dt.isDistrictHighschool }">
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
			</table>
 		<br />				
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