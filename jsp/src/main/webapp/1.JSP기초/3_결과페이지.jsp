<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <!-- 
    	전 페이지로부터 request(요청)
    	request : 서블릿에서 제공해주는 내장객체(미리 만들어진 객체)
    	request.getParameter(" 요청할 변수의 name값");
    		단점 : (String)문자만 가능
    		형변환 : 문자 -> 정수열 : Integer.parseInt
    		
     -->
     <%
     	// 스크립트문 = 자바 언어를 작성하고 실행하는
     	String 이름 = request.getParameter("name");
     	String 색상 = request.getParameter("color");
     	// 제어문 
     	boolean admin = true;
     	if(!이름.equals("관리자")){admin = false;}
     	int 반복횟수 = Integer.parseInt(request.getParameter("number"));
     %>
     
<html>
	<body style="color: <%=색상%>">
		작성할 이름 : <%=이름 %><br>
		선택한 색상 : <%=색상 %><br>
		<%
			if(admin == true){
		%>
				<div> 관리자 이군요.</div>
		<%
			}
		%>
		<%
			for(int i = 0; i<반복횟수; i++){
		%>
				<span>🤞</span>
		<%
			}
		%>
		<%
			for(int i = 0; i<반복횟수; i++){
				for(int s=0;s<=i;s++){
		%>
					<span>🤞</span>
		<%	}
		
		%>
				<br>
		<%
			}
		%>
		<h3> 피라미드 도전! </h3>
		<%
		for(int i=1;i<=반복횟수;i++){
			for(int b=1;b<=반복횟수-i;b++) {
				
		%>
			<span>[]</span>
		<% 		
			}
		%>
		<%
			for(int s=1;s<=(i*2)-1;s++) {
		%>
				<span>❤</span>
		<%		
			}
		 %>
		 <%
			for(int b=1;b<=반복횟수-i;b++) {
			%>	
				<span>[]</span>
		<%
			}
		 %>
		 <br>
		 <%
		}
		%>
	</body>
</html>