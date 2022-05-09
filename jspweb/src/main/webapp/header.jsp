<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>행복도시 컨설팅</title>
	<!-- 부트스트랩 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
	<!-- 사용자정의 css -->
	<link href="/jspweb/css/main.css" rel="stylesheet">
</head>
<body>
	<!--   헤더페이지[ 모든 페이지 사용되기 때문에 = 최상위에서 절대경로 ] -->
	
	<%
		String loginid = (String)session.getAttribute("login"); // 세션 호출 ( 기본타입 = Odject )
	%>
	<div class="fixed-top bg-white">
		<div class="container">
			<div class="d-flex justify-content-end">
				<ul class="nav">
					<!--  로그인이 안된 상태 = 만약에 세션이 없으면  -->
					<% if( loginid == null ){ %>
					<li class="ms-2"><a href="/jspweb/member/login.jsp">로그인</a></li>
					<li class="ms-2"><a href="/jspweb/member/signup.jsp">회원가입</a></li>
					<%} %>
					<!--  만약에 로그인된 상태 = 만약에 세션이 있으면 -->
					<% if( loginid != null ){ %>
					<li class="ms-2"><span> <%=loginid %>님 </span></li>
					<li class="ms-2"><a href="/jspweb/logout">로그아웃</a></li>
					<li class="ms-2"><a href="/jspweb/member/myshopping.jsp">나의쇼핑</a></li>
					<li class="ms-2"><a href="/jspweb/board/boardlist.jsp">자유게시판</a></li>
					<%} %>
				</ul>
			</div>
			<div class="container col-md-12">
				<!--  공통  -->
				<a href="/jspweb/main.jsp" class="">EZEN SHOP</a>
				<a href="#"> BIG SIZE </a>
				<a href="#"> MUSCLE-FIT </a>
				<a href="#"> 1+1 이벤트 </a>
				<a href="#"> 아우터 </a>
				<a href="#"> 상의 </a>
				<a href="#"> 바지 </a>
				<a href="#"> 슈즈 </a>
				<a href="#"> 악세사리 </a>
				<a href="#"> BEST </a>
				<a href="#"> 트레이닝 </a>
				<a href="#"> 모델처러입자 </a>
				<a href="#"> 50% 할인 </a>
				<input type="text"><button>검색</button>
				<a href="#"> <img src="#">장바구니이미지 </a>
			</div>
		</div>
	</div>	
	<br><br><br><br><br><br>
	<!-- 부트스트랩 js cdn -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- 사용자정의 js -->
	<script src="/jspweb/js/main.js" type="text/javascript"></script>
	<!-- jquery 최신 cdn -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	

</body>
</html>





