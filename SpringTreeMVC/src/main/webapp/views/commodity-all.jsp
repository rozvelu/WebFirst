<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Commodity</title>
</head>
<body>
<a href="http://localhost:8080/SpringTreeMVC/">home</a>
<a href="logout">Logout</a>
<table>
		<thead>
			<tr>
				<th>Maker</th>
				<th>Title</th>
				<th>Price</th>
				<th>Description</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${commodity}" var="commodity">
						<tr>
					<td>${commodity.maker}</td>
					<td>${commodity.title}</td>
					<td>${commodity.price}</td>
					<td>${commodity.description}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="createCommodity">Add new Commodity</a>
<form action="delete" method="POST">
		<h3>Delete Category by id </h3>

		Id <input type="text" name="delete">
		<button type="submit">Submit</button>
	</form>


</body>
</html>