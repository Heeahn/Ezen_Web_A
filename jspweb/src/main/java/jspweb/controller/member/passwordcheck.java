package jspweb.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspweb.dao.MemberDao;

@WebServlet("/passwordcheck")
public class passwordcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public passwordcheck() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		
		boolean result = MemberDao.getmemberDao().passwordcheck(mid,mpassword);
		if(result) {
			response.getWriter().print(1);
		}else {
			response.getWriter().print(2);
		}
		doGet(request, response);
	}

}
