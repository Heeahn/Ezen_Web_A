<%@page import="jspweb.dao.BoardDao"%>
<%@page import="jspweb.dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	
	<%@include file ="../header.jsp" %>

	<div class="container">
		<h3> 자유게시판 </h3><br><br>
		
		<%
			String mid = (String)session.getAttribute("login");
			if( mid != null ){
		%>
			<a href="boardwrite.jsp"> 글쓰기 </a><br><br>
		<%} %>
		
		<table class="table"> <!-- 테이블 -->
			<tr class="table-info">
				<th class="col"> 번호 </th> 
				<th class="col"> 제목 </th> 
				<th class="col"> 작성자 </th> 
				<th class="col"> 조회수  </th> 
				<th class="col"> 작성일 </th> 
			</tr>
			<!-- for 문 -->
			<%
				// 1. 모든 게시물  호출 
				ArrayList<Board> boardlist = BoardDao.getBoardDao().getboardlist();
				for( Board board : boardlist ){
			%>
			<!-- 
				행을 클릭했을 떄[js]
				<tr onclick="location.href='boardview.jsp'">
				상세 이동시 [식별 번호 같이 이동]
					// 1. HTML : <a href='파일며여(경로).jsp?변수명=값'">
					// 2. JS : "location.href='파일명(경로).jsp?변수명=값'"
					// 3. java : response.sendRedirect("파일명(경로).jsp?변수명=값");
			 -->
				<tr class="table-hover">
					<td> <%=board.getBno()%> </td>
					<td> <a  href="boardview.jsp?bno=<%=board.getBno()%>"><%=board.getBtitle()%></a></td>
					<td> <%=board.getMid()%></td>
					<td> <%=board.getBview()%></td>
					<td> <%=board.getBdate()%></td>
				</tr>
			<%
				}
			%>
		</table>
	</div>
	<%@include file ="../footer.jsp" %>

</body>
</html>