package login;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)throws ServletException,IOException{
		//��������������
		response.setContentType("text/html;charset=gb2312");
		PrintWriter pw=response.getWriter();
		//���ص�¼����
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>��¼����</h1>");
		pw.println("<form action=/LoginServlet/login/LoginCl method=post>");
		pw.println("�û���:<input type=text name=username><br>");
		pw.println("��    ��:<input type=password name=passwd><br>");
		pw.println("<input type=submit value=��¼><br>");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
	}
	public void doPost(HttpServletRequest request,
	 HttpServletResponse response)throws ServletException,IOException{
		this.doGet(request,response);
	}
}



