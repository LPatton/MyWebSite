<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>welcome</title>
<script type="text/javascript">

function check(){
	if(form1.num1.value==""){
	alert("输入的数不能为空");
	return false;
	}
	if(Math.round(form1.num1.value)!=form1.num1.value){
		alert("请输入一个数");
		return false;
	}
	if(form1.num2.value==""){
		alert("输入的数不能为空");
		return false;
		}
	if(Math.round(form1.num2.value)!=form1.num2.value){
		alert("请输入一个数");
		return false;
	}
}

</script>
</head>
<h1>我的计算器</h1>
<body>
<form name="form1" action="Rusult.jsp">
请输入第一个数<input type="text" name=num1><br>
<select name="flag">
<option value="+">+</option>
<option value="-">-</option>
<option value="*">*</option>
<option value="/">/</option>
</select>
请输入第二个数<input type="text" name="num2"><br>
<input type="submit" value="计算" onclick="return check()">
</form>

</body>
</html>