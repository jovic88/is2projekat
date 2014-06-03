package servlets.korisnik;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlets.ServletUtils;

import managers.LetManager;

import dbmodel.Let;

/**
 * Servlet implementation class PretragaLetova
 */
@WebServlet("/PretragaLetova")
public class PretragaLetova extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PretragaLetova() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("pretraga");
		
		String odAerodrom = request.getParameter("od");
		String doAerodrom = request.getParameter("do");
		String startDate = request.getParameter("startDate");
		String retDate = request.getParameter("retDate");
		
		List<Let> letovi;
		
		try {
			letovi = LetManager.letovi(odAerodrom, doAerodrom, startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			letovi = null;
		}
		
		System.out.println(letovi);
		
		request.getSession().setAttribute("letovi",letovi);
		request.getSession().setAttribute("od",odAerodrom);
		request.getSession().setAttribute("do",doAerodrom);
		request.getSession().setAttribute("startDate", startDate);
		
		ServletUtils.forward("/korisnik/pretraga.jsp", request, response, getServletContext());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
