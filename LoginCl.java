package login;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class LoginCl extends HttpServlet {
	public void doGet(HttpServletRequest request,
	 HttpServletResponse response)throws ServletException,IOException{
	 //�����û���������
		String u=request.getParameter("username");
		String p=request.getParameter("passwd");
		//��֤
		if(u.equals("china")&&p.equals("123")) {
			//�Ϸ�,��ת��welcome��
			//response.sendRedirect("/LoginServlet/login/Welcome");
			//����֤�ɹ�����Ϣ��д��session
			//1.�õ�session
			//HttpSession hs=request.getSession(true);
			//�޸�session�Ĵ���ʱ��Ϊ20s
			//hs.setMaxInactiveInterval(20);
			//hs.setAttribute("pass", "ok");
			response.sendRedirect("/LoginServlet/login/Welcome?uname="+u+"&password="+p);
           }else {
					//���Ϸ�����ת����ԭ���桯
					response.sendRedirect("/LoginServlet/login/LoginServlet");
					//дURL,sendRedirect��URLӦ��ʾΪ/webӦ����/servlet��URL
	     				}
				}
	public void doPost(HttpServletRequest request,
		HttpServletResponse response)throws ServletException,IOException{
			this.doGet(request, response);
		}
	 
}
