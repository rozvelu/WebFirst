<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<a href="http://localhost:8080/SpringTreeMVC/">home</a>
	<table>
		<thead>
			<tr>
				<th>Fname</th>
				<th>Lname</th>
				<th>balance</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${client}" var="client">
				<tr>
					<td>${client.fname}</td>
					<td>${client.lname}</td>
						<td>${client.balance}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<sec:authorize access="hasRole('Admin')">
	<a href="createClient">New Client</a>
	</sec:authorize>
	<a href="logout">Logout</a>
	<form action="delete" method="POST">
		<h3>Delete Category by id </h3>

		Id <input type="text" name="delete">
		<button type="submit">Submit</button>
	</form>
	
</body>
</html>