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
	<%@include file="header.jsp" %><!-- ��� -->
	<%@include file="mainimage.jsp" %><!-- ��� �̹��� -->
	<form>
		<div  id="login">
			<h3> �α���</h3>
			<table>
				<tr><td id="i1"> �α��� </td><td> <input type="text"> </td><td rowspan="3"> <button id="b1" style="height:80px">�α���</button> </td></tr>
				<tr><td id="i1"> ��й�ȣ </td><td> <input type="password"> </td></tr>
			</table>
		</div>
	</form>
	<%@include file="footer.jsp" %><!-- Ǫ�� -->
</body>
</html>