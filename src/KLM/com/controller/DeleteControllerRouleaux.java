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
 * Servlet implementation class DeleteControllerRouleaux
 */
@WebServlet("/DeleteControllerRouleaux")
public class DeleteControllerRouleaux extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteControllerRouleaux() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		HttpSession session = request.getSession(false);
		int a = (int) session.getAttribute("idP");
		ProjetPeintureDao dao = new ProjetPeintureDao();
		
		
		String delete = dao.deleteRoll(a);
		if (delete == "SUCCESS") {
			
			session.setAttribute("idRouleaux", null);
			

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
