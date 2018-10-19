package KLM.com.model;

public class Projet {
	
	private int idProjet;
	private boolean mur;
	private boolean plafond;
	private int surface;
	private String typeProjet;
	private String etatMur;
	private String couleurOrigine;
	private String couleurFinale;
	
	public int getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}
	public boolean isMur() {
		return mur;
	}
	public void setMur(boolean mur) {
		this.mur = mur;
	}
	public boolean isPlafond() {
		return plafond;
	}
	public void setPlafond(boolean plafond) {
		this.plafond = plafond;
	}
	public int getSurface() {
		return surface;
	}
	public void setSurface(int surface) {
		this.surface = surface;
	}
	public String getTypeProjet() {
		return typeProjet;
	}
	public void setTypeProjet(String typeProjet) {
		this.typeProjet = typeProjet;
	}
	public String getEtatMur() {
		return etatMur;
	}
	public void setEtatMur(String etatMur) {
		this.etatMur = etatMur;
	}
	public String getCouleurOrigine() {
		return couleurOrigine;
	}
	public void setCouleurOrigine(String couleurOrigine) {
		this.couleurOrigine = couleurOrigine;
	}
	public String getCouleurFinale() {
		return couleurFinale;
	}
	public void setCouleurFinale(String couleurFinale) {
		this.couleurFinale = couleurFinale;
	}
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Projet [idProjet=" + idProjet + ", mur=" + mur + ", plafond=" + plafond + ", surface=" + surface
				+ ", typeProjet=" + typeProjet + ", etatMur=" + etatMur + ", couleurOrigine=" + couleurOrigine
				+ ", couleurFinale=" + couleurFinale + "]";
	}
	
	

}
