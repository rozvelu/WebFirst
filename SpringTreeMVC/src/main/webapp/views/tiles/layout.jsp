<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:getAsString name="title"></tiles:getAsString></title>
<link href=<c:url value="/resources/css/style.css"/> rel="stylesheet">
</head>
<body>
    <div id="style">
    	WEB VKLYCHATEL
    </div>
	<div>
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
	</div>

	<div>
		<tiles:insertAttribute name="body"></tiles:insertAttribute>
	</div>

	<div>
		<tiles:insertAttribute name="footer"></tiles:insertAttribute>
	</div>
</body>
</html>