package com.java.one;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class six
 */
public class six extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public six() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html;charset=GBK");
		
		//����session
		HttpSession session = request.getSession(true);
		Object count = session.getAttribute("counter");
		int counter = 0;
		if (count == null) {
			counter = 1;
			//����һ�μ�������session
			session.setAttribute("counter", new Integer(1));
		} else {
			counter = ((Integer) count).intValue();
			counter++;//������һ
			//����������session
			session.setAttribute("counter", new Integer(counter));
		}
		PrintWriter out = response.getWriter();

		// �����Ϣ
		out.println(" ��ӭ��,��" + counter + "�η���xx��վ!");
		out.flush();
		out.close();
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
