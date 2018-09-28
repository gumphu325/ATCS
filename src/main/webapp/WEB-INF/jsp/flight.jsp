<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ATCS Project</title>
</head>

<body>
	<h1>Aircraft Queue</h1>
	<h1>${msg}</h1>
	<a href="/flight">Refresh Queue</a>
	<table>
		<td>Name</td>
		<td>Type</td>
		<td>Size</td>
		<c:forEach items="${queue}" var="ac">
			<tr>
				<td>${ac.aircraftName}</td>
				<td>${ac.aircraftType}</td>
				<td>${ac.aircraftSize}</td>
			</tr>
		</c:forEach>
	</table>
</body>