package ma.projets.classes;

public class Employer extends Personne{
	
	protected double salaire;

	public Employer(String nom, String prenom, double Sa) {
		super(nom, prenom);
		this.salaire = Sa;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "je Suis "+getNom().toUpperCase()+" "+getPrenom()+" mon salaire est "
				+getSalaire() +" Dh";
	}
	
	

}
