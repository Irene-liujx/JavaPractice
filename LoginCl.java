package login;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class LoginCl extends HttpServlet {
	public void doGet(HttpServletRequest request,
	 HttpServletResponse response)throws ServletException,IOException{
	 //接受用户名和密码
		String u=request.getParameter("username");
		String p=request.getParameter("passwd");
		//验证
		if(u.equals("china")&&p.equals("123")) {
			//合法,跳转‘welcome’
			//response.sendRedirect("/LoginServlet/login/Welcome");
			//将验证成功的消息，写入session
			//1.得到session
			//HttpSession hs=request.getSession(true);
			//修改session的存在时间为20s
			//hs.setMaxInactiveInterval(20);
			//hs.setAttribute("pass", "ok");
			response.sendRedirect("/LoginServlet/login/Welcome?uname="+u+"&password="+p);
           }else {
					//不合法，跳转‘回原界面’
					response.sendRedirect("/LoginServlet/login/LoginServlet");
					//写URL,sendRedirect的URL应表示为/web应用名/servlet的URL
	     				}
				}
	public void doPost(HttpServletRequest request,
		HttpServletResponse response)throws ServletException,IOException{
			this.doGet(request, response);
		}
	 
}
