<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Orders</title>

</head>
<body>
<a href="http://localhost:8080/SpringTreeMVC/">home</a>
<div><a href="logout">Logout</a></div>
<table>
		<thead>
			<tr>
				<th>Timeorders</th>
				<th>Ship Adress</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${orders}" var="orders">
						<tr>
					<td>${orders.timeorders}</td>
					<td>${orders.shipAdress}</td>
					<td>${orders.price}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="createOrders">New Orders</a>
	
	<form action="delete" method="POST">
		<h3>Delete Category by id </h3>

		Id <input type="text" name="delete">
		<button type="submit">Submit</button>
	</form>
	
</body>
</html>