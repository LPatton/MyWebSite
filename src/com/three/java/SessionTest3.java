package com.three.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest3
 */
public class SessionTest3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionTest3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=gbk");
		PrintWriter pw=response.getWriter();
		
		HttpSession hs=request.getSession(true);
		hs.setAttribute("Myself", "������");
		hs.setAttribute("others", "����");
		
		pw.println("û��ɾ��ʱ��ֵ��"+hs.getAttribute("Myself"));
		
		hs.removeAttribute("other");
		
		pw.println("ɾ�����Myself��ֵ��"+hs.getAttribute("Myself")+"ɾ����other��ֵ��"+hs.getAttribute("other"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
