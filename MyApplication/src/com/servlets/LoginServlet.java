package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/mydata")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h2>");
		if(name.equals("citi")&&pass.equals("citi"))
		{
			writer.println("Welcome To Servlet");
		}
		else {
//			writer.println("Wrong Credentials Please Login Again");
//			writer.println("<form action='mydata' method='post'>");
//			writer.println("USERNAME:<input type='text'name='username'><br>");
//			writer.println("PASSWORD:<input type='text'name='password'><br>");
//			writer.println("<input type='submit' value='Login'>");
//			writer.println("</form>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("form.html");
			dispatcher.forward(request, response);
		}
		writer.println("</h2>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
