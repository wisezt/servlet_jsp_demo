package com.ting;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/getUser")
public class GetUserController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		UserDAO userDao = new UserDAO();
		User user = userDao.getUser(username);
		
		boolean isByRedirect = Boolean.parseBoolean(req.getParameter("byredirect"));
		System.out.println("byredirect: " + req.getParameter("byredirect"));
		
			
		if (isByRedirect) {
			
			System.out.println("Redirect!");
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			res.sendRedirect("showUserByRedirect.jsp");
			
			
			
		} else {

			System.out.println("Dispatcher!");
			req.setAttribute(username, user);			
			RequestDispatcher rd = req.getRequestDispatcher("showUser.jsp");
			rd.forward(req, res);
			
		}
		

		
	}
	
	
	
	
	
	

}
