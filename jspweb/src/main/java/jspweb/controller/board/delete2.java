package jspweb.controller.board;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspweb.dao.BoardDao;
import jspweb.dto.Board;

@WebServlet("/board/delete2")
public class delete2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public delete2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bno = Integer.parseInt(request.getParameter("bno"));
		// * DB 삭제 전에 파일명 빼오기
		Board board = BoardDao.getBoardDao().getboard(bno);
		String bfile = board.getBfile();
		
		boolean result = BoardDao.getBoardDao().delete(bno);
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		if(result) {
			
			//* 삭제 성공시 해당 파일도 서버에서 지우기
			String uploadpath = request.getSession().getServletContext().getRealPath("/board/upload/"+bfile);
			File file = new File(uploadpath);
			file.delete(); // 파일 삭제하기(file클래스내 제고오디는 delete() 메소드 = 파일삭제시 사용)
			
			// 1. HTML 내보내기
//			out.println("<html>");
//			out.println("<body>");
//			out.println("</body>");
//			out.println("</html>");
			
			// 2. JS 내보내기
			out.println("<script>");
			out.println("alert('해당 게시물이 삭제 되었습니다.');");
			out.println("location.href='boardlist.jsp';");
			out.println("</script>");
		}else {
			out.println("<script>");
			out.println("alert('해당 게시물이 삭제 실패[관리자에게 문의].');");
			out.println("history.back();");
			out.println("</script>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
