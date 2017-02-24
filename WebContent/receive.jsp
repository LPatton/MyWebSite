<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
#s1{
   color:blue
}
#s2{
  color:red
}
#s3{
  color:black
}

</style>
</head>
<body>
<%
    int n =(Integer)session.getAttribute("count");
    if(n==1) { %>
       <span id=s1>联系人访问中的第1次</span>
       <%
    }else if(n==2){
   %>
       <span id=s2>联系人访问中的第2次 </span>
       <%
   }else if(n==3){
 %>
       <span id=s3> 联系人访问中的第3次</span>
        <%
  }
    %>

</body>
</html>