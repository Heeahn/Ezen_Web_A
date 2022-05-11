package jspweb.controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspweb.dao.BoardDao;
import jspweb.dao.MemberDao;
import jspweb.dto.Reply;

@WebServlet("/board/replywrite")
public class replywrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public replywrite() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bno = Integer.parseInt(request.getParameter("bno"));
		String rcontent = request.getParameter("rcontent");
		String mid = (String)request.getSession().getAttribute("login");
		int mno = MemberDao.getmemberDao().getmno(mid);
		
		Reply reply = new Reply(0, rcontent, null, 0, bno, mno, null);
		
		boolean rs = BoardDao.getBoardDao().replywrite(reply);
		if(rs) {response.getWriter().print(1);}
		else {response.getWriter().print(2);}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
