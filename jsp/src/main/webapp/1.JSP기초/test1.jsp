<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String 요청 =  request.getParameter("id");
		System.out.print("html 에서 요청 : " + 요청);
	%>
</body>
</html>