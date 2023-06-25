
<%@ page import="com.ting.User" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%	
	User user = (User) session.getAttribute("user");
	%>

	<%= user.toString() %>

</body>
</html>