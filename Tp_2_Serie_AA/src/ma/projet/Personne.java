package ma.projet;

public abstract class Personne {
	protected int id;
	protected String nom;
	protected String prenom;
	protected String mail;
	protected String telephone;
	protected double salaire;
	public static int count=0;
	
	public Personne(int id, String nom, String prenom, String mail, String telephone, double salaire) {
		
		id = count++;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.telephone = telephone;
		this.salaire = salaire;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public static int getCount() {
		return count;
	}
	
	public abstract double calculerSalaire();
}
