<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% // 자바언어 작성되는 공간
			// 폼이 전송하기전에는 요청 할수가 없다. [ null ]
		
		Calendar calendar = Calendar.getInstance();	// 왜 new ??????????
				
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		boolean ch = false; // 출력가능 달력이면 false

		if(request.getParameter("year") != null &&
				request.getParameter("month") != null ){
				// 요청변수가 있을경우 [ 요청변수가 null 아니면 ]
			year =  Integer.parseInt( request.getParameter("year"));
			month = Integer.parseInt( request.getParameter("month"));
			if(month < 1){
				month = 12; year--;
			}
			if(month > 12){
				month = 1; year++;
			}
			if(year<1900 || year>2300 || month<0 || month>12){
				ch = true; // 출력 불가능 달력이면 true;
			}
		}else{ // 요청변수가 없을경우 [ 요청변수가 null 이면 ]
		}
		calendar.set( year , month-1 , 1 ); // month-1 차감하는이유 : 0:1월  ~  11:12월
		int sweek = calendar.get( Calendar.DAY_OF_WEEK ); // 해당 월의 시작 요일 구하기 
		int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // 해당 월의 마지막 일 구하기 
		
	%>
	
	<!-- html 작성 공간 -->
	<% if(ch == true){ %>
		<div style="color: red">표현 할 수 없는 달력입니다.</div>
	<%} %>
	<form action="4_달력.jsp" method="get">
		<!-- action="폼이 전송될 위치(파일명)" -->
		<input type="text" name="year" placeholder="연도">
		<input type="text" name="month" placeholder="월">
		<input type="submit" value="검색">
	</form>
	<p> 입력한 연도 : <%=year %> </p>
	<p> 입력한 월 : <%=month %> </p>
	
	<form action="4_달력.jsp" method="get">
		<input type="text" name="year" value="<%=year %>">
		<input type="text" name="month" value="<%=month-1 %>">
		<input type="submit" value="이전">
	</form>
	<form action="4_달력.jsp" method="get">
		<input type="text" name="year" value="<%=year %>">
		<input type="text" name="month" value="<%=month+1 %>">
		<input type="submit" value="다음">
	</form>
	<table>
		<tr>
			<th> 일요일 </th>
			<th> 월요일 </th>
			<th> 화요일 </th>
			<th> 수요일 </th>
			<th> 목요일 </th>
			<th> 금요일 </th>
			<th> 토요일 </th>
		</tr>
		<tr>
			<!-- 시작 요일까지 공백으로 채움 -->
			<% for(int i = 1 ; i<sweek ; i++ ) { %>
				<td> </td>
			<%} %>
			<!-- 1일부터 마지막일까지 1씩 증가 하면서 출력 -->
			<% for( int i = 1 ; i<=eday ; i++ ){ %>
				<td> <%=i %> </td>
				<!-- 요일이 7배수 마다 줄바꿈 [ 토요일 마다 ] -->
				<% if( sweek % 7 == 0 ){ %>
					</tr> <tr>
				<%} %>
				<% sweek++;   %> <!-- 일 증가 할때마다 요일 도 증가 --> 
			<%} %>
		</tr>
	</table>
</body>
</html>