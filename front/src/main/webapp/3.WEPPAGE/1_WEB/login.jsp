<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		#login {margin: 0 auto; padding: 20px; width: 400px;}
		h3{text-align: center;}
		table {margin: 5px; width: 350px; margin: 0 auto;}
		#b1{height: 90px; width: 80px;}
		#i1{width: 80px;}
	</style>
</head>
<body>
	<%@include file="header.jsp" %><!-- 헤더 -->
	<%@include file="mainimage.jsp" %><!-- 헤더 이미지 -->
	<form>
		<div  id="login">
			<h3> 로그인</h3>
			<table>
				<tr><td id="i1"> 로그인 </td><td> <input type="text"> </td><td rowspan="3"> <button id="b1" style="height:80px">로그인</button> </td></tr>
				<tr><td id="i1"> 비밀번호 </td><td> <input type="password"> </td></tr>
			</table>
		</div>
	</form>
	<%@include file="footer.jsp" %><!-- 푸터 -->
</body>
</html>