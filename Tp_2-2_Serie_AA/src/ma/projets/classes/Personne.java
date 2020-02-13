package ma.projets.classes;

public class Personne {
	protected int id;
	private static int count=0;
	protected String nom;
	protected String prenom;
	
	
	public Personne( String nom, String prenom) {
		this.id = count++;
		this.nom = nom;
		this.prenom = prenom;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public static int getCount() {
		return count;
	}


	@Override
	public String toString() {
		return "Classe ->Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
