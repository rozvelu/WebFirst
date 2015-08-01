<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="showAllOrders" method="POST">
		<h3>Input DATA</h3>
		
		Timeorders <input type="text" name="timeorders">
		Ship Adress <input type="text" name="shipAdress"> 
		Price <input type="text" name="price">
		<button type="submit">Submit</button>
	</form>
</body>
</html>