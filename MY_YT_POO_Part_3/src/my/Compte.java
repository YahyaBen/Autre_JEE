package my;

public class Compte {
	private int Code;
	private float Solde;
	private static int count=0;
	
	public Compte(){
		this.Code=count++;
	}

	public Compte(float S){
		this.Solde=S;
		this.Code=count++;
	}
	
	public void Verser(float F) {
		this.Solde +=F;
	}
	
	public void Retirer(float R) {
		this.Solde -=R;
	}
	
	public String toString() {
		return " Le code est : \n"+Code+" Le solde est de : \n "+this.Solde+"Le nombre de compte est : "+count;
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

	public static int getCount() {
		return count;
	}
	
}
