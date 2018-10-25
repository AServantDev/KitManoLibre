package KLM.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import KLM.com.dao.ProjetPeintureDao;
import KLM.com.model.ProjetPeinture;
import KLM.com.model.Rouleaux;
import KLM.com.util.HibernateUtil;
import KLM.com.model.*;

/**
 * Servlet implementation class ProjetPeintureController
 */
@WebServlet("/ProjetPeintureController")
public class ProjetPeintureController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProjetPeintureController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		int a = (int) session.getAttribute("idP");
		
		ProjetPeinture projet = new ProjetPeinture();
		
		projet.setIdProjetPeinture(a);
		Rouleaux roll = new Rouleaux();
		SousCouche undercoat = new SousCouche();
		Adhesif stripe = new Adhesif();
		Produits peinture = new Produits();
		

		ProjetPeintureDao dao = new ProjetPeintureDao();
		String test = dao.displayProjet(projet, roll, undercoat, stripe, peinture);

		if (test == "SUCCESS") {

			request.setAttribute("projet", projet);
			request.setAttribute("peinture", peinture);
			request.setAttribute("stripe", stripe);
			request.setAttribute("roll", roll);
			request.setAttribute("undercoat", undercoat);
			
			request.getRequestDispatcher("Panier.jsp").forward(request, response);
		}
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
