package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletUtils {

	public static final String DATEFORMAT = "yyyy-MM-dd";

	public static void forward(String dest, HttpServletRequest request, HttpServletResponse response,
			ServletContext servletContext) throws ServletException, IOException {
		RequestDispatcher rd = servletContext.getRequestDispatcher(dest);
		rd.forward(request, response);
	}
	
}
