<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		*{text-align:center;}
		h3{margin: 0px 0px 60px 0px; font-size: 30px;}
		#search {outline: none; width:400px; padding:10px 5px;}
		#button {padding: 10px; background-color: #555555; height:39px; color:white; width:100px; }
		#button:active, #button:focus,#button { border: none; box-shadow: none; }
		table {margin: 0px auto; border-top: 1px solid #d3d3d3; border-collapse: collapse; }
		#head {display:flex; margin : 20px auto; justify-content: center;}
		.middle {width:1000px; margin: 20px; text-align:left;}
		.table_head {text-align: center;}
		td {text-align:center; width: 200px; height: 30px; height: 45px; border-bottom: 1px solid #ececec; padding: 10px;}
		.tr {border-top:0; border-top: 1px solid #dee2e6;}
	</style>
</head>
<body>
	<%@include file="header.jsp" %>
	<%@include file="mainimage.jsp" %>
	<h3>��������</h3>
	<div>
		<div id="head">
			<input id="search" type="text" placeholder="�˻�� �Է����ּ���">
			<input id="button" type="submit" value="�˻�">
		</div>
	</div>
	<table>
		<tr>
			<td>��ȣ</td><td class="middle table_head">����</td><td>�����</td>
		</tr>
		<tr>
			<td>1</td><td class="middle">[��������] �������� ó����ħ ����ȳ�ó����ħ</td><td>2017.07.13</td>
		</tr>
		<tr class="tr">
			<td>2</td><td class="middle">�������� �ȳ��Դϴ�. �̿����ּż� �����մϴ�</td><td>2017.06.15</td>
		</tr>
		<tr class="tr">
			<td>3</td><td class="middle">�������� �ȳ��Դϴ�. �̿����ּż� �����մϴ�</td><td>2017.06.15</td>
		</tr>
	</table>
	<%@include file="footer.jsp" %>
</body>
</html>