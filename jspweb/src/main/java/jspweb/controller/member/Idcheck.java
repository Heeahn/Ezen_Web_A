package jspweb.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspweb.dao.MemberDao;

@WebServlet("/idcheck")
public class Idcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Idcheck() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		
		// 1. Dao 이용한 해당 id가 있는지 체크
		boolean result = MemberDao.getmemberDao().idcheck(mid);
		if(result) {
			response.getWriter().print(1);
		}else {
			response.getWriter().print(2);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
