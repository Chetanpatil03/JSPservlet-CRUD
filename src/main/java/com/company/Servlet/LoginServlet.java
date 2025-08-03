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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;
	private UserDao userDao = new UserDaoImp();
	
     /*
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Hello from login");
		
		String username = request.getParameter("username");
				
		String pass = request.getParameter("password");
		
		
//		if(usrname.equals("ram")) {
////			response.getWriter().append("Name : "+usrname);
////			response.getWriter().append("\nPassword : "+pass);
//			response.sendRedirect("home.jsp");
//		}
		
		if(userDao.isValid(username, pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("home.jsp");
		}
		else {
			response.sendRedirect("login.jsp?error=1");
		}

		
	}

}
