package ma.projet.bean;

import ma.projet.Personne;

public class Manager extends Personne {

	private String service;
	public Manager(int id, String nom, String prenom, String mail, String telephone, double salaire,String Sr) {
		super(id, nom, prenom, mail, telephone, salaire);
		this.setService(Sr);
		
	}
	
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}

	@Override
	public double calculerSalaire() {
		return this.salaire = this.salaire +(this.salaire*0.35);
		
	}
	
	
}
