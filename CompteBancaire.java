package avecFonctionnaliteSupp;

public class CompteBancaire {
	
	
	private String nomPropri�taire ;
	private String categorie ;
	private float solde ;
	public CompteBancaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CompteBancaire( String nomPropri�taire, String categorie, float solde) {
		super();
		
		this.nomPropri�taire = nomPropri�taire;
		this.categorie = categorie;
		this.solde = solde;
	}
	
	
	
	public String getNomPropri�taire() {
		return nomPropri�taire;
	}
	public void setNomPropri�taire(String nomPropri�taire) {
		this.nomPropri�taire = nomPropri�taire;
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
