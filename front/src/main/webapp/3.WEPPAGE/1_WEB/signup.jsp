<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		h3{text-align: center;}
		li{list-style-type: none;}
		
		#i1{
			width: 600px;
			margin: 0 auto;
			border-top: solid 2px #cccccc;
			border-bottom: solid 2px #cccccc;
			padding: 40px;
		}
		.cols li{display: inline-block;}
		.cols{padding: 5px;}
		.col1{ width: 140px;}
		.col2 input{width: 200px; height:25px;}
		.email input,select{height: 30px;}
		.hello{vertical-align: top;}
		#i3{
		width: 30px; height:30px;
		display: inline-block;
		}
		#btn{padding : 20px; width: 300px; margin-right: 10px; float: right;}
		#btn input{width: 100px; height: 40px;}
	</style>
</head>
<body>
	<%@include file="header.jsp" %>
	<%@include file="mainimage.jsp" %>
	<h3> 회원 가입 </h3>
		<form>
			<ul id="i1"> <!-- 전체 -->
				<li> <!-- 행 -->	
					<ul class="cols">
						<li class="col1">아이디</li> <!-- 열 -->
						<li class="col2"><input type="text"></li> <!-- 열 -->
					</ul>
				<li>
					<ul class="cols"> 
						<li class="col1">비밀번호</li>
						<li class="col2"><input type="password"> </li>
					</ul>
				<li>
					<ul class="cols"> 
						<li class="col1">비밀번호 확인</li>
						<li class="col2"><input type="password"> </li>
					</ul>
				<li>
					<ul class="cols"> 
						<li class="col1">이름</li>
						<li class="col2"><input type="text"></li>
					</ul>				
				<li>
					<ul class="cols"> 
						<li class="col1">이메일</li>
						<li class="email"><input type="text"> @ 
						<select>
							<option> 직접입력 </option>
			 				<option> naver.com </option>
			 				<option> nate.com </option>
			 				<option> gmail.com </option>
			 				<option> daum.com </option>
			 				<option> kakao.com </option>
						</select> </li>
					</ul> 			
				<li>
					<ul class="cols"> 
						<li class="col1">이메일 수신</li>
						<li class="radio"><input type="radio" name="reception"> 비수신 <input type="radio" name="reception"> 수신 </li>
					</ul>
				 	
				<li>
					<ul class="cols"> 
						<li class="col1">가입 경로</li>
						<li class="checkbox"> <input type="checkbox"> 인터넷 검색
	 						 <input type="checkbox"> 친구 추천
	 						 <input type="checkbox"> 기타 <br> </li>
	 				</ul>
	 				
				<li>
					<ul class="cols"> 
						<li class="col1 hello">인사말</li>
						<li class="col2"> <textarea rows="6" cols="50"></textarea> </li>
	 				</ul>
			</ul>
		</form>
	<div id="btn">
		<input type="submit" value="저장하기">
		<input type="reset" value="취소하기">
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>