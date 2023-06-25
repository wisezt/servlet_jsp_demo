package com.ting;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getUser")
public class GetUserController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		UserDAO userDao = new UserDAO();
		User user = userDao.getUser(username);
		
		req.setAttribute(username, user);
		
		RequestDispatcher rd = req.getRequestDispatcher("showUser.jsp");
		rd.forward(req, res);
		
	}
	
	
	
	
	
	

}
