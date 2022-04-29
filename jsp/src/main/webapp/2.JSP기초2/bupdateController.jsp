<%@page import="DAO.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
    request.setCharacterEncoding("UTF-8");
	int bno = (int)session.getAttribute("bno2");
	System.out.println("수정완료 "+bno);
	
    String btitle = request.getParameter("btitle");
    String bcontent = request.getParameter("bcontent");
    
    Dao dao = new Dao();
    
    boolean result = dao.bupdate(bno, btitle, bcontent);
    
    if(result){
    	response.sendRedirect("main.jsp");
    	session.setAttribute("bno2", null);
    }
    %>