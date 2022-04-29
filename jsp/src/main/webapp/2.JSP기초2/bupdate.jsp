<%@page import="DAO.Dao"%>
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
		request.setCharacterEncoding("UTF-8");
		int bno = Integer.parseInt(request.getParameter("bno"));
		session.setAttribute("bno2", bno); 
		System.out.println("업데이트 "+bno);
	%>
	<form action="bupdateController.jsp?bno=<%= bno%>" method="get">
		<input type="text" name="btitle">
		<textarea rows="" cols="" name="bcontent"></textarea>
		<input type="submit" value="수정">
	</form>
	
</body>
</html>