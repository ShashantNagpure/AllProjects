package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowCookieServlet
 */
@WebServlet("/showCookies")
public class ShowCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[]cookies=request.getCookies();
		boolean flag=false;
		Cookie c=null;
		PrintWriter writer=response.getWriter();
		for(Cookie cookie:cookies)
		{
			if(cookie.getName().equals("name"))
			{
				flag=true;
				c=cookie;
			}
		}
		if(flag)
		{
			writer.println("username: "+ c.getValue());
		}
		else
		{
			writer.println("SORRY NO COOKIE FOUND");
		}
	}



}
