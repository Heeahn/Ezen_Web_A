package jspweb.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspweb.dao.MemberDao;
import jspweb.dto.Member;

@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public update() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String oldpassword = request.getParameter("oldpassword");
		String newpassword = request.getParameter("newpassword");
		
		int mno = Integer.parseInt(request.getParameter("mno"));
		String mname = request.getParameter("mname");
		String mphone = request.getParameter("mphone");
		String memail = request.getParameter("memail");
		String memailaddress = request.getParameter("memailaddress");
		String email = memail+"@"+memailaddress;
		String maddress1 = request.getParameter("maddress1");
		String maddress2 = request.getParameter("maddress2");
		String maddress3 = request.getParameter("maddress3");
		String maddress4 = request.getParameter("maddress4");
		String address = maddress1+"_"+maddress2+"_"+maddress3+"_"+maddress4;
		
		Member member = null;
		
		if(oldpassword.equals("")||newpassword.equals("")) { // 패스워드 변경이 없을 떄
			 member = new Member(mno, null, null, mname, mphone, email, address, 0, null);
		}else { // 패스워드 변경이 있을 때.
			HttpSession session = request.getSession();
			String mid = (String)session.getAttribute("login");
			
			boolean result = MemberDao.getmemberDao().passwordcheck(mid, oldpassword);
			
			if(result) { // 기존 패스워드가 다를 때
				 member = new Member(mno, null, newpassword, mname, mphone, email, address, 0, null);
			}else {
				response.sendRedirect("/jspweb/member/update.jsp?result=3"); return;
			}
		}
		
		boolean result = MemberDao.getmemberDao().update(member);
		if(result) {
			response.sendRedirect("/jspweb/member/update.jsp?result=1");
		}else {
			response.sendRedirect("/jspweb/member/update.jsp?result=2");
		}
	}
}