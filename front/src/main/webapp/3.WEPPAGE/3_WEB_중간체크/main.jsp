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
				<div> <h4>���� �ȳ�</h4> </div>
				<div> <p>��Ʃ��� �뿩�� ������ ���ͳ����� ������ �ϼž� �մϴ�. ������ 1�� �������� �����մϴ�.</p> </div>
			</div>
			<div id="photo">
				<div class="d1"> <img alt="" src="img/icon2.png"> </div>
				<div> <h4>���� ������</h4> </div>
				<div> <p>��� ����, ���� ����, ������ ����,���� ���� ���� �Ǵ� ��ü�� �̿��� �� �ֽ��ϴ�. </p> </div>
			</div>
		</div>
		
			<div id="main_bottom"> <!--  ��ǰ ����  -->
				 <ul class="items">
				 	<li > <img class="c1" alt="" src="img/image1.jpg"> </li>
				 	<li class="subject"> �Կ� ��Ʃ��� </li>
				 	<li class="date"> ī�޶� ����� �Կ� ��� </li>
				 </ul>
				 <ul class="items">
				 	<li > <img class="c1" alt="" src="img/image2.jpg"> </li>
				 	<li class="subject"> �Կ� ��Ʃ��� </li>
				 	<li class="date"> ī�޶� ����� �Կ� ��� </li>
				 </ul>
				 <ul class="items">
				 	<li > <img class="c1" alt="" src="img/image3.jpg"> </li>
				 	<li class="subject"> �Կ� ��Ʃ��� </li>
				 	<li class="date"> ī�޶� ����� �Կ� ��� </li>
				 </ul>
				 <ul class="items">
				 	<li > <img class="c1" alt="" src="img/image4.jpg"> </li>
				 	<li class="subject"> �Կ� ��Ʃ��� </li>
				 	<li class="date"> ī�޶� ����� �Կ� ��� </li>
				 </ul>
			</div>
	
	</div>
</body>
</html>