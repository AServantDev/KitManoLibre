package KLM.com.model;

public class Produits {
	
	private int idProduits;
	private String typeProduit;
	private String typeTravaux;
	private double prix;
	private String couleur;
	private String image;
	private String lien;
	private String nomProduit;
	private double contenance;
	private boolean SdB;
	
	public String getTypeProduit() {
		return typeProduit;
	}
	public void setTypeProduit(String typeProduit) {
		this.typeProduit = typeProduit;
	}
	public String getTypeTravaux() {
		return typeTravaux;
	}
	public void setTypeTravaux(String typeTravaux) {
		this.typeTravaux = typeTravaux;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public double getContenance() {
		return contenance;
	}
	public void setContenance(double contenance) {
		this.contenance = contenance;
	}
	public Produits() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getIdProduits() {
		return idProduits;
	}
	public void setIdProduits(int idProduits) {
		this.idProduits = idProduits;
	}
	public boolean isSdB() {
		return SdB;
	}
	public void setSdB(boolean sdB) {
		SdB = sdB;
	}
	@Override
	public String toString() {
		return "Produits [idProduits chez Mano mano=" + idProduits + ", typeProduit=" + typeProduit + ", typeTravaux=" + typeTravaux
				+ ", prix=" + prix + ", couleur=" + couleur + ", lien=" + lien + ", nomProduit="
				+ nomProduit + ", contenance=" + contenance + ", SdB=" + SdB + "]";
	}
	
	
	
	
	
}
