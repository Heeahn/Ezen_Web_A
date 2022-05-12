package jspweb.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspweb.dao.ProductDao;

@WebServlet("/admin/categoryadd")
public class categoryadd extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public categoryadd() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String cname = request.getParameter("cname");
		boolean rs = ProductDao.getProductDao().csave(cname);
		if(rs) {response.getWriter().print(1);}
		else { response.getWriter().print(2);}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
