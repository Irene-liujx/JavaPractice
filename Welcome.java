package login;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Welcome extends HttpServlet{
  public void doGet(HttpServletRequest request,
	HttpServletResponse response)throws ServletException,IOException{
		response.setCharacterEncoding("gb2312"); 
		//��ȡ��¼��
		String username=request.getParameter("uname");
	  String password=request.getParameter("password");
		 //�õ�session
 // HttpSession hs=request.getSession(true);
  //String val=(String)hs.getAttribute("pass");
  //if(val==null) {   //���ص�¼����
	// response.sendRedirect("/LoginServlet/login/LoginServlet");
  //}else {
	   //������ʾ
	
 		PrintWriter pw=response.getWriter();
		pw.println("<h1>������</h1>");
		pw.println("welcome name="+username+ "password="+password);
		pw.println("<br>");
		pw.println("<a href='/LoginServlet/login/LoginServlet'>�������µ�¼</a>");
		}
  //}
public void doPost(HttpServletRequest request,
	HttpServletResponse response)throws ServletException,IOException{
	this.doGet(request, response);
}
}
