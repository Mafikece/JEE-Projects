package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/submitForm")
public class MyServlet extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String myname=req.getParameter("name1");
		String myemail=req.getParameter("email1");
		
		System.out.println("Name :"+myname);
		System.out.println("Email :"+myemail);
		
		PrintWriter out=resp.getWriter();
		out.println("Name :"+myname);
		out.println("Email :"+myemail);
	}

}
