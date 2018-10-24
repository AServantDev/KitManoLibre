package KLM.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import KLM.com.dao.ProjetPeintureDao;
import KLM.com.model.Adhesif;
import KLM.com.model.ProjetPeinture;
import KLM.com.model.Rouleaux;
import KLM.com.model.SousCouche;

/**
 * Servlet implementation class CreateNewProjetPeinture
 */
@WebServlet("/CreateNewProjetPeinture")
public class CreateNewProjetPeinture extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateNewProjetPeinture() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		ProjetPeintureDao dao = new ProjetPeintureDao();
		ProjetPeinture peintureProjet = new ProjetPeinture();
		String test = dao.createNewProjetPeinture(peintureProjet, session);
		int a = (int) session.getAttribute("idP");
		if (test == "SUCCESS") {

			System.out.println(a);

			request.getRequestDispatcher("TestChoix.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		ProjetPeintureDao dao = new ProjetPeintureDao();
		ProjetPeinture peintureProjet = new ProjetPeinture();
		String test = dao.createNewProjetPeinture(peintureProjet, session);
		int a = (int) session.getAttribute("idP");
		
		if (test == "SUCCESS") {
			System.out.println(a);

			request.getRequestDispatcher("ChoixPiece.jsp").forward(request, response);
		}

	}

}
