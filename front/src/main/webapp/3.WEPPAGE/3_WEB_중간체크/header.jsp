<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Header</title>
	
	<style type="text/css">
		li{ list-style-type: none;} /*�۸Ӹ� ���� */
		a{ text-decoration: none; color: black; } /*�������� ���󺯰�*/

		@font-face { /* ����Ʈ*/
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
	<div id="header"> <!-- ��� ��ü  -->
		<div id="box"> <!-- ����� �ڽ��� -->
			<div id="logo">	<!-- �ΰ� -->
				The
			</div> 
			<div id="logo2">	<!-- �ΰ� -->
				��Ʃ���
			</div> 
			<div id="menus"> <!-- �޴� -->
				<ul id="main_menu"> <!-- �ϴܸ޴�  -->
					<li> <a href="index.jsp">��Ʃ��� �Ұ�</a> </li>
					<li> <a href="#">��Ʃ��� ����</a> </li>
					<li> <a href="#">��α�</a> </li>
					<li> <a href="#">���� ������</a> </li>
					<li> <a href="#">���ô� ��</a> </li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>