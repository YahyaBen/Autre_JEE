package a.b.c;

public class Compte {
	protected int Code;
	protected float Solde;
	
	public Compte() {
		
	}
	
	public Compte(int C ,float S) {
		this.Code=C;
		this.Solde=S;
	}
	
	public void Verser (float V) {
		this.Solde =this.Solde +V;
	}
	
	public void Retirer (float R) throws SoldeInsuufException ,NegativeExce {
		if(R > this.Solde) throw new SoldeInsuufException("Solde insuffisant Weew !!");
		if(R < 0) throw new NegativeExce("Impossible d'entrer entie negative !!");
		this.Solde =this.Solde-R;
		
	}

	public int getCode() {
		return Code;
	}

	public float getSolde() {
		return Solde;
	}
	

}
