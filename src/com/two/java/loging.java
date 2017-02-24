package com.two.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loging extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public loging() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=gbk");
		PrintWriter pw=response.getWriter();
		 pw.println("<html>");
		 pw.println("<body align='center'>");
		 pw.println("<h1>登录界面</h1>");
		 pw.println("<form action=logingC1 method=post>");
		 pw.println("用户名:<input type=text name=username><br>");
		 pw.println("密码:<input type=password name=passwd><br>");
		 pw.println("<input type=submit value=loing><br>");
		 pw.println("</body>");
		 pw.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
