<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ROZETKA</title>
</head>
<body>
	<h1>Rozetka</h1>
	<div><a href="logout">Logout</a></div>
	<div><a href="showAllCategory">Show Category</a></div>
	
	
	 <sec:authorize access="hasRole('Admin')">
		<div> 	<a href="showAllClient">Show Client</a></div>
		</sec:authorize>
	
	
	 <sec:authorize access="hasRole('Admin')">
		<div><a href="showAllCommodity">Show Commodity</a></div>
		</sec:authorize>
	
	
	 <sec:authorize access="hasRole('Admin')">
	<div> 	<a href="showAllOrders">Show Orders</a></div>
	</sec:authorize>
	
	
	 <sec:authorize access="hasRole('Admin')"><div><a href="showAllCommodity">Show Commodity</a></div>
		</sec:authorize>
	
	
</body>
</html>