<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<nav class="navbar navbar-default">
		<div class="container-fluid">
		
			<div class="navbar-header">
				<spring:url value="/" var="home" />
      			<a class="navbar-brand" href="${home }">OBEC.IFEC</a>
    		</div>
    		
    		<ul class="nav navbar-nav">
    			
    			<li class="dropdown">
          			
          			<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false">เกี่ยวกับ สพฐ. <span class="caret"></span></a>
          	
          			<ul class="dropdown-menu" role="menu">
          				<spring:url value="/history" var="history" />   
            			<li><a href="${history }">ประวัติความเป็นมา</a></li>
            			
            			<spring:url value="/department" var="department" />   
            			<li><a href="${department }">หน่วยงานในสังกัด</a></li>

          			</ul>
          			
        		</li>
        		
    			<li class="dropdown">
          		
          			<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false">ระบบจัดการข้อมูล <span class="caret"></span></a>
          		
          			<ul class="dropdown-menu" role="menu">
          			    <spring:url value="/district/add" var="addDistrict" />          			    
            			<li><a href="${addDistrict }">เพิ่มสำนักงานเขตพื้นที่การศึกษา</a></li>
            			
            			<spring:url value="/school/add" var="addSchool" /> 
            			<li><a href="${addSchool }">เพิ่มสถานศึกษาในสังกัด</a></li>
            			
            			<spring:url value="/editData_district" var="editData1" /> 
            			<li><a href="${editData1 }">แก้ไขข้อมูลเขตพื้นที่การศึกษา</a></li>
            			
            			<spring:url value="/editData_Highschool" var="editData2" /> 
            			<li><a href="${editData2 }">แก้ไขข้อมูลสถานศึกษา</a></li>
          			</ul>
        		
        		</li>
        		
        		<li><a href="http://www.obec.go.th/">กลับหน้าหลัก สพฐ.</a> </li>
        		
    		</ul>
    		
    		<div>		
    			<spring:url value="/search_school" var="search_school" /> 
			    <form:form modelAttribute="school_search" class="navbar-form navbar-left" action="${search_school }" method="post" >
			      <div class="form-group">
			        <form:input type="text" class="form-control" placeholder="ค้นหาสถานศึกษา" path="schoolName" />
			      </div>
			      <button type="submit" class="btn btn-default">ค้นหา</button>
			    </form:form>		
    		</div>



    		
		</div>
</nav>