package metier;

public class Compte {
	private int Code;
	private float Solde;
	public Compte() {
	
	}
	public Compte(int C, float S) {
		this.Code=C;
		this.Solde=S;
	}
	
	public void Verser(float V) {
		this.Solde=this.Solde+V;
	}
	
	public void Retirer(float R) {
		this.Solde=this.Solde-R;
	}
	
	public String toString() {
		return "votre Solde est de : \n"+this.Solde+" Solde du compte N : \n"+this.Code;
			
	}
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	public float getSolde() {
		return Solde;
	}
	public void setSolde(float solde) {
		Solde = solde;
	}
	
	

}
