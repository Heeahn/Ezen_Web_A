<%@page import="DAO.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 1. 전페이지로 부터 게시물번호 요청
    	String mid = (String)request.getParameter("mid"); 
    	// 2. dao 게시물삭제 메소드 호출
    	Dao dao = new Dao();
    	boolean result = dao.delete(mid);
    	// 3. 삭제가 성공했으면
    	if(result){
    		response.sendRedirect("main.jsp");
    		session.setAttribute("loginid", null);
    	}
    %>