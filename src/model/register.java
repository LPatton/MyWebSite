package model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		UserCl uc = new UserCl();
		String us = request.getParameter("username");
		String pw = request.getParameter("passwd");
		String pw1 = request.getParameter("passwd1");

		if (us != null && pw != null && pw1 != null) {
			if (!us.equals("") && !pw.equals("")) {
				if(uc.checkname(us)){
					//注册失败,此用户名已经存在
					response.sendRedirect("error3.jsp");
				}else{
					if (pw.equals(pw1)) {
							uc.insert(us, pw);
								response.sendRedirect("success.jsp");
							} else {
					// 提示错误
					//注册失败,请输入相同的密码
					response.sendRedirect("error2.jsp");
				}
				}
			} else {
				//帐号或密码不能为空字符串
				response.sendRedirect("error4.jsp");
			}
		} else {
			//请正确输入您的信息
			response.sendRedirect("error5.jsp");
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
