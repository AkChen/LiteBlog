package com.akchen.liteblog.Servlets;

import java.io.IOException;
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
 * Servlet implementation class Lts_Register
 */
@WebServlet("/Lts_Register")
public class Lts_Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lts_Register() {
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
		user.setType(Lt_User.USER_NOMAL);
		
		boolean result = false;
		try {
			result = userDAO.register(user);
		} catch (Lt_Blog_Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.code);
			System.out.println(e.description);
			request.getSession().setAttribute("redirect_msg", "注册失败.错误代码"+e.code);
			request.getSession().setAttribute("redirect_path", "signup.jsp");
			response.sendRedirect("redirect.jsp");
			return ;
		}
		if(result)
		{
			request.getSession().setAttribute("redirect_msg", "注册成功");
			request.getSession().setAttribute("redirect_path", "login.jsp");
			response.sendRedirect("redirect.jsp");
		}
		else
		{
			request.getSession().setAttribute("redirect_msg", "注册失败");
			request.getSession().setAttribute("redirect_path", "signup.jsp");
			response.sendRedirect("redirect.jsp");
		}
	}

}
