package com.two.java;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public welcome() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=gbk");
		HttpSession hs=request.getSession(true);
		String value=(String)hs.getAttribute("username");
		
		if(value==null){
			response.sendRedirect("loging");
		}
		
		//String u=request.getParameter("name");
		//String p=request.getParameter("passwd");name="+u+"passwd="+p
		PrintWriter pw=response.getWriter();
		pw.println("welcome to servlet");
		pw.println("<br>用户名是"+value);
		pw.println("<br><a href=loging>返回重新登录</a>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
