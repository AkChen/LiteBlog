package com.akchen.liteblog.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.akchen.liteblog.DAO.Lt_User_DAO;
import com.akchen.liteblog.Factory.Lt_DAO_Factory;
import com.akchen.liteblog.Factory.Lt_User_Factory;
import com.akchen.liteblog.VO.Lt_User;
import com.akchen.liteblog.exception.Lt_Blog_Exception;

/**
 * Servlet implementation class Lts_Login
 */
@WebServlet("/Lts_Login")
public class Lts_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lts_Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Lt_User user = Lt_User_Factory.createUser();
		Lt_User_DAO userDAO = Lt_DAO_Factory.createUserDAO();
		
		user.setUsername(request.getParameter("username"));
		user.setPasword(request.getParameter("password"));
		
		Lt_User verifyUser;
		try {
			verifyUser = userDAO.login(user);
		} catch (Lt_Blog_Exception e) {
			// TODO Auto-generated catch block
			request.getSession().setAttribute("redirect_msg", "登录失败.错误代码"+e.code+"错误原因:"+e.description);
			request.getSession().setAttribute("redirect_path", "login.jsp");
			response.sendRedirect("redirect.jsp");
			return ;
		}
		if(verifyUser == null)
		{
			request.getSession().setAttribute("redirect_msg", "登录失败.用户名或者密码错误");
			request.getSession().setAttribute("redirect_path", "login.jsp");
			response.sendRedirect("redirect.jsp");
			return ;
		}
		
		//OK
		request.getSession().setAttribute("VerifyUser",verifyUser);
		
		//jump
		request.getSession().setAttribute("redirect_msg", "登录成功!");
		request.getSession().setAttribute("redirect_path", "home.html");
		response.sendRedirect("redirect.jsp");
	}

}
