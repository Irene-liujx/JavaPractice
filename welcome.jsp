<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎界面</title>
</head>
<body>
<h2>欢迎界面</h2><br>
<%
//判断是否存在用户名cookie，存在就输出，不存在就跳转到登录页面
	Cookie cookie = null;
	Cookie[] cookies = null;
	cookies = request.getCookies();
	cookie = getCookieByName(cookies,"username");
if(cookie != null){
	out.print("登陆成功！ welcome!" + cookie.getValue()
	+"!---cookie方式");
}else if (session.getAttribute("username") != null) {
	out.print("登陆成功!   Welcome!" + session.getAttribute("username")
	+ "!---session方式");
}else {
	response.sendRedirect("login.jsp");
	}
%>
<%!
//创建方法，用于查找指定名称的cookie
public static Cookie getCookieByName(Cookie[] cs,String name){
	if(cs == null || cs.length == 0){
		return null;
	}
	for (Cookie c : cs){
		if(name.equals(c.getName())){
			return c;
		}
	}
	return null;
}
%>
</body>
</html>