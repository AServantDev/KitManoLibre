package KLM.com.controller;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import KLM.com.dao.ProjetPeintureDao;
import KLM.com.model.ProjetPeinture;

/**
 * Servlet implementation class AddPaint
 */
@WebServlet("/AddPaint")
public class AddPaint extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPaint() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		ProjetPeinture projet = new ProjetPeinture();
		int a = (int) session.getAttribute("idP");
		ProjetPeintureDao dao = new ProjetPeintureDao();
		int dim = (int) session.getAttribute("dim");
		String room = (String) session.getAttribute("sdb");
		System.out.println(room);
		
		String color = (String) session.getAttribute("couleur");
		System.out.println(color);
		
		String addColor = dao.addColor(a,dim, color, session, room );
		
		if (addColor == "SUCCESS") {
			System.out.println(color);

			request.setAttribute("projetpeinture", projet);
			

			request.getRequestDispatcher("ProjetPeintureController").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
