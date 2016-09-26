<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page session="false" %>
<html>
<head>
	<title>Onesies-Home</title>
	
<script src="<c:url value="/resources/js/main.js" />"></script>
<link href="<c:url value="/resources/css/main_display.css" />" rel="stylesheet">

</head>
<body>
	<div id = "header" style="width: 950px; ">
		<h1>ONESIES</h1>
		
		</div>

	<div id = "disp_container" align="center">
		            
		<h1>Reports</h1>
		            
		<h3>
			<a href="/onesies" class = "h3">Home</a> </h3><form action="newreport"><input type="submit" value="New Report" class="butto">
		
	</form>
		
		            
		<table class = "tg">

			<th>Report ID</th>
			<th>Date</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Mood</th>

			<c:forEach var="kid" items="${kidlist}">
                <tr>

					<td>${kid.report_id}</td>
					<td>${kid.dateofreport}</td>
					<td>${kid.fname}</td>
					<td>${kid.lname}</td>
					<td>${kid.mood}</td>
				</tr>
                </c:forEach>

		</table>
		        
	</div>

	
</body>
</html>