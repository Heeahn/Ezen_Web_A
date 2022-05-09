package jspweb.controller.board;

import java.io.File;
import java.io.IOException;

import javax.print.DocFlavor.STRING;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import jspweb.dao.BoardDao;
import jspweb.dto.Board;

@WebServlet("/board/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public update() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int bno =  Integer.parseInt( request.getParameter("bno") );
		
		String uploadpath = request.getSession().getServletContext().getRealPath("/board/upload");
		MultipartRequest multi = new MultipartRequest( request,uploadpath ,1024*1024*10 ,"UTF-8" ,new DefaultFileRenamePolicy());
		String btitle = multi.getParameter("btitle");
		String bcontent = multi.getParameter("bcontent");
		String bfile = multi.getFilesystemName("bfile");
		Board board = BoardDao.getBoardDao().getboard(bno);
		String oldfile = board.getBfile();
		
		if(bfile == null) {
			bfile=oldfile;
		}else {
			String upload = request.getSession().getServletContext().getRealPath("/board/upload/"+oldfile);
			File file = new File(upload);
			file.delete();
		}
			//객체화 
		Board board2 = new Board(bno, btitle, bcontent, 0, 0, null, bfile, null);
			// DB
		boolean result = BoardDao.getBoardDao().update(board2);
		if( result ) { response.sendRedirect("boardview.jsp?bno="+bno ); }
		else { response.sendRedirect("boardview.jsp?bno="+bno );}
	}

}










