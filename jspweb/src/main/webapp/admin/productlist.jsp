<%@page import="jspweb.dto.Category"%>
<%@page import="jspweb.dao.ProductDao"%>
<%@page import="jspweb.dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3> 제품 목록</h3>
	<table class="table table-hover">
		<tr>
			<th>제품번호</th><th>대표이미지</th><th>제품명</th><th>제품 가격</th><th>할인율</th><th>판매금액</th><th>제품 상태</th><th>카테고리</th>
			<th>색상</th><th>사이즈</th><th>재고수량</th><th>수정일</th><th>비고(버튼)</th>
		</tr>
		<%
			ArrayList<Product> productlist = ProductDao.getProductDao().getproductlist();
			ArrayList<Category> categories = ProductDao.getProductDao().getcategorylist();
			for(Product product : productlist){
				float price = product.getPprice()-(product.getPprice()*product.getPdiscount());
		%>	
		<tr>
			<td><%=product.getPno()%></td>
			<td><%=product.getPimg()%></td>
			<td><%=product.getPname()%></td>
			<td><%=product.getPprice()%>원</td>
			<td><%=product.getPdiscount()%></td>
			<td><%=price%>원</td>
			<td><%=product.getPactive()%></td>
			<td><%=product.getCno()%></td>
			<td>null</td>
			<td>null</td>
			<td>null</td>
			<td>null</td>
			<td>null</td>
		</tr>
		<%}%>
	</table>


</body>
</html>