<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Index</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="css/index.css" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
</head>
<body>

	<!-- https://huns.co.kr/ 훈스 -->
	<!-- 헤더 -->
	<div class="col-md-10 offset-2 fixed-top pb-1 pt-5 px-5">
		<div class="col-md-7 offset-5 d-flex justify-content-end">
			<ul class="nav navbar"> <!-- 리스트 [ ul ol ] 을 가로 배치 [ inline ] -->
				<li class="topheader"><a href="login.jsp">LOGIN </a> </li>
				<li class="topheader"><a href="#"> JOIN </a> </li>
				<li class="topheader"><a href="#"> CART </a> </li>
				<li class="topheader"><a href="#"> MY PAGE </a> </li>
				<li class="topheader"><a href="#"> SNS </a> </li>
				<li class="topheader"><a href="#"> BOOKMARK </a> </li>
			</ul>
		</div>
	</div>
		<!-- 사이드바 -->
	<div class="row">
		<div class="col-md-2 sidemenu">
			<h3> <a href="index.jsp"> JUNS </a> </h3>
			<ul>
				<li>BEST</li>
				<li>NEW</li>
				<li>당일배송</li>
				<li>1+1/코디세트</li>
			</ul>
			<ul>
				<li>아우터</li>
				<li>상의</li>
				<li>셔츠</li>
				<li>니트/가디건</li>
				<li>팬츠</li>
				<li>트레이닝</li>
				<li>신발</li>
				<li>악세사리</li>
				<li>세일</li>
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
				고객센터　070-1111-1111
				</div>
				
				<div style="font-weight: bold;">
				카카오채널 @준스
				</div>
				<p style="margin-top: 3px; padding-top: 5px;">
				MON - FRI AM9 - PM4
				<br>
				(LUNCH TIME PM12:30 - PM13:30)
				<br>
				SAT, SUN, HOLIDAY CLOSE
				<br>
				업무시간외 문의는
				<br>
				Q＆A 게시판을 이용부탁드립니다.
				<br>
				</p>
				<p style="margin-top: 1px;">
				우리은행 1005-504-11111
				<br>
				예금주 : (주)유엔미컴퍼니
				</p>
			</div>
		</div>
		
		<!-- 본문 -->
		<div class="col-md-10 offset-2 content">
			<!-- 캐러셀 -->
			<div>
				<div id="cs" class="carousel slide" data-bs-ride="carousel"  data-bs-interval="3000">	
					<div class="carousel-indicators">
			               <button type="button" data-bs-target="#cs" data-bs-slide-to="0" class="active"></button>
			               <button type="button" data-bs-target="#cs" data-bs-slide-to="1"></button>
			               <button type="button" data-bs-target="#cs" data-bs-slide-to="2"></button>
			            </div>
				
					<div class="carousel-inner">
						<div class="carousel-item active"> <img alt="" src="img/캐러셀1.jpg" width="100%"> </div>
						<div class="carousel-item"> <img alt="" src="img/캐러셀2.jpg" width="100%"> </div>
						<div class="carousel-item"> <img alt="" src="img/캐러셀3.jpg" width="100%"> </div>
					</div>
					
					<button class="carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
						<span class="carousel-control-prev-icon"></span>
					</button>
					
					<button class="carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
						<span class="carousel-control-next-icon"></span>
					</button>
				</div>
			</div>
			<div class="text-center title">
				<strong>BEST SELLER</strong>
				<p>#베스트셀러</p>
			</div>
			<div>
				<div class="row">
					
						<div class="col-md-4 col-sm-6 col card">
							<div class="card">
								<img class="car-img-top" alt="" src="img/티.webp">
								<div class="card-body">
									<p class="item">
										<span> [1+1]캔티바이오 고밀도 셔츠 </span> 
									</p>
									<div style="border-bottom: solid 1px #eeeeee;"></div>
									<p class="item">
										<span> 24,900원</span>
									</p>
								</div>
							</div>
						</div>
						
							<div class="col-md-4 col-sm-6 col card">
							<div class="card">
								<img class="car-img-top" alt="" src="img/티.webp">
								<div class="card-body">
									<p class="item">
										<span> [1+1]캔티바이오 고밀도 셔츠 </span> 
									</p>
									<div style="border-bottom: solid 1px #eeeeee;"></div>
									<p class="item">
										<span> 24,900원</span>
									</p>
								</div>
							</div>
						</div>
						
			<div class="col-md-4 col-sm-6 col card">
							<div class="card">
								<img class="car-img-top" alt="" src="img/티.webp">
								<div class="card-body">
									<p class="item">
										<span> [1+1]캔티바이오 고밀도 셔츠 </span> 
									</p>
									<div style="border-bottom: solid 1px #eeeeee;"></div>
									<p class="item">
										<span> 24,900원</span>
									</p>
								</div>
							</div>
						</div>
						
					</div>
			</div>
			<!-- 푸터 -->
			<div style="border-top: solid 1px #eeeeee; margin: 30px;">
			</div>
			<div class="row">
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
					<a href="https://pf.kakao.com/_LKGMd"> 카카오채널 : @준스</a>
					</li>
					<li>MON - FRI AM9 - PM4</li>
					<li>(LUNCH TIME PM12:30 - PM13:30)</li>
					<li>SAT, SUN, HOLIDAY CLOSE</li>
					<li>업무시간외 문의는</li>
					<li>Q＆A 게시판을 이용부탁드립니다.</li>
					<br>
					<li style="font-size: 16px; font-weight: bold; margin-bottom: 10px; color: #999999;">B A N K    A C C O U N T .	</li>
					<li>우리은행 1005-504-072722</li>
					<li>예금주 : (주)유엔미컴퍼니</li>
					</ul>
				</div>
				<div class="col-md-4" style="font-size: 11px;">
					<ul style=" list-style:none; text-align: center;">
						<li style="font-size: 16px; font-weight: bold; margin-bottom: 20px; color: #999999;">
							C O M P A N Y    I N F O .
						</li>
						<li style="margin-top: 1px;">
						COMPANY : (주)유엔미컴퍼니 CEO : 유재갑 TEL : 070-7710-4745
						</li>
						<li>
						BUSINESS NUMBER : 693-81-01950 / 2021-경기하남-0552 [사업자정보확인]
						</li>
						<li>
						ADDRESS : 13024 경기도 하남시 하남대로 506 (하산곡동) 2층
						</li>
						
						<li>
						ADMIN : 김미연 (youandme3800@naver.com) HOSTING : (주)CAFE24
						</li>
						
						<li style="margin-bottom: 40px;">
						온라인 전자상거래 안전 서비스 [서비스가입사실확인]
						</li>
						
						<li style="font-weight: bold; ">
						반품주소 / CJ대한통운(1588-1255)
						</li>
						<li>
						CJ대한통운 반품주소 : 우편번호 05839) 서울시 송파구 충민로52 CJ대한통운 잠실유정대리점
						</li>
						<li>
						타택배이용 반품주소 : 우편번호 12729) 경기도 광주시 초월읍 산수로 625-12 A동 3층
						</li>
						<li>
						※타택배 이용시 로젠택배,롯데택배불가(반송될수 있습니다)※
						</li>
						<li style="font-weight: bold;">
						Copyright  (주)유엔미컴퍼니. All rights reserved. by uniq.
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


