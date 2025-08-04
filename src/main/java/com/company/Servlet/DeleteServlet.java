package com.company.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import com.company.dao.UserDao;
import com.company.dao.UserDaoImp;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final UserDao userDao = new UserDaoImp();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
//		System.out.println(session.getAttribute("username").toString());
		
		String username = (String) session.getAttribute("username");
		
		if(username != null) { //extra layer for confirmation
			if(userDao.deleteUser(username)) {
				response.sendRedirect("logout");
				//when the deletion is completer the user will automatically redirected to logout page.
			}
			else {
				response.sendRedirect("home.jsp?error=2");
			}
		}
		
	}

}
