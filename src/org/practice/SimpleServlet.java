package org.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "Basic servlet page", urlPatterns = { "/SimpleServlet" }, initParams = {
		@WebInitParam(name = "name", value = "John"), @WebInitParam(name = "age", value = "21") })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		displayInfo(request, response, "GET");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		displayInfo(request, response, "POST");
	}

	private void displayInfo(HttpServletRequest request, HttpServletResponse response, String methodType)
			throws IOException {
		System.out.println("Received info from request : " + request.toString() + " from method : " + methodType);

		PrintWriter writer = response.getWriter();
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();

		String name = null;
		int age = 0;

		if (request.getParameter("name") != null) {
			name = request.getParameter("name");
		} else {
			name = getInitParameter("name");
		}

		//session.setAttribute("user", name);
		context.setAttribute("user", name);

		if (request.getParameter("age") != null) {
			age = Integer.parseInt(request.getParameter("age"));
		} else {
			age = Integer.parseInt(getInitParameter("age"));
		}

		writer.print("Hi " + name + " ! Your age is : " + age);

	}

}
