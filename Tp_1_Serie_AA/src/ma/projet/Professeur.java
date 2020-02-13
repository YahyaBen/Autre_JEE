package ma.projet;

public class Professeur {
	private static int id=0;
	private String nom;
	private String Prenom;
	private String Telephone;
	private String email;
	public Specialite Sp;
	
	
	@Override
	public String toString() {
		return "-" + this.nom.toUpperCase() + " "
				+ this.Prenom.substring(0, 1).toUpperCase() + ""
				+ this.Prenom.substring(1).toLowerCase() + " " + this.email;
	}
	
	public Professeur(String nom, String prenom, String telephone, String email, Specialite sp) {
		this.nom = nom;
		Prenom = prenom;
		Telephone = telephone;
		this.email = email;
		Sp = sp;
		id++;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Specialite getSp() {
		return Sp;
	}
	public void setSp(Specialite sp) {
		Sp = sp;
	}
	public static int getId() {
		return id;
	}
	
}
