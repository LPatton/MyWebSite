<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
String snuml=request.getParameter("num1");
String snum2=request.getParameter("num2");

int num1;
int num2;
int result=0;
num1=Integer.parseInt(snuml);
num2=Integer.parseInt(snum2);

String flag=request.getParameter("flag");

if(flag.equals("+")){
	result=num1+num2;
}else if(flag.equals("-")){
	result=num1-num2;
}else if(flag.equals("*")){
	result=num1*num2;
}else if(flag.equals("/")){
	result=num1/num2;
}
 
out.println("计算结果是"+result);

%>

</body>
</html>