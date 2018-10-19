package KLM.com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

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

				project.setIdProjet(idProjet);

				project.setIdRouleaux(idRouleaux);
				project.setIdAdhesif(idAdhesif);
				project.setIdUndercoat(idUndercoat);
				project.setIdPeinture(idPeinture);

				String sql2 = "SELECT * FROM rouleaux WHERE idRouleaux = '" + idRouleaux + "'";
				st2 = (Statement) con.createStatement();
				ResultSet result2 = (ResultSet) st.executeQuery(sql2);
				while (result2.next()) {

					roll.setImgR(result2.getString("imgR"));
					roll.setLienR(result2.getString("lienR"));
					roll.setTypeRouleau(result2.getString("TypeRouleau"));
					roll.setPrix(result2.getDouble("prix"));
					roll.setNomRouleau(result2.getString("nomRouleau"));
					System.out.println(roll.getNomRouleau());
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

}
