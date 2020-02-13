package ma.projets.classes;

public class Etudiant extends Personne{

	private String cne;
	
	public Etudiant(String nom, String prenom,String C) {
		super(nom, prenom);
		this.cne=C;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	@Override
	public String toString() {
		return "je Suis "+getNom().toUpperCase()+" "+getPrenom()+" mon CNE est "
				+getCne() +" .";
	}

}
