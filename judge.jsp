<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>逻辑判断</title>
</head>
<body>
<%
//防止错误信息重复出现
	session.removeAttribute("kong");
	session.removeAttribute("ywlj");
	session.removeAttribute("cuowu");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
if(username.equals("") || password.equals("")){
	//错误跳转，用户名密码有一项为空就跳转到登录界面，并返回错误信息
	session.setAttribute("kong","<h3>您输入的用户名或密码为空，请重新输入</h3>");
	response.sendRedirect("login.jsp");
}else {
	if(username.matches("[a-zA-Z]{3,12}") && password.matches("[a-zA-Z0-9]{6,12}")){
		if(username.equals("liu") && password.equals("123456")){
			//判断是否两周免登录，是否勾选复选框
			if(request.getParameter("keep")!= null){
				Cookie usernameCookie = new Cookie("username",username);
				usernameCookie.setMaxAge(60 * 60 * 24 * 7 * 2);
				response.addCookie(usernameCookie);
				//response.sendRedirect("welcome.jsp");
			}else{
				session.setAttribute("username",username);
			}
			//登陆成功，跳转到欢迎界面
			response.sendRedirect("welcome.jsp");
		}else {
			//错误跳转，用户名密码有一项不符合业务逻辑就跳转到登录界面，并返回错误信息
			session.setAttribute("cuowu",
					"<h3>您输入的用户名或密码错误，请重新输入</h3>");
			response.sendRedirect("login.jsp");
			}
      }else{
			//错误跳转，用户名密码有一项不符合业务逻辑就跳转到登录界面，并返回错误信息
			session.setAttribute("ywlj",
					"<h3>您输入的用户名或密码不符合规则，请重新输入</h3>");
			response.sendRedirect("login.jsp");
		}
	}
%>
	<br>
</body>
</html>