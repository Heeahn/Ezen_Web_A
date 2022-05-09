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
	<h3> ȸ�� ���� </h3>
		<form>
			<ul id="i1"> <!-- ��ü -->
				<li> <!-- �� -->	
					<ul class="cols">
						<li class="col1">���̵�</li> <!-- �� -->
						<li class="col2"><input type="text"></li> <!-- �� -->
					</ul>
				<li>
					<ul class="cols"> 
						<li class="col1">��й�ȣ</li>
						<li class="col2"><input type="password"> </li>
					</ul>
				<li>
					<ul class="cols"> 
						<li class="col1">��й�ȣ Ȯ��</li>
						<li class="col2"><input type="password"> </li>
					</ul>
				<li>
					<ul class="cols"> 
						<li class="col1">�̸�</li>
						<li class="col2"><input type="text"></li>
					</ul>				
				<li>
					<ul class="cols"> 
						<li class="col1">�̸���</li>
						<li class="email"><input type="text"> @ 
						<select>
							<option> �����Է� </option>
			 				<option> naver.com </option>
			 				<option> nate.com </option>
			 				<option> gmail.com </option>
			 				<option> daum.com </option>
			 				<option> kakao.com </option>
						</select> </li>
					</ul> 			
				<li>
					<ul class="cols"> 
						<li class="col1">�̸��� ����</li>
						<li class="radio"><input type="radio" name="reception"> ����� <input type="radio" name="reception"> ���� </li>
					</ul>
				 	
				<li>
					<ul class="cols"> 
						<li class="col1">���� ���</li>
						<li class="checkbox"> <input type="checkbox"> ���ͳ� �˻�
	 						 <input type="checkbox"> ģ�� ��õ
	 						 <input type="checkbox"> ��Ÿ <br> </li>
	 				</ul>
	 				
				<li>
					<ul class="cols"> 
						<li class="col1 hello">�λ縻</li>
						<li class="col2"> <textarea rows="6" cols="50"></textarea> </li>
	 				</ul>
			</ul>
		</form>
	<div id="btn">
		<input type="submit" value="�����ϱ�">
		<input type="reset" value="����ϱ�">
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>