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
					//ע��ʧ��,���û����Ѿ�����
					response.sendRedirect("error3.jsp");
				}else{
					if (pw.equals(pw1)) {
							uc.insert(us, pw);
								response.sendRedirect("success.jsp");
							} else {
					// ��ʾ����
					//ע��ʧ��,��������ͬ������
					response.sendRedirect("error2.jsp");
				}
				}
			} else {
				//�ʺŻ����벻��Ϊ���ַ���
				response.sendRedirect("error4.jsp");
			}
		} else {
			//����ȷ����������Ϣ
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