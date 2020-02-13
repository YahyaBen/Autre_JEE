package ma.projet;

public class Specialite {
	
	private static int id=0;
	private String code;
	private String Libelle;
	
	public Specialite(String code, String libelle) {
		this.code = code;
		Libelle = libelle;
		id++;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Specialite " + this.Libelle ;
	}
	
	
	
}
