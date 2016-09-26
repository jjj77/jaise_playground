<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="<c:url value="/resources/js/main.js" />"></script>



<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>

<script>
	$(document).ready(function() {
		$("#datepicker").datepicker();
		$("#word_count").on('keyup', function() {
			var words = this.value.match(/\S+/g).length;
			if (words > 100) {
				// Split the string on first 200 words and rejoin on spaces
				var trimmed = $(this).val().split(/\s+/, 100).join(" ");
				// Add a space at the end to keep new typing making new words
				$(this).val(trimmed + " ");
			} else {
				$('#display_count').text(words);
				$('#word_left').text(100 - words);
			}
		});
		$("#word_count_again").on('keyup', function() {
			var words = this.value.match(/\S+/g).length;
			if (words > 300) {
				// Split the string on first 200 words and rejoin on spaces
				var trimmed = $(this).val().split(/\s+/, 300).join(" ");
				// Add a space at the end to keep new typing making new words
				$(this).val(trimmed + " ");
			} else {
				$('#display_count_again').text(words);
				$('#word_left_again').text(300 - words);
			}
		});

	});
</script>
<title>Onesies-New Report</title>
</head>
<body id = "body1">
	<div align = "center" id = "header">
		<h1>ONESIES</h1>
		
		</div>
		
		<h2 id="heading1">Onesies Daily Report</h2>
	<div id = "form1">
	<form:form  method="post"  name = "kidform" commandName="kid" action="save" onsubmit="return validate()">
	
		<table align="center">

			<tr>
				<td>Date:</td>
				<td><input class = "input" type="text" name="dateofreport" id="datepicker"/></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><input class = "input" type="text" name="fname" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input class = "input" type="text" name="lname" /></td>
			</tr>
			<tr>
				<td>Mood:</td>
				<td><select class = "input" name="mood">
						<option value="Energetic">Energetic</option>
						<option value="Happy">Happy</option>
						<option value="Quiet">Quiet</option>
						<option value="Hyperactive">Hyper-active</option>
				</select></td>
			</tr>
			<tr>
				<td>Remarks:</td>
				<td><textarea class = "input" name="remarks" id="word_count" cols="30"
						rows="10"></textarea><br> Total word count: <span
					id="display_count">0</span> words. Words left: <span id="word_left">100</span></td>
			</tr>


			<tr>
				<td>Comments:</td>
				<td><textarea class = "input" name="comments" id="word_count_again" cols="30"
						rows="10"></textarea><br> Total word count: <span
					id="display_count_again">0</span> words. Words left: <span
					id="word_left_again">300</span></td>
			</tr>
			<tr>
				
				<td></td><td><input type=submit value=Save id="save_button"></td>
				
			</tr>
		</table>
		<div align = "center">
		<p>${msg}.</p>
		</div>
		<td><a href="newreport" id ="reset"><br><br><br>Reset Report</a></td><td><a href="/onesies" id = "rese">Home</a></td><br/>
		
	</form:form></div><br>
	<div id = "report_footer">
	<form action="display" METHOD="POST" style="width: 997px; ">
		&nbsp;<input type="submit" value="Display Records" id = "report_display_button" >
	</form>
	</div>
</body>
</html>