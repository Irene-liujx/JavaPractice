package login;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Welcome extends HttpServlet{
  public void doGet(HttpServletRequest request,
	HttpServletResponse response)throws ServletException,IOException{
		response.setCharacterEncoding("gb2312"); 
		//获取登录名
		String username=request.getParameter("uname");
	  String password=request.getParameter("password");
		 //得到session
 // HttpSession hs=request.getSession(true);
  //String val=(String)hs.getAttribute("pass");
  //if(val==null) {   //返回登录界面
	// response.sendRedirect("/LoginServlet/login/LoginServlet");
  //}else {
	   //正常显示
	
 		PrintWriter pw=response.getWriter();
		pw.println("<h1>主界面</h1>");
		pw.println("welcome name="+username+ "password="+password);
		pw.println("<br>");
		pw.println("<a href='/LoginServlet/login/LoginServlet'>返回重新登录</a>");
		}
  //}
public void doPost(HttpServletRequest request,
	HttpServletResponse response)throws ServletException,IOException{
	this.doGet(request, response);
}
}
