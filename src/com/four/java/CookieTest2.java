package com.four.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieTest2
 */
public class CookieTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieTest2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param temp 
	 * @param Cookie 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response, Cookie temp, Object Cookie) {
		response.setContentType("text/html;charset=gbk");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Cookie [] AllCookies=request.getCookies();
		int i=0;
		if(AllCookies!=null){
			for(i=0;i<AllCookies.length;i++);
				Cookie temp1=AllCookies[i];
			if(temp1.getName().equals("zhangsan")){
				String name=temp1.getName();
				pw.println("name:"+name);
			}
		}
		if(AllCookies.length==i){
			pw.println("Cookie没了");
		}else{
			pw.println("不存在张三/Cookie没了");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
