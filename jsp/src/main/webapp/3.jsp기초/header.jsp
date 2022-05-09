<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	헤더페이지[모든 페이지 사용하기 때문에 = 최상위에서 절대경로]
	<div class="container">
		<a href ="/jspweb/main.jsp">HOME</a>
		<a href ="/jspweb/member/login.jsp">로그인</a>
		<a href ="/jspweb/member/signup.jsp">회원가입</a>
	</div>
	<!-- 부트스트랩 -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- 사용자정의 -->
	<script src="/jspweb/js/main.js" type="text/javascript"></script>
	
</body>
</html>