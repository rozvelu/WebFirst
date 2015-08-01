<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Categories</title>

</head>
<body>
<a href="logout">Logout</a>
<a href="http://localhost:8080/SpringTreeMVC/">home</a>



<sec:authorize access="hasRole('Admin')">
<table>
		<thead>
			<tr>
				<th>Category</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${categories}" var="categories">
				<tr>
					<td>${categories.categoryName}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
		</sec:authorize>
		
		
	<div> 	<a href="holodylnuk" >Holodylnuku</a></div>
	<div> 	<a href="showAllClient">TV</a></div>
	<div> 	<a href="showAllClient">Mobile phone</a></div>
	<div> 	<a href="showAllClient">Bicycle</a></div>
	<div> 	<a href="showAllClient">Laptop</a></div>
	<div> 	<a href="showAllClient">Shoes</a></div>
	
	
	
	
	
	
	
	<sec:authorize access="hasRole('Admin')">
	<a href="createCategory">Add new Client</a>
	</sec:authorize>
	
		<sec:authorize access="hasRole('Admin')">
	<div><form action="delete" method="POST">
		<h3>Delete Category by id </h3>

		Id <input type="text" name="delete">
		<button type="submit">Submit</button>
	</form></div>
	</sec:authorize>
</body>
</html>