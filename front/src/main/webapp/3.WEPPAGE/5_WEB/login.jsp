<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="css/index.css" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
</head>
<body>

	<!-- https://huns.co.kr/ �ƽ� -->
	<!-- ��� -->
	<div class="col-md-10 offset-2 fixed-top pb-1 pt-5 px-5">
		<div class="col-md-7 offset-5 d-flex justify-content-end">
			<ul class="nav navbar"> <!-- ����Ʈ [ ul ol ] �� ���� ��ġ [ inline ] -->
				<li class="topheader"><a href="login.jsp">LOGIN </a> </li>
				<li class="topheader"><a href="#"> JOIN </a> </li>
				<li class="topheader"><a href="#"> CART </a> </li>
				<li class="topheader"><a href="#"> MY PAGE </a> </li>
				<li class="topheader"><a href="#"> SNS </a> </li>
				<li class="topheader"><a href="#"> BOOKMARK </a> </li>
			</ul>
		</div>
	</div>
		<!-- ���̵�� -->
	<div class="row">
		<div class="col-md-2 sidemenu">
			<h3> <a href="index.jsp"> JUNS </a> </h3>
			<ul>
				<li>BEST</li>
				<li>NEW</li>
				<li>���Ϲ��</li>
				<li>1+1/�ڵ�Ʈ</li>
			</ul>
			<ul>
				<li>�ƿ���</li>
				<li>����</li>
				<li>����</li>
				<li>��Ʈ/�����</li>
				<li>����</li>
				<li>Ʈ���̴�</li>
				<li>�Ź�</li>
				<li>�Ǽ��縮</li>
				<li>����</li>
			</ul>
			<ul>
				<li>NOTICE</li>
				<li>Q&N</li>
				<li>REVIEW</li>
				<li>EVENT</li>
			</ul>
			<div>
				<input type="text"style="width: 115px; margin-left: 30px;">
				<i class="fas fa-search"></i>
			</div>
			<div style="font-size: 11px; margin-left: 30px; margin-top: 50px;">
				<div style="font-weight: bold;">
				�����͡�070-1111-1111
				</div>
				
				<div style="font-weight: bold;">
				īī��ä�� @�ƽ�
				</div>
				<p style="margin-top: 3px; padding-top: 5px;">
				MON - FRI AM9 - PM4
				<br>
				(LUNCH TIME PM12:30 - PM13:30)
				<br>
				SAT, SUN, HOLIDAY CLOSE
				<br>
				�����ð��� ���Ǵ�
				<br>
				Q��A �Խ����� �̿��Ź�帳�ϴ�.
				<br>
				</p>
				<p style="margin-top: 1px;">
				�츮���� 1005-504-11111
				<br>
				������ : (��)���������۴�
				</p>
			</div>
		</div>
		
		<!-- ���� -->
					<div class="container text-center">
				
				<div class="col-md-4 offset-4">
					<div>
						<h3 style="margin-top: 80px; margin-bottom:100px; font-weight: bold;">LOGIN</h3>
					</div>
					<div>
						<table style="margin: 0 auto;">
							<tr>
								<td><input type="text" value="" style="margin-bottom: 10px; height: 30px; width: 230px; margin-left: 30px;"> </td>
								<td rowspan="2"><input type="button" style=" 
								background-color:black; color:white; margin-bottom: 10px; margin-left: 10px; width: 100px; height: 70px;" value=" �α��� " >  </td>
							</tr>
							<tr style="margin-top: 20px; ">
								<td><input type="password" placeholder=""  style="margin-bottom: 10px; height: 30px; width: 230px; margin-left: 30px;"></td>
							</tr>
						</table>
					</div>
					<div style="margin-top: 40px;"></div>
					<div class="text-center" style="margin: 0 auto; font-size: 11px;">
						<span> <input type="checkbox" class="form-check-input" style="margin-right: 10px;">���̵� ����</span>
						<span> <img alt="" src="img/ico_access.gif"> ��������     </span>
						<span>|</span>
						<span> <img alt="" src="img/ico_access.gif"> ���̵�ã��     </span>
						<span>|</span>
						<span> <img alt="" src="img/ico_access.gif"> ��й�ȣã��</span>
					</div>
					<div style="margin-top: 20px;">
						<ul style=" list-style:none;" >
							<li  class="img" style="margin: 10px;"> <img alt="" src="img/n.gif"> <img alt="" src="img/k.gif"> </li>
							<li class="img" style="margin: 10px;"> <img alt="" src="img/f.gif"> <img alt="" src="img/a.gif"> </li>
						</ul>
						<div style="margin-top: 20px; margin-left: 45px;">
							<button  type="button" style="width: 370px; height: 40px; background-color: gray"> join us </button>
						</div>
					</div>
					
					
				<div style="margin-top: 100px;"></div>
				
				<div style="margin: 0 auto;">
					<div style="font-size: 11px; margin-left: 40px;">
						<p style="font-size: 14px;'">��ȸ���� ���, �ֹ����� �ֹ���ȣ�� �ֹ���ȸ�� �����մϴ�.</p>
							<div>
							�ֹ��ڸ� <input type="text" style="margin-left: 120px; width: 180px; height: 30px;">
							</div>

							<div style="margin-top: 5px;">
							�ֹ���ȣ <input type="text" style="margin-left: 120px; width: 180px; height: 30px;" >
							</div>
	
							<div style="margin-top: 5px;">
							��ȸ���ֹ� ��й�ȣ <input type="text" style="margin-left: 62px;width: 180px; height: 30px;">
							</div>
						
					</div>
					<div style="margin-top: 20px; margin-left: 50px;">
							<button  type="submit" style="width: 350px; height: 40px; background-color: #fffffff;" > ��ȸ�� �α��� </button>
						</div>
					
				</div>
			
			</div>
			<!-- Ǫ�� -->
			<div style="border-top: solid 1px #eeeeee; margin: 50px; ">
			</div>
			<div id="footer" class="row">
				<div class="col-md-2 offset-1 text-center" style="font-size: 13px;">
					<ul style=" list-style:none; text-align: center;">
					<li style="font-size: 16px; font-weight: bold; margin-bottom: 10px; color: #999999;">
					S H O P    I N F O .
					</li>
					<li><a href="#"> ABOUT US</a></li>
					<li><a href="#">AGREEMENT</a></li>
					<li><a href="#">PRIVACY POLICY</a></li>
					<li><a href="#">SHOPPING GUIDE</a></li>
					</ul>
				</div>
				<div class="col-md-3 text-center" style="font-size: 13px;">
					<ul style=" list-style:none; text-align: center;">
					<li style="font-size: 16px; font-weight: bold; margin-bottom: 10px; color: #999999;">
					C U S T O M E R    C E N T E R .
					</li>
					<li style="font-size: 25px; font-weight: bold; margin-bottom: 10px; color: black;">
					070-1111-1111
					</li>
					<li style="font-size: 13px; font-weight: bold; margin-bottom: 10px; color: black;">
					<a href="https://pf.kakao.com/_LKGMd"> īī��ä�� : �ؽ�</a>
					</li>
					<li>MON - FRI AM9 - PM4</li>
					<li>(LUNCH TIME PM12:30 - PM13:30)</li>
					<li>SAT, SUN, HOLIDAY CLOSE</li>
					<li>�����ð��� ���Ǵ�</li>
					<li>Q��A �Խ����� �̿��Ź�帳�ϴ�.</li>	<br>
					<li style="font-size: 16px; font-weight: bold; margin-bottom: 10px; color: #999999;">B A N K    A C C O U N T .</li>
					<li>�츮���� 1005-504-072722</li>
					<li>������ : (��)���������۴�</li>
					</ul>
				</div>
				<div class="col-md-4" style="font-size: 11px;">
					<ul style=" list-style:none; text-align: center;">
						<li style="font-size: 16px; font-weight: bold; margin-bottom: 20px; color: #999999;">C O M P A N Y    I N F O .</li>
						<li style="margin-top: 1px;">COMPANY : (��)���������۴� CEO : ���簩 TEL : 070-7710-4745</li>
						<li>BUSINESS NUMBER : 693-81-01950 / 2021-����ϳ�-0552 [���������Ȯ��]</li>
						<li>ADDRESS : 13024 ��⵵ �ϳ��� �ϳ���� 506 (�ϻ�) 2��</li>
						<li>ADMIN : ��̿� (youandme3800@naver.com) HOSTING : (��)CAFE24</li>
						<li style="margin-bottom: 40px;">	�¶��� ���ڻ�ŷ� ���� ���� [���񽺰��Ի��Ȯ��]</li>
						<li style="font-weight: bold; ">��ǰ�ּ� / CJ�������(1588-1255)</li>
						<li>CJ������� ��ǰ�ּ� : �����ȣ 05839) ����� ���ı� ��η�52 CJ������� ��������븮��</li>
						<li>Ÿ�ù��̿� ��ǰ�ּ� : �����ȣ 12729) ��⵵ ���ֽ� �ʿ��� ����� 625-12 A�� 3��	</li>
						<li>��Ÿ�ù� �̿�� �����ù�,�Ե��ù�Ұ�(�ݼ۵ɼ� �ֽ��ϴ�)��</li>
						<li style="font-weight: bold;">
						Copyright  (��)���������۴�. All rights reserved. by uniq.
						</li>
					</ul>
				</div>
				<div class="col-md-2" style="text-align: center;">
					<a href="https://www.instagram.com/accounts/login/?next=/hunsgram/"> <i class="fab fa-instagram fa-3x"></i> </a>
				</div>
			</div>
		</div>
	</div>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>


