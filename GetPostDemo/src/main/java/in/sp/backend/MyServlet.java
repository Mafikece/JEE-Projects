package in.sp.backend;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/mylogin")
public class MyServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String myemail=request.getParameter("name1");
		String mypass=request.getParameter("password");
		
		if(myemail.equals("mafikul@gmail.com") && mypass.equals("Mafik123")){
			
			System.out.println("Success");
		}
		else {
			System.out.println("Failed");
		}
	}

}
