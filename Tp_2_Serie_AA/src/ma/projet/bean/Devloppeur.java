package ma.projet.bean;

import ma.projet.Personne;

public class Devloppeur extends Personne{

	private String specialite;
	public Devloppeur(int id, String nom, String prenom, String mail, String telephone, double salaire,String Sp) {
		super(id, nom, prenom, mail, telephone, salaire);
		this.setSpecialite(Sp);
	
	}
	
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Devloppeur [specialite=" + specialite + "]";
	}

	@Override
	public double calculerSalaire() {
		 return this.salaire = this.salaire +(this.salaire*0.2);
		
	}

}
