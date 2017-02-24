<%@ page language="java" import="java.util.*,java.sql.*,model.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

</body>
<%
String u=request.getParameter("username");
String p=request.getParameter("passwd");


UserCl uc=new UserCl();

if(uc.check(u, p)){
	response.sendRedirect("welcome.jsp?username="+u);
}else{
	response.sendRedirect("error.jsp");
}

/*
Class.forName("org.gjt.mm.mysql.Driver");

Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/school", "root", "123");

Statement stmt=conn.createStatement();

ResultSet rs = stmt.executeQuery("select passwd from users where username='"+u+"'");
if(rs.next()){
	
	
	if(rs.getString(1).equals(p)){
		//对
		response.sendRedirect("welcome.jsp?username="+u);
	}else{
		//密码错误
		response.sendRedirect("loging.jsp");
	}
}else{
	//用户名全错
	response.sendRedirect("error.jsp");
}


if(u.equals("lxl")&&p.equals("123")){
	response.sendRedirect("welcome.jsp?username="+u);
}else{
	response.sendRedirect("loging.jsp");
}
*/


%>
</html>