package KLM.com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import KLM.com.model.ProjetPeinture;
import KLM.com.model.Rouleaux;
import KLM.com.model.*;
import KLM.com.util.DbUtil;
import KLM.com.util.HibernateUtil;
import KLM.com.util.CreateConnection;

public class ProjetPeintureDao {

	public ProjetPeinture getProjetPeintureById(int PPeintureId) {

		ProjetPeinture projetPeinture = new ProjetPeinture();
		Transaction trns = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trns = session.beginTransaction();
			String queryString = "from projetPeinture where idProjetPeinture = :idProjetPeinture";
			Query query = session.createQuery(queryString);
			query.setParameter("projetPeinture", PPeintureId);
			projetPeinture = (ProjetPeinture) query.uniqueResult();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		session.close();
		return projetPeinture;
	}

	public String displayProjet(ProjetPeinture project, Rouleaux roll, SousCouche undercoat, Adhesif stripe,
			Produits peinture) {

		String test = "";

		int idProjetPeinture = project.getIdProjetPeinture();

		Connection con = null;
		Statement st = null;
		Statement st2 = null;
		Statement st3 = null;
		Statement st4 = null;
		Statement st5 = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) CreateConnection.createConnection();

			String sql = "SELECT * FROM projetPeinture WHERE idProjetPeinture = '" + idProjetPeinture + "'";
			st = (Statement) con.createStatement();

			ResultSet result = (ResultSet) st.executeQuery(sql);

			while (result.next()) {

				int idProjet = result.getInt("idProjet");
				int idRouleaux = result.getInt("idRouleaux");
				int idAdhesif = result.getInt("idAdhesif");
				int idUndercoat = result.getInt("idUndecoat");
				int idPeinture = result.getInt("idPeinture");
				String couleur = result.getString("couleurFinale");
				int surface = result.getInt("surface");

				project.setIdProjet(idProjet);

				project.setIdRouleaux(idRouleaux);
				project.setIdAdhesif(idAdhesif);
				project.setIdUndercoat(idUndercoat);
				project.setIdPeinture(idPeinture);
				project.setCouleurFinale(couleur);
				project.setSurface(surface);

				String sql2 = "SELECT * FROM rouleaux WHERE idRouleaux = '" + idRouleaux + "'";
				st2 = (Statement) con.createStatement();
				ResultSet result2 = (ResultSet) st.executeQuery(sql2);
				while (result2.next()) {

					roll.setImgR(result2.getString("imgR"));
					roll.setLienR(result2.getString("lienR"));
					roll.setTypeRouleau(result2.getString("TypeRouleau"));
					roll.setPrix(result2.getDouble("prix"));
					roll.setNomRouleau(result2.getString("nomRouleau"));

				}
				String sql3 = "SELECT * FROM Peinture WHERE idProduit = '" + idPeinture + "'";
				st3 = (Statement) con.createStatement();
				ResultSet result3 = (ResultSet) st.executeQuery(sql3);
				while (result3.next()) {

					peinture.setImage(result3.getString("image"));
					peinture.setLien(result3.getString("lien"));
					peinture.setNomProduit(result3.getString("nomProduit"));
					peinture.setPrix(result3.getDouble("prix"));
					peinture.setCouleur(result3.getString("couleur"));
					peinture.setContenance(result3.getDouble("contenance"));

				}
				String sql4 = "SELECT * FROM adhesif WHERE idAdhesif = '" + idAdhesif + "'";
				st4 = (Statement) con.createStatement();
				ResultSet result4 = (ResultSet) st.executeQuery(sql4);
				while (result4.next()) {

					stripe.setImgA(result4.getString("imgA"));
					stripe.setLienA(result4.getString("lienA"));
					stripe.setNomA(result4.getString("nomA"));
					stripe.setPrix(result4.getDouble("prix"));
				}
				String sql5 = "SELECT * FROM sousCouche WHERE idSousCouche = '" + idUndercoat + "'";
				st5 = (Statement) con.createStatement();
				ResultSet result5 = (ResultSet) st.executeQuery(sql5);
				while (result5.next()) {

					undercoat.setImgSC(result5.getString("imgSC"));
					undercoat.setLienSC(result5.getString("lienSC"));
					undercoat.setNomSC(result5.getString("nomSC"));
					undercoat.setPrix(result5.getDouble("prix"));
				}

				test = "SUCCESS";
				System.out.println("ok");

			}

