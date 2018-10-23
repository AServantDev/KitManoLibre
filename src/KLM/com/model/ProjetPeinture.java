package KLM.com.model;

public class ProjetPeinture {
	
	private int idProjetPeinture;
	private int idProjet;
	private int idPeinture;
	private int idRouleaux ;
	private int idAdhesif;
	private int idUndercoat;
	
	
	public int getIdProjetPeinture() {
		return idProjetPeinture;
	}
	public void setIdProjetPeinture(int idProjetPeinture) {
		this.idProjetPeinture = idProjetPeinture;
	}
	public int getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}
	public int getIdPeinture() {
		return idPeinture;
	}
	public void setIdPeinture(int idPeinture) {
		this.idPeinture = idPeinture;
	}
	public int getIdRouleaux() {
		return idRouleaux;
	}
	public void setIdRouleaux(int idRouleaux) {
		this.idRouleaux = idRouleaux;
	}
	public int getIdAdhesif() {
		return idAdhesif;
	}
	public void setIdAdhesif(int idAdhesif) {
		this.idAdhesif = idAdhesif;
	}
	public int getIdUndercoat() {
		return idUndercoat;
	}
	public void setIdUndercoat(int idUndercoat) {
		this.idUndercoat = idUndercoat;
	}
	
	public ProjetPeinture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "ProjetPeinture [idProjetPeinture=" + idProjetPeinture + ", idProjet=" + idProjet + ", idPeinture="
				+ idPeinture + ", idRouleaux=" + idRouleaux + ", idAdhesif=" + idAdhesif + ", idUndercoat="
				+ idUndercoat + "]";
	}
	
	
	

}
