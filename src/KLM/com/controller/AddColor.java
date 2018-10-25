package KLM.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import KLM.com.dao.ProjetPeintureDao;

/**
 * Servlet implementation class AddColor
 */
@WebServlet("/AddColor")
public class AddColor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddColor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession(false);
		int a = (int) session.getAttribute("idP");
		ProjetPeintureDao dao = new ProjetPeintureDao();
		String color = request.getParameter("couleurFinale");
		System.out.println(color);
		session.setAttribute("couleur", color);
		

		String setColor = dao.addColor(a, color);
		
		if (setColor == "SUCCESS") {
			System.out.println(color);

			

			request.getRequestDispatcher("dimensions.jsp").forward(request, response);
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
