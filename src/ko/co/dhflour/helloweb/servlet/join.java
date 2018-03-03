package ko.co.dhflour.helloweb.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/join")
public class join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(
		HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		String gender = request.getParameter("gender");
		String year = request.getParameter("year");
		String[] bobbies = request.getParameterValues("hobby");
		String selfIntro = request.getParameter("self-Intro");
		
		System.out.println(email);
		System.out.println(password);
		System.out.println(gender);
		System.out.println(year);
		if (bobbies != null) {
			for(String hobby : bobbies) {
				System.out.println(hobby);
			}
		}
		
		System.out.println(selfIntro);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
