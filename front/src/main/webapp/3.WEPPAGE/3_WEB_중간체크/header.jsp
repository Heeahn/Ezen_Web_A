<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Header</title>
	
	<style type="text/css">
		li{ list-style-type: none;} /*글머리 제거 */
		a{ text-decoration: none; color: black; } /*밑줄제거 색상변경*/

		@font-face { /* 웹폰트*/
		    font-family: 'KOHIBaeumOTF';
		    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2201-2@1.0/KOHIBaeumOTF.woff') format('woff');
		    font-weight: normal;
		    font-style: normal;
		}
		
		#header{ height: 80px; }
		#box{ width: 1100px; margin: 0 auto; }
		#logo{width:30px; float: left; margin-left: 30px; margin-top: 40px;
			font-family: "KOHIBaeumOTF";	color: blue; font-size: 25px; font-weight: bold;
		}
		#logo2{ 
			float: left; margin-left: 30px; margin-top: 40px; font-family: "KOHIBaeumOTF";
			font-size: 25px; font-weight: bold;
		}
		#menus{ float: right; text-align: right; margin:  50px 0px 0px 40px;}
		#menus li{ display: inline; }
		#logo{ display: inline; }
		#main_menu li{font-family: "KOHIBaeumOTF"; font-size: 15px; margin: 30px 0 0 65px;}

	</style>

</head>
<body>
	<div id="header"> <!-- 헤더 전체  -->
		<div id="box"> <!-- 헤더내 박스권 -->
			<div id="logo">	<!-- 로고 -->
				The
			</div> 
			<div id="logo2">	<!-- 로고 -->
				스튜디오
			</div> 
			<div id="menus"> <!-- 메뉴 -->
				<ul id="main_menu"> <!-- 하단메뉴  -->
					<li> <a href="index.jsp">스튜디오 소개</a> </li>
					<li> <a href="#">스튜디오 예약</a> </li>
					<li> <a href="#">블로그</a> </li>
					<li> <a href="#">포토 갤러리</a> </li>
					<li> <a href="#">오시는 길</a> </li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>