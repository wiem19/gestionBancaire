package avecFonctionnaliteSupp;

public class CompteBancaire {
	
	
	private String nomPropriétaire ;
	private String categorie ;
	private float solde ;
	public CompteBancaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CompteBancaire( String nomPropriétaire, String categorie, float solde) {
		super();
		
		this.nomPropriétaire = nomPropriétaire;
		this.categorie = categorie;
		this.solde = solde;
	}
	
	
	
	public String getNomPropriétaire() {
		return nomPropriétaire;
	}
	public void setNomPropriétaire(String nomPropriétaire) {
		this.nomPropriétaire = nomPropriétaire;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	
	

}
