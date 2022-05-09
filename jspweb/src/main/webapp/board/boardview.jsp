<%@page import="jspweb.dao.MemberDao"%>
<%@page import="jspweb.dao.BoardDao"%>
<%@page import="jspweb.dto.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file ="../header.jsp" %>

	<div class="container">
		<h3> 게시물 상세 </h3>
		<%
			int bno = Integer.parseInt(request.getParameter("bno")); 
			String mid = (String)session.getAttribute("login");
			// 조회수 중복방지 세션이 존재하지 않으면
			if(session.getAttribute(mid+bno)==null){
			// 조회수 증가 처리
			BoardDao.getBoardDao().increview(bno);
			// 조회수 중복 방지[세션]
			session.setAttribute(mid+bno , true); 
			session.setMaxInactiveInterval(60*60*24); // 24시간
			}
			Board board = BoardDao.getBoardDao().getboard(bno);
			if(board.getMno() == MemberDao.getmemberDao().getmno(mid)){
		%>
		<a href="delete2?bno=<%=board.getBno()%>"><button class="btn btn-success">삭제</button></a>
		<a href="update.jsp?bno=<%=board.getBno()%>"><button class="btn btn-success">수정</button></a>
		<%}%>
		<a href="boardlist.jsp"><button class="btn btn-success">목록</button></a>
		<br><br><br>
		<table class="table table-borderless">
			<tr class="table-info"><th>제목</th><td><%=board.getBtitle()%></td><td>작성자</td><td><%=board.getMid()%></td>
			<td>번호</td><td><%=board.getBno()%></td></tr>
			<tr class="table-white"><th>내용</th><td><%=board.getBcontent()%></td><td>조회수</td><td><%=board.getBview()%></td> </tr>
		<%
			if(board.getBfile()==null){
		%>
			<tr class="table-white"> <td>첨부파일</td><td> - </td><td>작성일</td><td><%=board.getBdate()%></td> </tr>
		<%} else{ %>
			<tr class="table-info"> 
			<td>첨부파일</td><td><a href="filedown?bfile=<%=board.getBfile()%>"><%=board.getBfile()%></a></td>
			<td>작성일</td><td><%=board.getBdate()%></td> 
			</tr>
		<%} %>
		</table>
	</div>
	
	<%@include file ="../footer.jsp" %>

</body>
</html>