			return test;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return test;

	}

	public String createNewProjetPeinture(ProjetPeinture project, HttpSession session) {

		Connection con = null;
		PreparedStatement pst = null;
		Statement st = null;

		String test = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) CreateConnection.createConnection();

			String query = "insert into projetPeinture(idRouleaux, idAdhesif) values (?,?)";

			pst = con.prepareStatement(query);

			pst.setInt(1, 335307);
			pst.setInt(2, 713473);

			session.setAttribute("idAdhesif", 713473);
			session.setAttribute("idRouleaux", 335307);

			System.out.println();
			// session.setAttribute("idProjet", id);

			int i = pst.executeUpdate();

			String sql = "SELECT * FROM projetPeinture ORDER BY idProjetPeinture DESC LIMIT 1";
			st = (Statement) con.createStatement();

			ResultSet result = (ResultSet) st.executeQuery(sql);

			while (result.next()) {

				int a = result.getInt("idProjetPeinture");
				project.setIdProjetPeinture(a);
				session.setAttribute("idP", a);

			}

			if (i != 0) { // Just to ensure data has been inserted into the database

				project.setIdAdhesif(713473);
				project.setIdRouleaux(335307);

				return "SUCCESS";
			} else {
				System.out.println("Something went wrong...");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return test;

	}

	public String addRoom(int a, String room) {

		Connection con = null;
		PreparedStatement pst = null;

		String test = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) CreateConnection.createConnection();

			String query = "UPDATE projetPeinture SET nomPièce = '" + room + "' WHERE idProjetPeinture = '" + a + "'";

			pst = con.prepareStatement(query); // Making use of prepared statements here to insert bunch
												// of data

			int i = pst.executeUpdate();

			if (i != 0) { // Just to ensure data has been inserted into the database

				return "SUCCESS";
			} else {
				System.out.println("Something went wrong...");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return test;

	}

	public String addColor(int a, String color) {

		Connection con = null;
		PreparedStatement pst = null;

		String test = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) CreateConnection.createConnection();

			String query = "UPDATE projetPeinture SET couleurFinale = '" + color + "' WHERE idProjetPeinture = '" + a
					+ "'";

			pst = con.prepareStatement(query); // Making use of prepared statements here to insert bunch
												// of data

			int i = pst.executeUpdate();

			if (i != 0) { // Just to ensure data has been inserted into the database

				return "SUCCESS";
			} else {
				System.out.println("Something went wrong...");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return test;

	}

	public String addDim(int a, int dim) {

		Connection con = null;
		PreparedStatement pst = null;

		String test = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) CreateConnection.createConnection();

			String query = "UPDATE projetPeinture SET surface = '" + dim + "' WHERE idProjetPeinture = '" + a + "'";

			pst = con.prepareStatement(query); // Making use of prepared statements here to insert bunch
												// of data

			int i = pst.executeUpdate();

			if (i != 0) { // Just to ensure data has been inserted into the database

				return "SUCCESS";
			} else {
				System.out.println("Something went wrong...");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return test;

	}

	public String addColor(int a, int dim, String color, HttpSession session, String nomPiece) {

		Connection con = null;
		PreparedStatement pst = null;
		Statement st = null;

		String sql;

		String test = "";
		System.out.println(nomPiece);
		System.out.println(nomPiece == "cuisine");

		if ((nomPiece.equals("SdB")) || (nomPiece.equals("cuisine"))) {

			sql = "SELECT * FROM Peinture WHERE SdB = true AND couleur LIKE '%" + color + "%' AND contenance = 2.5";
			System.out.println(nomPiece);

		} else {

			if (dim <= 25) {

				sql = "SELECT * FROM Peinture WHERE contenance = 2.5 AND SdB = false AND couleur LIKE '%" + color
						+ "%'";

			} else if ((dim > 25) && (dim <= 50)) {

				sql = "SELECT * FROM Peinture WHERE contenance = 5  AND SdB = false AND couleur LIKE '%" + color + "%'";

			} else {

				sql = "SELECT * FROM Peinture WHERE contenance = 10 AND SdB = false AND couleur LIKE '%" + color + "%'";

			}

		}

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) CreateConnection.createConnection();
			st = (Statement) con.createStatement();

			ResultSet result = (ResultSet) st.executeQuery(sql);

			while (result.next()) {

				int idColor = result.getInt("idProduit");
				session.setAttribute("idColor", idColor);

				String query = "UPDATE projetPeinture SET idPeinture = '" + idColor + "' WHERE idProjetPeinture = '" + a
						+ "'";

				pst = con.prepareStatement(query); // Making use of prepared statements here to insert bunch
													// of data

				int i = pst.executeUpdate();

				if (i != 0) { // Just to ensure data has been inserted into the database

					test = "SUCCESS";
				} else {
					System.out.println("Something went wrong...");
				}

			}

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return test;

	}

	public String addUndercoat(int a, int dim, HttpSession session) {

		Connection con = null;
		PreparedStatement pst = null;
		Statement st = null;

		String sql;

		String test = "";

		if (dim <= 25) {

			sql = "SELECT * FROM sousCouche WHERE contenanceSC = 2.5";
			System.out.println("pouet");

		} else if ((dim > 25) && (dim <= 50)) {

			sql = "SELECT * FROM sousCouche WHERE contenanceSC = 5";
			System.out.println("prout");
		} else {

			sql = "SELECT * FROM sousCouche WHERE contenanceSC = 10";
			System.out.println("zob");
		}
		try

		{

			Class.forName("com.mysql.jdbc.Driver");

			con = (Connection) CreateConnection.createConnection();
			st = (Statement) con.createStatement();

			ResultSet result = (ResultSet) st.executeQuery(sql);

			while (result.next()) {

				int idUndercoat = result.getInt("idSousCouche");
				session.setAttribute("idUndercoat", idUndercoat);

				String query = "UPDATE projetPeinture SET idUndecoat = '" + idUndercoat + "' WHERE idProjetPeinture = '"
						+ a + "'";

				pst = con.prepareStatement(query); // Making use of prepared statements here to insert bunch
													// of data

				int i = pst.executeUpdate();

				if (i != 0) { // Just to ensure data has been inserted into the database

					test = "SUCCESS";
				} else {
					System.out.println("Something went wrong...");
				}

			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return test;

	}
}
