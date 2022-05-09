package jspweb.controller.board;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspweb.dao.BoardDao;
import jspweb.dao.MemberDao;

@WebServlet("/filedelete")
public class filedelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public filedelete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 게시물 번호 요청
		int bno = Integer.parseInt(request.getParameter("bno"));
		String bfile = BoardDao.getBoardDao().getboard(bno).getBfile();
		// 2. 해당 게시물번호의 게시물 첨부파일 필드를 null로 변경
		boolean result = BoardDao.getBoardDao().filedelete(bno);
		// 3. 서버내 첨부파일은 삭제
		if(result) { 
			String uploadpath = request.getSession().getServletContext().getRealPath("/board/upload/"+bfile);
			File file = new File(uploadpath);
			file.delete();
			
			response.getWriter().print(1);
		}else {
			response.getWriter().print(2);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
