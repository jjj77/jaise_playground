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
<link href="<c:url value="/resources/css/main_home.css" />" rel="stylesheet">
</head>
<body>
<div id = "header" style="width: 950px; ">
		<h1>ONESIES</h1>
		
		</div><div id = "body1">
<div ><form action = "newreport"><input id = "homepage_newreport" type="submit" value = "Report Form" style="width: 118px; "></form></div>
<br><div><form action="display" METHOD="POST" ><input id = "homepage_displayreports" type="submit" value = "Display Reports"></form></div>
<div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div></div>

</body>
</html>
