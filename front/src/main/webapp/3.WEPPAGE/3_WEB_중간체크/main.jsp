<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Main</title>

	<style type="text/css">
	
	#main{width : 1100px;height : 400px;margin: 0 auto;}
	#main_top{margin: 10px 10px 30px 10px;}
	#reserve{float: left;width: 500px;margin: 10px 10px 10px 30px;}
	#photo{float: left;width: 500px;margin: 10px 10px 10px 20px;}
	#reserve .d1 {float: left;text-align: center;}
	#photo .d1 {float: left;text-align: center;}
	.d1{margin: 10px;}
	#main_bottom{clear: both;width: 900px;margin: 0 auto;}
	#main_bottom .c1{width: 200px;}

	#main_bottom .items{float: left; margin: 3px;}
	#main_bottom .subject{font-size: 20px;font-weight: bold;}
	#main_bottom .date{font-size: 10px;}
	
	</style>
	
</head>
<body>
	<div id="main">
		<div id="main_top">
			<div id="reserve">
				<div class="d1"> <img alt="" src="img/icon1.png"> </div>
				<div> <h4>예약 안내</h4> </div>
				<div> <p>스튜디오 대여는 사전에 인터넷으로 예약을 하셔야 합니다. 예약을 1일 이전까지 가능합니다.</p> </div>
			</div>
			<div id="photo">
				<div class="d1"> <img alt="" src="img/icon2.png"> </div>
				<div> <h4>포토 갤러리</h4> </div>
				<div> <p>취업 사진, 가족 사진, 프로필 사진,우정 사진 개인 또는 단체가 이용할 수 있습니다. </p> </div>
			</div>
		</div>
		
			<div id="main_bottom"> <!--  제품 구역  -->
				 <ul class="items">
				 	<li > <img class="c1" alt="" src="img/image1.jpg"> </li>
				 	<li class="subject"> 촬영 스튜디오 </li>
				 	<li class="date"> 카메라 조명등 촬영 장비 </li>
				 </ul>
				 <ul class="items">
				 	<li > <img class="c1" alt="" src="img/image2.jpg"> </li>
				 	<li class="subject"> 촬영 스튜디오 </li>
				 	<li class="date"> 카메라 조명등 촬영 장비 </li>
				 </ul>
				 <ul class="items">
				 	<li > <img class="c1" alt="" src="img/image3.jpg"> </li>
				 	<li class="subject"> 촬영 스튜디오 </li>
				 	<li class="date"> 카메라 조명등 촬영 장비 </li>
				 </ul>
				 <ul class="items">
				 	<li > <img class="c1" alt="" src="img/image4.jpg"> </li>
				 	<li class="subject"> 촬영 스튜디오 </li>
				 	<li class="date"> 카메라 조명등 촬영 장비 </li>
				 </ul>
			</div>
	
	</div>
</body>
</html>