<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> 선언문 태그 : 메모리할당[변수 생성, 객체 생성 , 메소드 실행x, 선언O, 클래스 정의O]</h3>
	<!-- html 작성 공간 -->
	
	<%!
		int 변수1 = 10;						// 변수 선언 가능
		Date date1 = new Date();		// 객체 선언 가능
		// 자바 언어를 작성할 수 있는 공간[선언문 태그]
		//System.out.println("jsp 파일에서 작성된 코드1"+변수1); // 메소드 실행 불가
		int 함수1(){return 2;}			// 함수(인수와 반환이 있는 미리 작성된 코드)
		class 클래스1{							// 클래스 선언
			String 필드1 = "유재석";
		}
		클래스1 객체1 = new 클래스1(); 	// 사용자정의 클래스 객체 생성O
	%>
	
	<h3> 스크립트 태그 : 자바 실행문[변수 생성, 객체 생성 , 메소드 실행O, 선언x, 클래스 정의O] </h3>
	<%
		int 변수2 = 20;						// 변수 선언 가능
		Date date2 = new Date();	// 객체 선언 가능
		// 자바 언어를 작성할 수 있는 공간[스크립트 태그]
		System.out.println("jsp 파일에서 생성된 변수"+변수2);
		System.out.println("jsp 파일에서 작성된 코드"+date2);
		//int 함수2(){return 3;}			//함수(인수와 반환이 있는 미리 작성된 코드)
		class 클래스2{							// 클래스 선언
			String 필드2 = "강호동";
		}
		클래스2 객체2 = new 클래스2();	// 사용자정의 클래스 객체 생성O
	%>
	<h3> 표현식 태그 : 메모리 호출[java에서 html로 출력] </h3>
	<!-- 여기는 html 구역 -->
	
	선언문의 변수 : <%=변수1 %><br>
	선언문의 객체 : <%=date1 %><br>
	선언문의 함수 : <%=함수1() %><br>
	선언문의 사용자정의 객체 : <%=객체1.필드1 %><br>
	<hr>
	스크립트문의 변수 : <%=변수2 %><br>
	스크립트문의 객체 : <%=date2 %><br>
	스크립트문의 사용자정의 객체 : <%=객체2.필드2 %><br>
	
</body>
</html>