package ma.projets.classes;

public class Professeur extends Employer{
	
	private String Specialite;

	public Professeur(String nom, String prenom, double salaire, String Sp) {
		super(nom, prenom, salaire);
		Specialite = Sp;
	}

	public String getSpecialite() {
		return Specialite;
	}

	public void setSpecialite(String specialite) {
		Specialite = specialite;
	}

	@Override
	public String toString() {
		return "je Suis "+getNom().toUpperCase()+" "+getPrenom()+" mon salaire est "
				+getSalaire() +" Dh est ma Specialite est "+getSpecialite();
	}
	
	

}
