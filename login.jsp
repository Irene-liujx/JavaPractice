<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
</head>
<body>
	<h2>登录</h2><br>
		<form action = "judge.jsp"method = "post">
		用户名<input name = "username">(只能有字母组成，3~12位)<br>
		密码<input type = "password" name = "password">(6~12位)<br>
		<input type = "checkbox" name = "keep">两周免登录<br>
		<input type = "submit" value = "登录">
		</form>
	<hr>
    ${sessionScope["kong"] }
    ${sessionScope["ywlj"] }
    ${sessionScope["cuowu"] }
</body>
</html>