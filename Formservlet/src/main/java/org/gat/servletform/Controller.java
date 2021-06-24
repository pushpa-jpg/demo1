package org.gat.servletform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Controller() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getParameter("name") + "<br/>");
		response.getWriter().println(request.getParameter("gender") + "<br/>");

		PrintWriter out = response.getWriter();
		String[] lang = request.getParameterValues("language");
		if (lang != null) {
			for (int i = 0; i < lang.length; i++) {

				out.print(lang[i]);
				out.print("<br/>");
			}
		} else {
			out.print("None Selected");
		}

		response.getWriter().println(request.getParameter("country") + "<br/>");

	}

}
