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

/**
 * Servlet implementation class DeleteController
 */
@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		int idDelete = Integer.parseInt(id);
		HttpSession session = request.getSession(false);
		int a = (int) session.getAttribute("idP");
		ProjetPeintureDao dao = new ProjetPeintureDao();
		ProjetPeinture projet = new ProjetPeinture();
		
		String delete = dao.deleteCard(a);
		if (delete == "SUCCESS") {
			
			session.setAttribute("idUndercoat", null);
			

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
