package avecFonctionnaliteSupp;

import java.util.Date;

public class Operation {
	
	@Override
	public String toString() {
		return "Operation [date=" + date + ", type=" + type + ", nomPersonne=" + nomPersonne + ", montant=" + montant
				+ "]";
	}
	Date date ;
	String type ;
	String nomPersonne ;
	float montant ;
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Operation(Date date, String type, String nomPersonne, float montant) {
		super();
		this.date = date;
		this.type = type;
		this.nomPersonne = nomPersonne;
		this.montant = montant;
	}
	public Operation(Date date) {
		super();
		this.date = date;
		
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNomPersonne() {
		return nomPersonne;
	}
	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	
	
}
