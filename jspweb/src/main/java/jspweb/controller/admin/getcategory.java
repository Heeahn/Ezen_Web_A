package jspweb.controller.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspweb.dao.ProductDao;
import jspweb.dto.Category;

@WebServlet("/admin/getcategory")
public class getcategory extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public getcategory() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Category> arrayList = ProductDao.getProductDao().getcategorylist();
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String html = "";
		for(Category temp : arrayList) {
			html +=
				"<input style=\"margin:10px\"\" type=\"radio\" name=\"cno\" value=\""+temp.getCno()+"\">"+temp.getCname();
		}
			//  java에서 " " : 문자열 인식용 	//  		\"  : " 표시(출력)
		out.print(html); // 해당 문자열 응답
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
