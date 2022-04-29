<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="3_결과페이지.jsp"> 
	<!-- form: 폼양식(입력받은 데이터 전송) -->

		이름  : <input type="text" name="name"><br>

		배경색 : <select name="color">
			<option value="blue"> 파랑 </option>
			<option value="red"> 빨강 </option>
			<option value="orange"> 오렌지 </option>
			<option value="black"> 검정 </option>
		</select>
		반복횟수 : <input type="text" name="number">
		<input type="submit" value="전송">
	</form>
</body>
</html>